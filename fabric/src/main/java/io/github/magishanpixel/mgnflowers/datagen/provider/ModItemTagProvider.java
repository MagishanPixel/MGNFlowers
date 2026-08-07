package io.github.magishanpixel.mgnflowers.datagen.provider;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.init.ModTags;
import io.github.magishanpixel.mgnflowers.misc.FlowerProperty;
import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
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

public class ModItemTagProvider extends FabricTagProvider<Item> {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.ITEM, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        if (MGNFlowers.dataGenList != null) {
            for (Map.Entry<String, FlowerProperty> entry : MGNFlowers.dataGenList.entrySet()) {
                Item item = BuiltInRegistries.BLOCK.get(MGNFlowers.newId(entry.getKey())).asItem();
                FlowerProperty p = entry.getValue();

                getOrCreateTagBuilder(ItemTags.BEE_FOOD).add(item);
                getOrCreateTagBuilder(ItemTags.FLOWERS).add(item);
                getOrCreateTagBuilder(ModTags.ANIMAL_FOODS).add(item);

                if (!p.notSmallFlower) {
                    getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS).add(item);
                }

            }
        }
    }
}
