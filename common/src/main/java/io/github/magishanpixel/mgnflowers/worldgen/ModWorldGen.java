package io.github.magishanpixel.mgnflowers.worldgen;

import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.blay09.mods.balm.api.world.BiomePredicate;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModWorldGen {
    public static void boot(BalmWorldGen worldGen) {
        worldGen.modifyBiome(MagishanLib.newId("flower_patches"),matches(ModBiomeTags.IS_FLOWER_FOREST),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.ROMENTA_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TALL_TULIP_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TALL_ALLIUM_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("meadow_flowers"), matches(Biomes.MEADOW),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.TALL_ALLIUM_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("plains_flowers"), matches(ModBiomeTags.IS_PLAINS),
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


        worldGen.modifyBiome(MagishanLib.newId("swamp_flowers"), matches(ModBiomeTags.IS_SWAMP),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.VINE_LOTUSES.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WATER_POPPY_PATCH.placedFeature());
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.WATER_HYACINTH_PATCH.placedFeature());
                }
        );

        worldGen.modifyBiome(MagishanLib.newId("dark_forest_flowers"), matches(Biomes.DARK_FOREST),
                (biomeholder, modifier) -> {
                    modifier.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModKeyFeatures.DARK_FOREST_FLOWER_PATCH.placedFeature());
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
