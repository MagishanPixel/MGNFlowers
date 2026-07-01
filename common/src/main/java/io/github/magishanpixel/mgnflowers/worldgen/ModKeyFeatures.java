package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModKeyFeatures {
    public static final KeyFeature ROMENTA_PATCH = of("romenta_patch");
    public static final KeyFeature TWIN_POPPY_PATCH = of("twin_poppy_patch");

    public static final KeyFeature DANDELION_BED_PATCH = of("dandelion_bed_patch");
    public static final KeyFeature SUNFLOWER_BED_PATCH = of("sunflower_bed_patch");
    public static final KeyFeature WATER_HYACINTH_PATCH = of("water_hyacinth_patch");
    public static final KeyFeature WATER_POPPY_PATCH = of("water_poppy_patch");

    public static final KeyFeature TALL_TULIP_PATCH = of("tall_tulip_patch");
    public static final KeyFeature TALL_ALLIUM_PATCH = of("tall_allium_patch");

    public static final KeyFeature DARK_FOREST_FLOWER_PATCH = of("dark_forest_flower_patch");

    public static final KeyFeature VINE_LOTUSES = of("vine_lotuses");

    public record KeyFeature(ResourceKey<ConfiguredFeature<?,?>> config, ResourceKey<PlacedFeature> placedFeature) { }

    private static KeyFeature of(String name) {
        return new KeyFeature(ResourceKey.create(Registries.CONFIGURED_FEATURE, MagishanLib.newId(name)), ResourceKey.create(Registries.PLACED_FEATURE, MagishanLib.newId(name)));
    }
}
