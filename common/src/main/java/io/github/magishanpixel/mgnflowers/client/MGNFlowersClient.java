package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class MGNFlowersClient implements BalmClientModule {

    public static void init() {

    }

    @Override
    public ResourceLocation getId() {
        return MagishanLib.newId("client");
    }

    @Override
    public void registerBlockRenderTypes(BalmBlockRenderTypeRegistrar rend) {
        rend.setRenderLayer(ModBlocks.MOTH_IRIS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.IRIS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.GROTTAL_BLOOM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.RED_TWIN_POPPY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_TWIN_POPPY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_TWIN_POPPY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_TWIN_POPPY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TWIN_POPPY, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WHITE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PURPLE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.TURQUOISE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.GLOWING_TALL_TULIP, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.ORANGE_GINGER_LILY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_GINGER_LILY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_GINGER_LILY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_GINGER_LILY, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WATER_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.LAVA_HYACINTH, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLEEDING_QUADHEART, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.CANDY_BLEEDING_QUADHEART, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.HOLLOW_BLEEDING_QUADHEART, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BEE_BALM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.LAMPBLOSSOM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.PINK_ROMENTA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_ROMENTA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_ROMENTA, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.TITAN_ARUM, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BIRD_OF_PARADISE, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.TALL_ALLIUM, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_TALL_ALLIUM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WELWITSCHIA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.TORCH_GINGER, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLUE_HIBISCUS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_HIBISCUS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_HIBISCUS, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.DANDELION_BED, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLUE_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PURPLE_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.YELLOW_TALL_HYACINTH, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.PINK_VINE_LOTUS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_VINE_LOTUS, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WATER_POPPY, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.SUNFLOWER_BED, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.FIRE_LILY, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLUE_LACECAP_HYDRANGEA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_LACECAP_HYDRANGEA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_LACECAP_HYDRANGEA, RenderType.cutout());

    }


}
