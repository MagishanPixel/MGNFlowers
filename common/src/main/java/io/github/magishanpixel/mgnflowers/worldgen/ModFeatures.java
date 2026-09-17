package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import io.github.magishanpixel.mgnflowers.worldgen.features.*;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.NoiseTallerFlowerConfig;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.TallerFlowerConfig;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModFeatures {
    public static Feature<TallerFlowerConfig> TALLER_FLOWER_FEATURE = new TallerFlowerFeature(TallerFlowerConfig.CODEC);
    public static Feature<NoiseTallerFlowerConfig> NOISE_TALLER_FLOWER_FEATURE = new NoiseTallerFlowerFeature(NoiseTallerFlowerConfig.CODEC);
    public static Feature<NoneFeatureConfiguration> VINE_LOTUS_FEATURE = new VineLotusFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> LUSH_FLOWERS_FEATURE = new LushFlowersFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> LUSH_VINE_LOTUS_FEATURE = new LushVineLotusFeature(NoneFeatureConfiguration.CODEC);

    public static void boot(BalmWorldGen reg) {
        reg.registerFeature(MGNConstants.newId("taller_flower_feature"), () -> TALLER_FLOWER_FEATURE);
        reg.registerFeature(MGNConstants.newId("vine_lotus_feature"), () -> NOISE_TALLER_FLOWER_FEATURE);
        reg.registerFeature(MGNConstants.newId("noise_taller_flower_feature"), () -> VINE_LOTUS_FEATURE);
        reg.registerFeature(MGNConstants.newId("lush_flowers_feature"), () -> LUSH_FLOWERS_FEATURE);
        reg.registerFeature(MGNConstants.newId("lush_vine_lotus_feature"), () -> LUSH_VINE_LOTUS_FEATURE);
    }
}
