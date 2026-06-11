package io.github.magishanpixel.oddflowers.misc;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;

public class OddLib {
    public static ResourceLocation newId(String name) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name);
    }

    public static double doubleInRange(RandomSource random, double min, double max) {
        return min + random.nextDouble() * (max - min);
    }

    public enum RENDER_LAYER {
        CUTOUT,
        TRANSCULENT,
        IGNORE
    }

    public enum BLOCK_ITEM {
        DEFAULT,
        PLACE_ON_WATER,
        WATER_HYACINTH
    }
}
