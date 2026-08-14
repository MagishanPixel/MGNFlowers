package io.github.magishanpixel.mgnflowers.datagen.provider;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.init.ModTags;
import io.github.magishanpixel.mgnflowers.misc.FlowerProperty;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        if (MGNFlowers.dataGenList != null) {
            for (Map.Entry<String, FlowerProperty> entry : MGNFlowers.dataGenList.entrySet()) {
                Item item = BuiltInRegistries.BLOCK.getValue(MGNFlowers.newId(entry.getKey())).asItem();
                FlowerProperty p = entry.getValue();

                valueLookupBuilder(ItemTags.BEE_FOOD).add(item);
                valueLookupBuilder(ItemTags.FLOWERS).add(item);
                valueLookupBuilder(ModTags.ANIMAL_FOODS).add(item);

                if (!p.notSmallFlower) {
                    valueLookupBuilder(ItemTags.SMALL_FLOWERS).add(item);
                }

            }
        }
    }
}
