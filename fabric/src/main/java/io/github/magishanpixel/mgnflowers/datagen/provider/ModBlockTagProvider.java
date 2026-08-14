package io.github.magishanpixel.mgnflowers.datagen.provider;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.misc.FlowerProperty;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        for (Map.Entry<String, FlowerProperty> entry: MGNFlowers.dataGenList.entrySet()) {
            Block block = BuiltInRegistries.BLOCK.getValue(MGNFlowers.newId(entry.getKey()));
            FlowerProperty p = entry.getValue();


            valueLookupBuilder(BlockTags.FLOWERS).add(block);
            valueLookupBuilder(BlockTags.SWORD_EFFICIENT).add(block);


            if (!p.notSmallFlower) {
                valueLookupBuilder(BlockTags.SMALL_FLOWERS).add(block);
                valueLookupBuilder(BlockTags.ENDERMAN_HOLDABLE).add(block);
            }
        }
    }
}
