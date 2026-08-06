package io.github.magishanpixel.mgnflowers.init;

import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class ModItems {
    public static void init(BalmItemRegistrar items) {
    }

    public static void init(BalmCreativeModeTabRegistrar tab) {
        tab.register("main_tab", (resourceLocation, builder) -> builder.icon(() -> new ItemStack(ModBlocks.MOTH_IRIS.asItem())).title(Component.translatable("tab.mgnflowers")).displayItems(
                (itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.BLUE_TWIN_POPPY.asItem());
                    output.accept(ModBlocks.WHITE_TWIN_POPPY.asItem());
                    output.accept(ModBlocks.ORANGE_TWIN_POPPY.asItem());
                    output.accept(ModBlocks.PINK_TWIN_POPPY.asItem());
                    output.accept(ModBlocks.RED_TWIN_POPPY.asItem());

                    output.accept(ModBlocks.ORANGE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.RED_TALL_TULIP.asItem());
                    output.accept(ModBlocks.WHITE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.PINK_TALL_TULIP.asItem());
                    output.accept(ModBlocks.PURPLE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.TURQUOISE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.GLOWING_TALL_TULIP.asItem());

                    output.accept(ModBlocks.RED_GINGER_LILY.asItem());
                    output.accept(ModBlocks.WHITE_GINGER_LILY.asItem());
                    output.accept(ModBlocks.PINK_GINGER_LILY.asItem());
                    output.accept(ModBlocks.ORANGE_GINGER_LILY.asItem());

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

                    output.accept(ModBlocks.BLEEDING_QUADHEART.asItem());
                    output.accept(ModBlocks.CANDY_BLEEDING_QUADHEART.asItem());
                    output.accept(ModBlocks.HOLLOW_BLEEDING_QUADHEART.asItem());

                    output.accept(ModBlocks.IRIS.asItem());
                    output.accept(ModBlocks.MOTH_IRIS.asItem());
                    output.accept(ModBlocks.SAVANNAH_SUNSET_IRIS.asItem());

                    output.accept(ModBlocks.TORCH_GINGER);
                    output.accept(ModBlocks.DANDELION_BED);
                    output.accept(ModBlocks.SUNFLOWER_BED);
                    output.accept(ModBlocks.WOOD_SORREL);

                    output.accept(ModBlocks.WATER_HYACINTH.asItem());
                    output.accept(ModBlocks.WATER_POPPY);

                    output.accept(ModBlocks.BEE_BALM);
                    output.accept(ModBlocks.RED_BEE_BALM);
                    output.accept(ModBlocks.FIRE_LILY);
                    output.accept(ModBlocks.GLACIER_LILY);
                    output.accept(ModBlocks.BIRD_OF_PARADISE);
                    output.accept(ModBlocks.LAMPBLOSSOM);
                    output.accept(ModBlocks.WELWITSCHIA);
                    output.accept(ModBlocks.TRILLIUM);
                    output.accept(ModBlocks.GROTTAL_BLOOM.asItem());
                    output.accept(ModBlocks.SAND_VERBENA);
                    output.accept(ModBlocks.WINTER_ACONITE);
                    output.accept(ModBlocks.WILD_DAGGA);


                }));
    }

}
