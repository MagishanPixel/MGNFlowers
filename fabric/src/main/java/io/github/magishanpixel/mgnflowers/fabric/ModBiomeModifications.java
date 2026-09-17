package io.github.magishanpixel.mgnflowers.fabric;

import io.github.magishanpixel.mgnflowers.init.ModTags;
import io.github.magishanpixel.mgnflowers.worldgen.ModKeyFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

import java.util.function.Predicate;

public class ModBiomeModifications {
    public static void init() {
        add(BiomeSelectors.includeByKey(Biomes.FLOWER_FOREST), ModKeyFeatures.FLOWER_FOREST_PATCH, ModKeyFeatures.HYACINTH_PATCH, ModKeyFeatures.RARE_BEE_BALM, ModKeyFeatures.TALL_TULIPS_FLOWER_FOREST_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.DARK_FOREST, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.FLOWER_FOREST), ModKeyFeatures.DANDELION_BED_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.SNOWY_TAIGA), ModKeyFeatures.GLACIER_LILYS_PATCH, ModKeyFeatures.WINTER_ACONITE_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.MEADOW), ModKeyFeatures.TALL_ALLIUM_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.SUNFLOWER_PLAINS, Biomes.PLAINS), ModKeyFeatures.TWIN_POPPY_PATCH, ModKeyFeatures.TALL_TULIP_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.SUNFLOWER_PLAINS), ModKeyFeatures.SUNFLOWER_BED_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.SWAMP, Biomes.MANGROVE_SWAMP), ModKeyFeatures.VINE_LOTUSES, ModKeyFeatures.WATER_HYACINTH_PATCH, ModKeyFeatures.WATER_POPPY_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.DARK_FOREST), ModKeyFeatures.DARK_FOREST_FLOWER_PATCH, ModKeyFeatures.CYCLAMEN_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.DESERT, Biomes.BADLANDS, Biomes.ERODED_BADLANDS), ModKeyFeatures.WELWITSCHIA_PATCH, ModKeyFeatures.SAND_VERBENA_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.JUNGLE, Biomes.SPARSE_JUNGLE, Biomes.BAMBOO_JUNGLE), ModKeyFeatures.TORCH_GINGER_PATCH, ModKeyFeatures.JUNGLE_FLOWER_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.SPARSE_JUNGLE), ModKeyFeatures.GINGER_LILY_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA).and(context -> !context.hasTag(ModTags.IS_SNOWY)), ModKeyFeatures.WOOD_SORREL_PATCH, ModKeyFeatures.TAIGA_FLOWER_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA), ModKeyFeatures.SAVANNA_IRIS_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.CHERRY_GROVE), ModKeyFeatures.CANDY_BLEEDING_HEART_PATCH);
        add(BiomeSelectors.includeByKey(Biomes.LUSH_CAVES), ModKeyFeatures.LUSH_FLOWERS_PATCH, ModKeyFeatures.LUSH_VINE_LOTUSES);


    }
    
    private static void add(Predicate<BiomeSelectionContext> predicate, ModKeyFeatures.KeyFeature... keys) {
        for (ModKeyFeatures.KeyFeature k : keys) {
            BiomeModifications.addFeature(predicate, GenerationStep.Decoration.VEGETAL_DECORATION, k.placedFeature());
        }
    }
}
