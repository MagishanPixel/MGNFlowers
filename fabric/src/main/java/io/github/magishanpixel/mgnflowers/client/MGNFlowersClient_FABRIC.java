package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;

public class MGNFlowersClient_FABRIC implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(MGNConstants.MOD_ID, EmptyLoadContext.INSTANCE, new MGNFlowersClient());


    }
}
