package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.blay09.mods.balm.client.platform.module.BalmClientModule;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
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
        setCutout(rend,
                ModBlocks.POTTED_BLUE_TWIN_POPPY,
                ModBlocks.POTTED_RED_TWIN_POPPY,
                ModBlocks.POTTED_ORANGE_TWIN_POPPY,
                ModBlocks.POTTED_PINK_TWIN_POPPY,
                ModBlocks.POTTED_WHITE_TWIN_POPPY,
                ModBlocks.POTTED_BIRD_OF_PARADISE,
                ModBlocks.POTTED_BLUE_ROMENTA,
                ModBlocks.POTTED_ORANGE_ROMENTA,
                ModBlocks.POTTED_PINK_ROMENTA,
                ModBlocks.POTTED_BLEEDING_HEART,
                ModBlocks.POTTED_HOLLOW_BLEEDING_HEART,
                ModBlocks.POTTED_CANDY_BLEEDING_HEART,
                ModBlocks.POTTED_WELWITSCHIA,
                ModBlocks.POTTED_IRIS,
                ModBlocks.POTTED_MOTH_IRIS,
                ModBlocks.POTTED_SAVANNAH_SUNSET_IRIS,
                ModBlocks.POTTED_FIRE_LILY,
                ModBlocks.POTTED_WHITE_LACECAP_HYDRANGEA,
                ModBlocks.POTTED_BLUE_LACECAP_HYDRANGEA,
                ModBlocks.POTTED_PINK_LACECAP_HYDRANGEA,
                ModBlocks.POTTED_BEE_BALM,
                ModBlocks.POTTED_RED_BEE_BALM,
                ModBlocks.POTTED_LAMPBLOSSOM,
                ModBlocks.POTTED_TRILLIUM,
                ModBlocks.POTTED_GROTTAL_BLOOM,
                ModBlocks.POTTED_BLUE_HYACINTH,
                ModBlocks.POTTED_WHITE_HYACINTH,
                ModBlocks.POTTED_PURPLE_HYACINTH,
                ModBlocks.POTTED_RED_HYACINTH,
                ModBlocks.POTTED_PINK_HYACINTH,
                ModBlocks.POTTED_YELLOW_HYACINTH,
                ModBlocks.GLACIER_LILY

        );
    }

    private static void setCutout(BalmBlockRenderTypeRegistrar rend, DeferredBlock... list) {
        for (DeferredBlock block : list) {
            rend.setRenderLayer(block, ChunkSectionLayer.CUTOUT);
        }
    }

}
