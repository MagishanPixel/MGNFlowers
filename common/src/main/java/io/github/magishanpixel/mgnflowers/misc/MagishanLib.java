package io.github.magishanpixel.mgnflowers.misc;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class MagishanLib {
    public static final Map<String, ModBlocks.FlowerProperty> dataGenList = Constants.isDevelopment ? new HashMap<>() : null;

    public static ResourceLocation newId(String name) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name);
    }


}
