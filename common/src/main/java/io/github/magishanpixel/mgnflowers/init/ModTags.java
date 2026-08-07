package io.github.magishanpixel.mgnflowers.init;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;

public class ModTags {
    public static final TagKey<Biome> IS_FLOWER_FOREST = cKey("is_flower_forest");
    public static final TagKey<Biome> IS_FOREST = cKey("is_forest");
    public static final TagKey<Biome> IS_PLAINS = cKey("is_plains");
    public static final TagKey<Biome> IS_DESERT = cKey("is_desert");
    public static final TagKey<Biome> IS_SWAMP = cKey("is_swamp");
    public static final TagKey<Biome> IS_JUNGLE = cKey("is_jungle");
    public static final TagKey<Biome> IS_TAIGA = cKey("is_taiga");
    public static final TagKey<Biome> IS_SNOWY = cKey("is_snowy");
    public static final TagKey<Biome> IS_SAVANNA = cKey("is_savanna");
    public static final TagKey<Biome> IS_LUSH = cKey("is_lush");

    public static final TagKey<Item> SHEAR_TOOL = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "tools/shear"));
    public static final TagKey<Item> ANIMAL_FOODS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "animal_foods"));

    private static TagKey<Biome> Key(String name) {
        return TagKey.create(Registries.BIOME, MGNFlowers.newId(name));
    }

    private static TagKey<Biome> cKey(String name) {
        return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
