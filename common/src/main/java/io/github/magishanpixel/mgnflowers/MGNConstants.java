package io.github.magishanpixel.mgnflowers;

import net.minecraft.resources.ResourceLocation;

import java.util.logging.Logger;

public class MGNConstants {
    public static final String MOD_ID = "mgnflowers";
    public static final Logger LOG = Logger.getLogger("MGN's Flowers");

    public static ResourceLocation newId(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static final boolean isDevelopment = true;
}
