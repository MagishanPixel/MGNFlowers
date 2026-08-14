package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ClientModInitializer;

public class MGNFlowersClient_FABRIC implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(MGNConstants.MOD_ID, FabricLoadContext.INSTANCE, new MGNFlowersClient());


    }
}
