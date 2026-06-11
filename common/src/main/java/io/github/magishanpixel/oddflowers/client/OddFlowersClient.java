package io.github.magishanpixel.oddflowers.client;

import io.github.magishanpixel.oddflowers.init.ModBlocks;
import io.github.magishanpixel.oddflowers.misc.OddLib;
import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class OddFlowersClient implements BalmClientModule {

    @Override
    public ResourceLocation getId() {
        return OddLib.newId("client");
    }

    @Override
    public void registerBlockRenderTypes(BalmBlockRenderTypeRegistrar rend) {
        rend.setRenderLayer(ModBlocks.MOTH_IRIS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.GROTTAL_BLOOM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.RED_TWIN_CENDALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_TWIN_CENDALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_TWIN_CENDALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_TWIN_CENDALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TWIN_CENDALION, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WHITE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PURPLE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.TURQUOISE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.GLOWING_TALL_TULIP, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.ORANGE_GINGER_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_GINGER_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_GINGER_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_GINGER_TULIP, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WATER_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.LAVA_HYACINTH, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLEEDING_QUADHEART, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.CANDY_BLEEDING_QUADHEART, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.HOLLOW_BLEEDING_QUADHEART, RenderType.cutout());
    }


}
