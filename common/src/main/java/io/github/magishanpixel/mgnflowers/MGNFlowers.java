package io.github.magishanpixel.mgnflowers;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.init.ModItems;
import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import io.github.magishanpixel.mgnflowers.worldgen.ModFeatures;
import io.github.magishanpixel.mgnflowers.worldgen.ModWorldGen;
import net.blay09.mods.balm.api.BalmRegistries;
import net.blay09.mods.balm.api.module.BalmModule;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.blay09.mods.balm.core.BalmRegistrar;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;

public class MGNFlowers implements BalmModule {
    public static void init() {}

    @Override
    public ResourceLocation getId() {
        return ResourceLocation.fromNamespaceAndPath(MGNConstants.MOD_ID, "common");
    }

    @Override
    public void registerBlocks(BalmBlockRegistrar factory) {
        ModBlocks.init(factory);
    }

    @Override
    public void registerCreativeModeTabs(BalmCreativeModeTabRegistrar creativeModeTabs) {
        ModItems.init(creativeModeTabs);
    }

    @Override
    public void registerItems(BalmItemRegistrar items) {
        ModItems.init(items);
    }

    @Override
    public void registerWorldGen(BalmWorldGen worldGen) {
        ModWorldGen.boot(worldGen);
    }

    @Override
    public void registerAdditional(BalmRegistrar registrar) {
        ModFeatures.boot(registrar.scoped(Registries.FEATURE, MGNConstants.MOD_ID));
    }
}