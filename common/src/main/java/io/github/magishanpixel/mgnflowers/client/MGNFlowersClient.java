package io.github.magishanpixel.mgnflowers.client;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.api.client.rendering.BalmRenderers;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.function.Consumer;

public class MGNFlowersClient implements BalmClientModule {
    @Override
    public ResourceLocation getId() {
        return MGNConstants.newId("client");
    }

    @Override
    public void initialize() {

    }

    public static void setRenderTypes(Consumer<DeferredObject<Block>> v) {
        List<DeferredObject<Block>> list = List.of(
                ModBlocks.MOTH_IRIS,
                ModBlocks.IRIS,
                ModBlocks.GROTTAL_BLOOM,
                ModBlocks.RED_TWIN_POPPY,
                ModBlocks.BLUE_TWIN_POPPY,
                ModBlocks.ORANGE_TWIN_POPPY,
                ModBlocks.WHITE_TWIN_POPPY,
                ModBlocks.PINK_TWIN_POPPY,
                ModBlocks.WHITE_TALL_TULIP,
                ModBlocks.PURPLE_TALL_TULIP,
                ModBlocks.TURQUOISE_TALL_TULIP,
                ModBlocks.PINK_TALL_TULIP,
                ModBlocks.RED_TALL_TULIP,
                ModBlocks.ORANGE_TALL_TULIP,
                ModBlocks.GLOWING_TALL_TULIP,
                ModBlocks.ORANGE_GINGER_LILY,
                ModBlocks.WHITE_GINGER_LILY,
                ModBlocks.PINK_GINGER_LILY,
                ModBlocks.RED_GINGER_LILY,
                ModBlocks.WATER_HYACINTH,
                ModBlocks.BLEEDING_HEART,
                ModBlocks.CANDY_BLEEDING_HEART,
                ModBlocks.HOLLOW_BLEEDING_HEART,
                ModBlocks.BEE_BALM,
                ModBlocks.LAMPBLOSSOM,
                ModBlocks.PINK_ROMENTA,
                ModBlocks.BLUE_ROMENTA,
                ModBlocks.ORANGE_ROMENTA,
                ModBlocks.BIRD_OF_PARADISE,
                ModBlocks.TALL_ALLIUM,
                ModBlocks.BLUE_TALL_ALLIUM,
                ModBlocks.WELWITSCHIA,
                ModBlocks.TORCH_GINGER,
                ModBlocks.DANDELION_BED,
                ModBlocks.BLUE_HYACINTH,
                ModBlocks.PINK_HYACINTH,
                ModBlocks.RED_HYACINTH,
                ModBlocks.WHITE_HYACINTH,
                ModBlocks.PURPLE_HYACINTH,
                ModBlocks.YELLOW_HYACINTH,
                ModBlocks.PINK_VINE_LOTUS,
                ModBlocks.WHITE_VINE_LOTUS,
                ModBlocks.GLOWING_VINE_LOTUS,
                ModBlocks.WATER_POPPY,
                ModBlocks.SUNFLOWER_BED,
                ModBlocks.FIRE_LILY,
                ModBlocks.BLUE_LACECAP_HYDRANGEA,
                ModBlocks.WHITE_LACECAP_HYDRANGEA,
                ModBlocks.PINK_LACECAP_HYDRANGEA,
                ModBlocks.TRILLIUM,
                ModBlocks.WOOD_SORREL,
                ModBlocks.PINK_CYCLAMEN,
                ModBlocks.WHITE_CYCLAMEN,
                ModBlocks.SAVANNAH_SUNSET_IRIS,
                ModBlocks.SAND_VERBENA,
                ModBlocks.GLACIER_LILY,
                ModBlocks.RED_BEE_BALM,
                ModBlocks.WINTER_ACONITE,
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
                ModBlocks.POTTED_GLACIER_LILY
        );

        for (DeferredObject<Block> block : list) {
            v.accept(block);
        }
    }

}
