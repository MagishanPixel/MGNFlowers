package io.github.magishanpixel.mgnflowers.datagen.world;

import io.github.magishanpixel.mgnflowers.worldgen.ModKeyFeatures;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class PlacedFeatureBootstrap {
    public static void boot(BootstrapContext<PlacedFeature> context) {
        var config = context.lookup(Registries.CONFIGURED_FEATURE);

        basicPlaced(context, config, ModKeyFeatures.ROMENTA_PATCH);
        basicPlaced(context, config, ModKeyFeatures.TWIN_POPPY_PATCH);
        basicPlaced(context, config, ModKeyFeatures.DANDELION_BED_PATCH, 20);
        basicPlaced(context, config, ModKeyFeatures.TALL_ALLIUM_PATCH, 4);
        basicPlaced(context, config, ModKeyFeatures.TALL_TULIP_PATCH);
        basicPlaced(context, config, ModKeyFeatures.SUNFLOWER_BED_PATCH, 7);
        basicPlaced(context, config, ModKeyFeatures.WATER_HYACINTH_PATCH, 3);
        basicPlaced(context, config, ModKeyFeatures.WATER_POPPY_PATCH, 3);

        basicPlaced(context, config, ModKeyFeatures.VINE_LOTUSES, 8);

        basicPlaced(context, config, ModKeyFeatures.DARK_FOREST_FLOWER_PATCH, 15);
        basicPlaced(context, config, ModKeyFeatures.CYCLAMEN_PATCH, 14);

        basicPlaced(context, config, ModKeyFeatures.WELWITSCHIA_PATCH);
        basicPlaced(context, config, ModKeyFeatures.SAND_VERBENA_PATCH, 48);

        basicPlaced(context, config, ModKeyFeatures.TORCH_GINGER_PATCH, 15);

        basicPlaced(context, config, ModKeyFeatures.WOOD_SORREL_PATCH, 15);
        basicPlaced(context, config, ModKeyFeatures.TAIGA_FLOWER_PATCH);

        basicPlaced(context, config, ModKeyFeatures.FLOWER_FOREST_PATCH, 9);
        basicPlaced(context, config, ModKeyFeatures.HYACINTH_PATCH, 9);

        basicPlaced(context, config, ModKeyFeatures.JUNGLE_FLOWER_PATCH);
        basicPlaced(context, config, ModKeyFeatures.GINGER_LILY_PATCH);
        basicPlaced(context, config, ModKeyFeatures.SAVANNA_IRIS_PATCH);
        basicPlaced(context, config, ModKeyFeatures.WILD_DAGGA_PATCH);

        basicPlaced(context, config, ModKeyFeatures.GLACIER_LILYS_PATCH);
        basicPlaced(context, config, ModKeyFeatures.WINTER_ACONITE_PATCH);

        basicPlaced(context, config, ModKeyFeatures.RARE_BEE_BALM, 120);

        register(context, config, ModKeyFeatures.LUSH_FLOWERS_PATCH, List.of(CountPlacement.of(125), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));

    }

    private static void basicPlaced(BootstrapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?,?>> config, ModKeyFeatures.KeyFeature keyFeature) {
        basicPlaced(context,config,keyFeature, 24);
    }

    private static void basicPlaced(BootstrapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?,?>> config, ModKeyFeatures.KeyFeature keyFeature, int chance) {
        register(context,keyFeature.placedFeature(), config.getOrThrow(keyFeature.config()),
                List.of(RarityFilter.onAverageOnceEvery(chance), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()
                ));
    }

    private static void register(BootstrapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?,?>> config, ModKeyFeatures.KeyFeature keyFeature, List<PlacementModifier> modifiers) {
        register(context, keyFeature.placedFeature(), config.getOrThrow(keyFeature.config()), modifiers);
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
