package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = MGNConstants.MOD_ID, dist = Dist.CLIENT)
public class MGNFlowersClient_NEOFORGE {
    public MGNFlowersClient_NEOFORGE(IEventBus modEventBus) {
        final var loadContext = new NeoForgeLoadContext(modEventBus);
        BalmClient.initializeMod(MGNConstants.MOD_ID, loadContext, new MGNFlowersClient());
    }
}
