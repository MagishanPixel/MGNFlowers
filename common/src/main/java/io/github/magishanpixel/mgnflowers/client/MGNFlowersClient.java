package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.blay09.mods.balm.client.platform.module.BalmClientModule;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.resources.Identifier;

public class MGNFlowersClient implements BalmClientModule {

    public static void init() {

    }

    @Override
    public Identifier getId() {
        return MGNFlowers.newId("client");
    }

    @Override
    public void registerBlockRenderTypes(BalmBlockRenderTypeRegistrar rend) {
        rend.setRenderLayer(ModBlocks.MOTH_IRIS, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.IRIS, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.GROTTAL_BLOOM, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.RED_TWIN_POPPY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.BLUE_TWIN_POPPY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.ORANGE_TWIN_POPPY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WHITE_TWIN_POPPY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PINK_TWIN_POPPY, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.WHITE_TALL_TULIP, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PURPLE_TALL_TULIP, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.TURQUOISE_TALL_TULIP, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PINK_TALL_TULIP, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.RED_TALL_TULIP, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.ORANGE_TALL_TULIP, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.GLOWING_TALL_TULIP, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.ORANGE_GINGER_LILY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WHITE_GINGER_LILY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PINK_GINGER_LILY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.RED_GINGER_LILY, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.WATER_HYACINTH, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.BLEEDING_HEART, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.CANDY_BLEEDING_HEART, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.HOLLOW_BLEEDING_HEART, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.BEE_BALM, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.LAMPBLOSSOM, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.PINK_ROMENTA, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.BLUE_ROMENTA, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.ORANGE_ROMENTA, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.BIRD_OF_PARADISE, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.TALL_ALLIUM, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.BLUE_TALL_ALLIUM, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.WELWITSCHIA, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.TORCH_GINGER, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.DANDELION_BED, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.BLUE_HYACINTH, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PINK_HYACINTH, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.RED_HYACINTH, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WHITE_HYACINTH, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PURPLE_HYACINTH, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.YELLOW_HYACINTH, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.PINK_VINE_LOTUS, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WHITE_VINE_LOTUS, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.GLOWING_VINE_LOTUS, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.WATER_POPPY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.SUNFLOWER_BED, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.FIRE_LILY, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.BLUE_LACECAP_HYDRANGEA, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WHITE_LACECAP_HYDRANGEA, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PINK_LACECAP_HYDRANGEA, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.TRILLIUM, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WOOD_SORREL, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.PINK_CYCLAMEN, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WHITE_CYCLAMEN, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.SAVANNAH_SUNSET_IRIS, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.SAND_VERBENA, ChunkSectionLayer.CUTOUT);

        rend.setRenderLayer(ModBlocks.GLACIER_LILY, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.RED_BEE_BALM, ChunkSectionLayer.CUTOUT);
        rend.setRenderLayer(ModBlocks.WINTER_ACONITE, ChunkSectionLayer.CUTOUT);
    }


}
