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

    public static double floatInRange(RandomSource random, float min, float max) {
        return min + random.nextFloat() * (max - min);
    }

    public static float alphaHandling(float progress, float target) {
        return Math.min(progress / target, 1);
    }

    public static float tweenHandling(float start, float target, float alpha) {
        return start + (target - start) * alpha;
    }

    public enum BLOCK_ITEM {
        DEFAULT,
        PLACE_ON_WATER,
        WATER_HYACINTH
    }


}
