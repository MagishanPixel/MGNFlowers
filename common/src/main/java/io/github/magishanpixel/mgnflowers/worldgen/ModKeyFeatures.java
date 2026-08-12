package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModKeyFeatures {
    public static final KeyFeature TWIN_POPPY_PATCH = of("twin_poppy_patch");

    public static final KeyFeature DANDELION_BED_PATCH = of("dandelion_bed_patch");
    public static final KeyFeature SUNFLOWER_BED_PATCH = of("sunflower_bed_patch");
    public static final KeyFeature TALL_TULIP_PATCH = of("tall_tulip_patch");

    public static final KeyFeature WATER_HYACINTH_PATCH = of("water_hyacinth_patch");
    public static final KeyFeature WATER_POPPY_PATCH = of("water_poppy_patch");

    public static final KeyFeature TALL_ALLIUM_PATCH = of("tall_allium_patch");

    public static final KeyFeature DARK_FOREST_FLOWER_PATCH = of("dark_forest_flower_patch");
    public static final KeyFeature CYCLAMEN_PATCH = of("cyclamen_patch");

    public static final KeyFeature WELWITSCHIA_PATCH = of("welwitschia_patch");
    public static final KeyFeature SAND_VERBENA_PATCH = of("sand_verbena_patch");

    public static final KeyFeature VINE_LOTUSES = of("vine_lotuses");

    public static final KeyFeature TORCH_GINGER_PATCH = of("torch_ginger_patch");
    public static final KeyFeature JUNGLE_FLOWER_PATCH = of("jungle_flower_patch");
    public static final KeyFeature GINGER_LILY_PATCH = of("ginger_lily_patch");

    public static final KeyFeature TAIGA_FLOWER_PATCH = of("taiga_flower_patch");
    public static final KeyFeature WOOD_SORREL_PATCH = of("wood_sorrel_patch");

    public static final KeyFeature FLOWER_FOREST_PATCH = of("flower_forest_patch");
    public static final KeyFeature HYACINTH_PATCH = of("hyacinth_patch");

    public static final KeyFeature SAVANNA_IRIS_PATCH = of("savanna_iris_patch");
    public static final KeyFeature GLACIER_LILYS_PATCH = of("glacier_lilys_patch");
    public static final KeyFeature WINTER_ACONITE_PATCH = of("winter_aconite_patch");

    public static final KeyFeature RARE_BEE_BALM = of("rare_bee_balm");

    public static final KeyFeature LUSH_FLOWERS_PATCH = of("lush_flowers_patch");
    public static final KeyFeature LUSH_VINE_LOTUSES = of("lush_vine_lotuses");

    public static final KeyFeature CANDY_BLEEDING_HEART_PATCH = of("candy_bleeding_heart_patch");

    public record KeyFeature(ResourceKey<ConfiguredFeature<?,?>> config, ResourceKey<PlacedFeature> placedFeature) { }

    private static KeyFeature of(String name) {
        return new KeyFeature(ResourceKey.create(Registries.CONFIGURED_FEATURE, MGNFlowers.newId(name)), ResourceKey.create(Registries.PLACED_FEATURE, MGNFlowers.newId(name)));
    }
}
