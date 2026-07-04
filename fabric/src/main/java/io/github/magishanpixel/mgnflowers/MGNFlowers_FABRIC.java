package io.github.magishanpixel.mgnflowers;

import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;

public class MGNFlowers_FABRIC implements ModInitializer {
    
    @Override
    public void onInitialize() {
        MGNFlowers.init();
        Balm.initializeMod(MGNConstants.MOD_ID, EmptyLoadContext.INSTANCE, new MGNFlowers());
    }


}
