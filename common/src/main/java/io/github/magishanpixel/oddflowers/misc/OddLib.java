package io.github.magishanpixel.oddflowers.misc;

import io.github.magishanpixel.oddflowers.init.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;

import java.util.HashMap;
import java.util.Map;

public class OddLib {
    public static final Map<String, ModBlocks.FlowerProperty> dataGenList = Constants.isDevelopment ? new HashMap<>() : null;

    public static ResourceLocation newId(String name) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name);
    }


}
