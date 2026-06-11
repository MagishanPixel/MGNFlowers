package io.github.magishanpixel.oddflowers;

import io.github.magishanpixel.oddflowers.init.ModBlocks;
import io.github.magishanpixel.oddflowers.init.ModItems;
import io.github.magishanpixel.oddflowers.misc.Constants;
import io.github.magishanpixel.oddflowers.misc.StringAdder;
import net.blay09.mods.balm.api.module.BalmModule;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.minecraft.resources.ResourceLocation;

public class OddFlowers implements BalmModule {
    public static void init() {

    }

    @Override
    public ResourceLocation getId() {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "common");
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
}