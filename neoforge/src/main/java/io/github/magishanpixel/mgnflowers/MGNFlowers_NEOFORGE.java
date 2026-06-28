package io.github.magishanpixel.mgnflowers;


import io.github.magishanpixel.mgnflowers.misc.Constants;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MGNFlowers_NEOFORGE {

    public MGNFlowers_NEOFORGE(IEventBus eventBus) {
        final var context = new NeoForgeLoadContext(eventBus);
        MGNFlowers.init();
        Balm.initializeMod(Constants.MOD_ID, context, new MGNFlowers());

    }
}