package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import io.github.magishanpixel.mgnflowers.worldgen.features.NoiseTallerFlowerFeature;
import io.github.magishanpixel.mgnflowers.worldgen.features.TallerFlowerFeature;
import io.github.magishanpixel.mgnflowers.worldgen.features.VineLotusFeature;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.NoiseTallerFlowerConfig;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.TallerFlowerConfig;
import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModFeatures {
    public static DeferredObject<Feature<TallerFlowerConfig>> TALLER_FLOWER_FEATURE;
    public static DeferredObject<Feature<NoiseTallerFlowerConfig>> NOISE_TALLER_FLOWER_FEATURE;
    public static DeferredObject<Feature<NoneFeatureConfiguration>> VINE_LOTUS_FEATURE;

    public static void boot(BalmWorldGen worldGen) {
        TALLER_FLOWER_FEATURE = worldGen.registerFeature(MagishanLib.newId("taller_flower_feature"), () -> new TallerFlowerFeature(TallerFlowerConfig.CODEC));
        VINE_LOTUS_FEATURE = worldGen.registerFeature(MagishanLib.newId("vine_lotus_feature"), () -> new VineLotusFeature(NoneFeatureConfiguration.CODEC));
        NOISE_TALLER_FLOWER_FEATURE = worldGen.registerFeature(MagishanLib.newId("noise_taller_flower_feature"), () -> new NoiseTallerFlowerFeature(NoiseTallerFlowerConfig.CODEC));
    }

    public static ResourceKey<Feature<?>> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, MagishanLib.newId(name));
    }
}
