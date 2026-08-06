package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.blay09.mods.balm.api.world.BiomePredicate;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModWorldGen {
    public static void boot(BalmWorldGen worldGen) {
        worldGen.modifyBiome(MagishanLib.newId("flower_forest_patches"),matches(ModTags.IS_FLOWER_FOREST),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.FLOWER_FOREST_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.HYACINTH_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.RARE_BEE_BALM.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("snowy_flowers"),matches(Biomes.SNOWY_TAIGA),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.GLACIER_LILYS_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WINTER_ACONITE_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("meadow_flowers"), matches(Biomes.MEADOW),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TALL_ALLIUM_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("plains_flowers"), matches(ModTags.IS_PLAINS),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TWIN_POPPY_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TALL_TULIP_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("sunflower_flowers"), matches(Biomes.SUNFLOWER_PLAINS),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.SUNFLOWER_BED_PATCH.placedFeature());
                }
        );


        worldGen.modifyBiome(MagishanLib.newId("swamp_flowers"), matches(ModTags.IS_SWAMP),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.VINE_LOTUSES.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WATER_POPPY_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WATER_HYACINTH_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("dark_forest_flowers"), matches(Biomes.DARK_FOREST),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.DARK_FOREST_FLOWER_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.CYCLAMEN_PATCH.placedFeature());
                }
        );


        worldGen.modifyBiome(MagishanLib.newId("desert_flowers"), matches(ModTags.IS_DESERT),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WELWITSCHIA_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.SAND_VERBENA_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("jungle_flowers"), matches(ModTags.IS_JUNGLE),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.JUNGLE_FLOWER_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TORCH_GINGER_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("sparse_jungle_flower"), matches(Biomes.SPARSE_JUNGLE),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.GINGER_LILY_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("taiga_flowers"), (resourceLocation, biome) -> biome.is(ModTags.IS_TAIGA) && !biome.is(ModTags.IS_SNOWY),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TAIGA_FLOWER_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WOOD_SORREL_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("savanna_flowers"), matches(ModTags.IS_SAVANNA),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WILD_DAGGA_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.SAVANNA_IRIS_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("lush_cave_flowers"), matches(ModTags.IS_LUSH),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.LUSH_FLOWERS_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, ModKeyFeatures.VINE_LUSH_LOTUSES.placedFeature());
                }
        );

    }

    private static BiomePredicate matches(ResourceKey<Biome> key) {
        return (resourceLocation, biome) -> biome.is(key);
    }

    private static BiomePredicate matches(TagKey<Biome> tag) {
        return (resourceLocation, biome) -> biome.is(tag);
    }

}
