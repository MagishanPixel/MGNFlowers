package io.github.magishanpixel.mgnflowers.init;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class ModItems {
    public static DeferredObject<CreativeModeTab> MAIN_TAB;
    public static final ResourceKey<CreativeModeTab> MAIN_TAB_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, MGNConstants.newId("main_tab"));

    public static void init(BalmItems items) {
        MAIN_TAB = items.registerCreativeModeTab(() -> ModBlocks.MOTH_IRIS.get().asItem().getDefaultInstance(), MGNConstants.newId("main_tab"));
    }

    public static void addToTab(Consumer<DeferredObject<Block>> output) {
        output.accept(ModBlocks.BLUE_TWIN_POPPY);
        output.accept(ModBlocks.WHITE_TWIN_POPPY);
        output.accept(ModBlocks.ORANGE_TWIN_POPPY);
        output.accept(ModBlocks.PINK_TWIN_POPPY);
        output.accept(ModBlocks.RED_TWIN_POPPY);

        output.accept(ModBlocks.ORANGE_TALL_TULIP);
        output.accept(ModBlocks.RED_TALL_TULIP);
        output.accept(ModBlocks.WHITE_TALL_TULIP);
        output.accept(ModBlocks.PINK_TALL_TULIP);
        output.accept(ModBlocks.PURPLE_TALL_TULIP);
        output.accept(ModBlocks.TURQUOISE_TALL_TULIP);
        output.accept(ModBlocks.GLOWING_TALL_TULIP);

        output.accept(ModBlocks.RED_GINGER_LILY);
        output.accept(ModBlocks.WHITE_GINGER_LILY);
        output.accept(ModBlocks.PINK_GINGER_LILY);
        output.accept(ModBlocks.ORANGE_GINGER_LILY);

        output.accept(ModBlocks.PINK_ROMENTA);
        output.accept(ModBlocks.BLUE_ROMENTA);
        output.accept(ModBlocks.ORANGE_ROMENTA);

        output.accept(ModBlocks.PINK_CYCLAMEN);
        output.accept(ModBlocks.WHITE_CYCLAMEN);

        output.accept(ModBlocks.BLUE_HYACINTH);
        output.accept(ModBlocks.PINK_HYACINTH);
        output.accept(ModBlocks.RED_HYACINTH);
        output.accept(ModBlocks.YELLOW_HYACINTH);
        output.accept(ModBlocks.WHITE_HYACINTH);
        output.accept(ModBlocks.PURPLE_HYACINTH);

        output.accept(ModBlocks.TALL_ALLIUM);
        output.accept(ModBlocks.BLUE_TALL_ALLIUM);

        output.accept(ModBlocks.BLUE_LACECAP_HYDRANGEA);
        output.accept(ModBlocks.PINK_LACECAP_HYDRANGEA);
        output.accept(ModBlocks.WHITE_LACECAP_HYDRANGEA);

        output.accept(ModBlocks.WHITE_VINE_LOTUS);
        output.accept(ModBlocks.PINK_VINE_LOTUS);
        output.accept(ModBlocks.GLOWING_VINE_LOTUS);

        output.accept(ModBlocks.BLEEDING_HEART);
        output.accept(ModBlocks.CANDY_BLEEDING_HEART);
        output.accept(ModBlocks.HOLLOW_BLEEDING_HEART);

        output.accept(ModBlocks.IRIS);
        output.accept(ModBlocks.MOTH_IRIS);
        output.accept(ModBlocks.SAVANNAH_SUNSET_IRIS);

        output.accept(ModBlocks.TORCH_GINGER);
        output.accept(ModBlocks.DANDELION_BED);
        output.accept(ModBlocks.SUNFLOWER_BED);
        output.accept(ModBlocks.WOOD_SORREL);

        output.accept(ModBlocks.WATER_HYACINTH);
        output.accept(ModBlocks.WATER_POPPY);

        output.accept(ModBlocks.BEE_BALM);
        output.accept(ModBlocks.RED_BEE_BALM);
        output.accept(ModBlocks.FIRE_LILY);
        output.accept(ModBlocks.GLACIER_LILY);
        output.accept(ModBlocks.BIRD_OF_PARADISE);
        output.accept(ModBlocks.LAMPBLOSSOM);
        output.accept(ModBlocks.WELWITSCHIA);
        output.accept(ModBlocks.TRILLIUM);
        output.accept(ModBlocks.GROTTAL_BLOOM);
        output.accept(ModBlocks.SAND_VERBENA);
        output.accept(ModBlocks.WINTER_ACONITE);
    }
}
