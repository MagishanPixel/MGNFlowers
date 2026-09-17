package io.github.magishanpixel.mgnflowers.init;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import io.github.magishanpixel.mgnflowers.MGNFlowers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;

public class ModTags {
    public static final TagKey<Biome> IS_FLOWER_FOREST = cKey("flower_forests");
    public static final TagKey<Biome> IS_FOREST = cKey("forest");
    public static final TagKey<Biome> IS_PLAINS = cKey("plains");
    public static final TagKey<Biome> IS_DESERT = cKey("desert");
    public static final TagKey<Biome> IS_SWAMP = cKey("swamp");
    public static final TagKey<Biome> IS_JUNGLE = cKey("jungle");
    public static final TagKey<Biome> IS_TAIGA = cKey("taiga");
    public static final TagKey<Biome> IS_SNOWY = cKey("snowy");
    public static final TagKey<Biome> IS_SAVANNA = cKey("savanna");
    public static final TagKey<Biome> IS_LUSH = cKey("lush");

    public static final TagKey<Item> SHEAR_TOOL = TagKey.create(Registries.ITEM, new ResourceLocation("c", "tools/shear"));
    public static final TagKey<Item> ANIMAL_FOODS = TagKey.create(Registries.ITEM, new ResourceLocation("c", "animal_foods"));

    private static TagKey<Biome> Key(String name) {
        return TagKey.create(Registries.BIOME, MGNConstants.newId(name));
    }

    private static TagKey<Biome> cKey(String name) {
        return TagKey.create(Registries.BIOME, new ResourceLocation("c", name));
    }
}
