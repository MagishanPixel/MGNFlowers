package io.github.magishanpixel.mgnflowers;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.init.ModItems;
import io.github.magishanpixel.mgnflowers.misc.FlowerProperty;
import io.github.magishanpixel.mgnflowers.worldgen.ModFeatures;
import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.item.BalmItems;
import net.blay09.mods.balm.api.module.BalmModule;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MGNFlowers implements BalmModule {
    public static final Map<String, FlowerProperty> dataGenList = MGNConstants.isDevelopment ? new HashMap<>() : null;

    public static final Logger logger = LoggerFactory.getLogger(MGNFlowers.class);

    public static final String MOD_ID = "mgnflowers";

    @Override
    public void initialize() {}

    @Override
    public void registerItems(BalmItems items) {
        ModItems.init(items);
    }

    @Override
    public void registerBlocks(BalmBlocks blocks) {
        ModBlocks.init(blocks);
    }

    @Override
    public ResourceLocation getId() {
        return MGNConstants.newId("common");
    }

    @Override
    public void registerWorldGen(BalmWorldGen worldGen) {
        ModFeatures.boot(worldGen);
    }
}
