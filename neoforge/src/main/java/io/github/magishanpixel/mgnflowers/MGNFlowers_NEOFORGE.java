package io.github.magishanpixel.mgnflowers;


import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MGNConstants.MOD_ID)
public class MGNFlowers_NEOFORGE {

    public MGNFlowers_NEOFORGE(IEventBus eventBus) {
        final var context = new NeoForgeLoadContext(eventBus);
        MGNFlowers.init();
        Balm.initializeMod(MGNConstants.MOD_ID, context, new MGNFlowers());

    }
}