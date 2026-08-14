package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.worldgen.features.*;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.NoiseTallerFlowerConfig;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.TallerFlowerConfig;
import net.blay09.mods.balm.core.BalmRegistrar;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModFeatures {
    public static Feature<TallerFlowerConfig> TALLER_FLOWER_FEATURE = new TallerFlowerFeature(TallerFlowerConfig.CODEC);
    public static Feature<NoiseTallerFlowerConfig> NOISE_TALLER_FLOWER_FEATURE = new NoiseTallerFlowerFeature(NoiseTallerFlowerConfig.CODEC);
    public static Feature<NoneFeatureConfiguration> VINE_LOTUS_FEATURE = new VineLotusFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> LUSH_FLOWERS_FEATURE = new LushFlowersFeature(NoneFeatureConfiguration.CODEC);
    public static Feature<NoneFeatureConfiguration> LUSH_VINE_LOTUS_FEATURE = new LushVineLotusFeature(NoneFeatureConfiguration.CODEC);

    public static void boot(BalmRegistrar.Scoped<Feature<?>> reg) {
        reg.register("taller_flower_feature", (v) -> TALLER_FLOWER_FEATURE);
        reg.register("vine_lotus_feature", (v) -> NOISE_TALLER_FLOWER_FEATURE);
        reg.register("noise_taller_flower_feature", (v) -> VINE_LOTUS_FEATURE);
        reg.register("lush_flowers_feature", (v) -> LUSH_FLOWERS_FEATURE);
        reg.register("lush_vine_lotus_feature", (v) -> LUSH_VINE_LOTUS_FEATURE);
    }
}
