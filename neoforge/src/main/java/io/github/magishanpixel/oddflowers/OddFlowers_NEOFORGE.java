package io.github.magishanpixel.oddflowers;


import io.github.magishanpixel.oddflowers.misc.Constants;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class OddFlowers_NEOFORGE {

    public OddFlowers_NEOFORGE(IEventBus eventBus) {
        final var context = new NeoForgeLoadContext(eventBus);
        OddFlowers.init();
        Balm.initializeMod(Constants.MOD_ID, context, new OddFlowers());

    }
}