package io.github.magishanpixel.mgnflowers.forge;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.init.ModItems;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.client.MGNFlowersClient;

@Mod(MGNFlowers.MOD_ID)
public class MGNFlowers_FORGE {

    public MGNFlowers_FORGE(FMLJavaModLoadingContext context) {
        Balm.initializeMod(MGNFlowers.MOD_ID, EmptyLoadContext.INSTANCE, new MGNFlowers());
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initializeMod(MGNFlowers.MOD_ID, EmptyLoadContext.INSTANCE, new MGNFlowersClient()));

        IEventBus bus = context.getModEventBus();
        bus.addListener(this::setRenderType);
        bus.addListener(this::creativeTab);
    }


    public void setRenderType(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MGNFlowersClient.setRenderTypes(block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout()));

        });
    }

    public void creativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().location().equals(MGNConstants.newId("main_tab"))) {
            ModItems.addToTab(block -> event.accept(block.get().asItem()));
        }
    }
}
