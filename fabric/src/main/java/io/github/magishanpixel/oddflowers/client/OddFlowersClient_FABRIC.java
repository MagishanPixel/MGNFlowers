package io.github.magishanpixel.oddflowers.client;

import io.github.magishanpixel.oddflowers.misc.Constants;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class OddFlowersClient_FABRIC implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(Constants.MOD_ID, EmptyLoadContext.INSTANCE, new OddFlowersClient());


    }
}
