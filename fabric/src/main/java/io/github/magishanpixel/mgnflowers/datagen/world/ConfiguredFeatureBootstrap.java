package io.github.magishanpixel.mgnflowers.datagen.world;

import io.github.magishanpixel.mgnflowers.block.CustomFlowerBedBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.worldgen.ModFeatures;
import io.github.magishanpixel.mgnflowers.worldgen.ModKeyFeatures;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.NoiseTallerFlowerConfig;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.TallerFlowerConfig;
import io.github.magishanpixel.mgnflowers.worldgen.features.provider.NoiseBlockProvider;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseBasedStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseThresholdProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.ArrayList;
import java.util.List;

public class ConfiguredFeatureBootstrap {
    public static void boot(BootstrapContext<ConfiguredFeature<?,?>> context) {

        createPatch(context, ModKeyFeatures.ROMENTA_PATCH.config(), 32, 6, 2, quickBlockStateList(
                ModBlocks.BLUE_ROMENTA,
                ModBlocks.PINK_ROMENTA,
                ModBlocks.ORANGE_ROMENTA
        ));

        createPatch(context, ModKeyFeatures.TWIN_POPPY_PATCH.config(), 48, 8, 2, quickBlockStateList(
                ModBlocks.PINK_TWIN_POPPY,
                ModBlocks.ORANGE_TWIN_POPPY,
                ModBlocks.BLUE_TWIN_POPPY,
                ModBlocks.RED_TWIN_POPPY,
                ModBlocks.WHITE_TWIN_POPPY
        ));

        createBedPatch(context, ModKeyFeatures.DANDELION_BED_PATCH.config(), 48, 6, 2, ModBlocks.DANDELION_BED.asBlock(), 4);
        createPatch(context, ModKeyFeatures.SUNFLOWER_BED_PATCH.config(), 75, 6, 2, builderBedPatch(ModBlocks.SUNFLOWER_BED.asBlock(), 4, 2).add(Blocks.SUNFLOWER.defaultBlockState()));

        createPatch(context, ModKeyFeatures.TALL_TULIP_PATCH.config(), 48, 7, 2,
                ModFeatures.TALLER_FLOWER_FEATURE,
                new TallerFlowerConfig(4,
                        List.of(
                                ModBlocks.PURPLE_TALL_TULIP.asHolder(),
                                ModBlocks.TURQUOISE_TALL_TULIP.asHolder(),
                                ModBlocks.PINK_TALL_TULIP.asHolder(),
                                ModBlocks.RED_TALL_TULIP.asHolder(),
                                ModBlocks.WHITE_TALL_TULIP.asHolder(),
                                ModBlocks.ORANGE_TALL_TULIP.asHolder()
                        ))
        );

        createPatch(context, ModKeyFeatures.TALL_ALLIUM_PATCH.config(), 56, 7, 2,
                ModFeatures.NOISE_TALLER_FLOWER_FEATURE,
                new NoiseTallerFlowerConfig(4,
                        2345L,
                        new NormalNoise.NoiseParameters(-10, (double)1.0F, new double[0]),
                        1.0F,
                        List.of(
                                ModBlocks.TALL_ALLIUM.asHolder(),
                                ModBlocks.BLUE_TALL_ALLIUM.asHolder()
                        ))
        );

        createPatch(context, ModKeyFeatures.VINE_LOTUSES.config(), 15, 9, 1, ModFeatures.VINE_LOTUS_FEATURE, new NoneFeatureConfiguration());

        register(context, ModKeyFeatures.WATER_HYACINTH_PATCH.config(), Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(
                Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(new WeightedStateProvider(builderBedPatch(ModBlocks.WATER_HYACINTH.asBlock(), 4))),
                List.of(Blocks.WATER)
        ));

        register(context, ModKeyFeatures.WATER_POPPY_PATCH.config(), Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(
                Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(new WeightedStateProvider(builderBedPatch(ModBlocks.WATER_POPPY.asBlock(), 4))),
                List.of(Blocks.WATER)
        ));

        createPatch(context, ModKeyFeatures.DARK_FOREST_FLOWER_PATCH.config(), 54, 7, 2, quickBlockStateList(
                ModBlocks.IRIS,
                ModBlocks.MOTH_IRIS,
                ModBlocks.BLUE_LACECAP_HYDRANGEA,
                ModBlocks.PINK_LACECAP_HYDRANGEA,
                ModBlocks.WHITE_LACECAP_HYDRANGEA,
                ModBlocks.HOLLOW_BLEEDING_QUADHEART
        ));

        createPatch(context, ModKeyFeatures.WELWITSCHIA_PATCH.config(), 16, 5, 2, List.of(ModBlocks.WELWITSCHIA.defaultBlockState()));

        createPatch(context, ModKeyFeatures.CYCLAMEN_PATCH.config(), 64, 6, 2, quickBlockStateList(
                ModBlocks.PINK_CYCLAMEN,
                ModBlocks.WHITE_CYCLAMEN
        ));

        createBedPatch(context, ModKeyFeatures.SAND_VERBENA_PATCH.config(), 100, 5, 2, ModBlocks.SAND_VERBENA.asBlock(), 4);
        createBedPatch(context, ModKeyFeatures.TORCH_GINGER_PATCH.config(), 78, 5, 2, ModBlocks.TORCH_GINGER.asBlock(), 3);
        createPatch(context, ModKeyFeatures.JUNGLE_FLOWER_PATCH.config(), 64, 6, 2, quickBlockStateList(
                ModBlocks.BIRD_OF_PARADISE,
                ModBlocks.FIRE_LILY
        ));
        createPatch(context, ModKeyFeatures.GINGER_LILY_PATCH.config(), 64, 6, 2,
                ModFeatures.TALLER_FLOWER_FEATURE,
                new TallerFlowerConfig(3,
                        List.of(
                                ModBlocks.ORANGE_GINGER_LILY.asHolder(),
                                ModBlocks.RED_GINGER_LILY.asHolder(),
                                ModBlocks.WHITE_GINGER_LILY.asHolder(),
                                ModBlocks.PINK_GINGER_LILY.asHolder()
                        ))
        );

        createPatch(context, ModKeyFeatures.TAIGA_FLOWER_PATCH.config(), 48, 7, 2, quickBlockStateList(
                ModBlocks.TRILLIUM
        ));

        createBedPatch(context, ModKeyFeatures.WOOD_SORREL_PATCH.config(), 78, 5, 2, ModBlocks.WOOD_SORREL.asBlock(), 4);

        createPatch(context, ModKeyFeatures.FLOWER_FOREST_PATCH.config(), 96, 6, 2,
                Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(new NoiseProvider(2345L, new NormalNoise.NoiseParameters(0, (double)1.0F, 0), 0.020833334F, quickBlockStateList(
                        ModBlocks.ORANGE_ROMENTA,
                        ModBlocks.PINK_ROMENTA,
                        ModBlocks.BLUE_ROMENTA,
                        ModBlocks.BLUE_TWIN_POPPY,
                        ModBlocks.RED_TWIN_POPPY,
                        ModBlocks.PINK_TWIN_POPPY,
                        ModBlocks.ORANGE_TWIN_POPPY,
                        ModBlocks.BLUE_HYACINTH,
                        ModBlocks.PINK_HYACINTH,
                        ModBlocks.RED_HYACINTH,
                        ModBlocks.PURPLE_HYACINTH,
                        ModBlocks.YELLOW_HYACINTH,
                        ModBlocks.WHITE_HYACINTH
                )))
        );

        createPatch(context, ModKeyFeatures.SAVANNA_IRIS_PATCH.config(), 32, 6, 2, quickBlockStateList(ModBlocks.SAVANNAH_SUNSET_IRIS));
        createPatch(context, ModKeyFeatures.WILD_DAGGA_PATCH.config(), 48, 7, 2, ModFeatures.TALLER_FLOWER_FEATURE, new TallerFlowerConfig(5, List.of(ModBlocks.WILD_DAGGA.asHolder())));
    }

    private static List<BlockState> quickBlockStateList(DeferredBlock... blocks) {
        List<BlockState> states = new ArrayList<>();

        for (DeferredBlock v : blocks) {
            states.add(v.defaultBlockState());
        }

        return states;
    }


    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void createPatch(BootstrapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, int tries, int xSpread, int ySpread, F feature, FC configuration) {
        register(context, key, Feature.FLOWER, new RandomPatchConfiguration(tries, xSpread, ySpread, PlacementUtils.onlyWhenEmpty(feature, configuration)));
    }

    private static void createPatch(BootstrapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, int tries, int xSpread, int ySpread, SimpleWeightedRandomList.Builder<BlockState> builder) {
        createPatch(context, key, tries, xSpread, ySpread, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(builder)));
    }

    private static void createPatch(BootstrapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, int tries, int xSpread, int ySpread, List<BlockState> list) {
        SimpleWeightedRandomList.Builder<BlockState> builder = SimpleWeightedRandomList.builder();

        for (BlockState state : list) {
            builder.add(state);
        }

        createPatch(context, key, tries, xSpread, ySpread, builder);
    }

    private static void createBedPatch(BootstrapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, int tries, int xSpread, int ySpread, Block block, int maxPetal) {
        createPatch(context, key, tries, xSpread, ySpread, builderBedPatch(block, maxPetal));
    }

    private static SimpleWeightedRandomList.Builder<BlockState> builderBedPatch(Block block, int maxPetal) {
        return builderBedPatch(block, maxPetal, 1);
    }

    private static SimpleWeightedRandomList.Builder<BlockState> builderBedPatch(Block block, int maxPetal, int weight) {
        SimpleWeightedRandomList.Builder<BlockState> builder = SimpleWeightedRandomList.builder();

        for (Direction dir : List.of(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)) {
            for (int i = 1; i <= maxPetal; i++) {
                builder.add(block.defaultBlockState().setValue(CustomFlowerBedBlock.FACING, dir).setValue(CustomFlowerBedBlock.AMOUNT, i), weight);
            }
        }

        return builder;
    }


    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
