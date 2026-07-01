package io.github.magishanpixel.mgnflowers.datagen.world;

import io.github.magishanpixel.mgnflowers.worldgen.ModKeyFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.material.Fluids;

import java.util.List;

public class PlacedFeatureBootstrap {
    public static void boot(BootstrapContext<PlacedFeature> context) {
        var config = context.lookup(Registries.CONFIGURED_FEATURE);

        basicPlaced(context, config, ModKeyFeatures.ROMENTA_PATCH);
        basicPlaced(context, config, ModKeyFeatures.TWIN_POPPY_PATCH);
        basicPlaced(context, config, ModKeyFeatures.DANDELION_BED_PATCH, 20);
        basicPlaced(context, config, ModKeyFeatures.TALL_ALLIUM_PATCH);
        basicPlaced(context, config, ModKeyFeatures.TALL_TULIP_PATCH);
        basicPlaced(context, config, ModKeyFeatures.SUNFLOWER_BED_PATCH, 7);
        basicPlaced(context, config, ModKeyFeatures.WATER_HYACINTH_PATCH, 3);
        basicPlaced(context, config, ModKeyFeatures.WATER_POPPY_PATCH, 3);

        register(context, config, ModKeyFeatures.VINE_LOTUSES, List.of(
                RarityFilter.onAverageOnceEvery(8),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE
        ));

        basicPlaced(context, config, ModKeyFeatures.DARK_FOREST_FLOWER_PATCH, 15);
    }

    private static void basicPlaced(BootstrapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?,?>> config, ModKeyFeatures.KeyFeature keyFeature) {
        basicPlaced(context,config,keyFeature, 32);
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
