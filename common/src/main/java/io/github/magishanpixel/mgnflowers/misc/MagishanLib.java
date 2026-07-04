package io.github.magishanpixel.mgnflowers.misc;

import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class MagishanLib {
    public static final Map<String, FlowerProperty> dataGenList = MGNConstants.isDevelopment ? new HashMap<>() : null;

    public static ResourceLocation newId(String name) {
        return ResourceLocation.fromNamespaceAndPath(MGNConstants.MOD_ID, name);
    }


}
