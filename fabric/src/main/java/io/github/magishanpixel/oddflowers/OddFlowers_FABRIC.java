package io.github.magishanpixel.oddflowers;

import io.github.magishanpixel.oddflowers.misc.Constants;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;

public class OddFlowers_FABRIC implements ModInitializer {
    
    @Override
    public void onInitialize() {
        OddFlowers.init();
        Balm.initializeMod(Constants.MOD_ID, EmptyLoadContext.INSTANCE, new OddFlowers());

        Constants.LOG.info("Hello Fabric world!");

    }


}
