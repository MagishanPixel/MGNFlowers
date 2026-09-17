package io.github.magishanpixel.mgnflowers.fabric.client;

import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;
import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.client.MGNFlowersClient;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class MGNFlowersClient_FABRIC implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(MGNFlowers.MOD_ID, EmptyLoadContext.INSTANCE, new MGNFlowersClient());

        MGNFlowersClient.setRenderTypes(block -> BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutout()));
    }
}
