package io.github.magishanpixel.oddflowers.init;

import io.github.magishanpixel.oddflowers.item.WaterHyacinthBlockItem;
import io.github.magishanpixel.oddflowers.misc.PrefList;
import io.github.magishanpixel.oddflowers.misc.StraddColor;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ModItems {
    public static void init(BalmItemRegistrar items) {
        FloweryConstruct construct = new FloweryConstruct(items);

        construct.registerBlockItem("moth_iris", ModBlocks.MOTH_IRIS);
        construct.registerBlockItem("grottal_bloom", ModBlocks.GROTTAL_BLOOM);

        construct.registerBlockItem("blue_twin_celalion", ModBlocks.BLUE_TWIN_CELALION);
        construct.registerBlockItem("white_twin_celalion", ModBlocks.WHITE_TWIN_CELALION);
        construct.registerBlockItem("orange_twin_celalion", ModBlocks.ORANGE_TWIN_CELALION);
        construct.registerBlockItem("pink_twin_celalion", ModBlocks.PINK_TWIN_CELALION);
        construct.registerBlockItem("red_twin_celalion", ModBlocks.RED_TWIN_CELALION);

        construct.registerBlockItem("orange_tall_tulip", ModBlocks.ORANGE_TALL_TULIP);
        construct.registerBlockItem("red_tall_tulip", ModBlocks.RED_TALL_TULIP);
        construct.registerBlockItem("white_tall_tulip", ModBlocks.WHITE_TALL_TULIP);
        construct.registerBlockItem("pink_tall_tulip", ModBlocks.PINK_TALL_TULIP);
        construct.registerBlockItem("purple_tall_tulip", ModBlocks.PURPLE_TALL_TULIP);
        construct.registerBlockItem("turquoise_tall_tulip", ModBlocks.TURQUOISE_TALL_TULIP);
        construct.registerBlockItem("glowing_tall_tulip", ModBlocks.GLOWING_TALL_TULIP);

        construct.registerBlockItem("red_ginger_tulip", ModBlocks.RED_GINGER_TULIP);
        construct.registerBlockItem("white_ginger_tulip", ModBlocks.WHITE_GINGER_TULIP);
        construct.registerBlockItem("pink_ginger_tulip", ModBlocks.PINK_GINGER_TULIP);
        construct.registerBlockItem("orange_ginger_tulip", ModBlocks.ORANGE_GINGER_TULIP);

        items.register("water_hyacinth", a -> new WaterHyacinthBlockItem(ModBlocks.WATER_HYACINTH.asBlock(), a));
        items.register("lava_hyacinth", a -> new WaterHyacinthBlockItem(ModBlocks.LAVA_HYACINTH.asBlock(), a));

        construct.registerBlockItem("bleeding_quadheart", ModBlocks.BLEEDING_QUADHEART);
        construct.registerBlockItem(PrefList.BLEEDING_QUADHEART.of("candy", false), ModBlocks.CANDY_BLEEDING_QUADHEART);
        construct.registerBlockItem(PrefList.BLEEDING_QUADHEART.of("hollow", false), ModBlocks.HOLLOW_BLEEDING_QUADHEART);

        construct.registerBlockItem("bee_balm", ModBlocks.BEE_BALM);
        construct.registerBlockItem("crimson_balm", ModBlocks.CRIMSON_BALM);
        construct.registerBlockItem("warped_balm", ModBlocks.WARPED_BALM);

        construct.registerBlockItem("lampblossom", ModBlocks.LAMPBLOSSOM);

        construct.registerBlockItem(PrefList.ROMENTA.colorOf(StraddColor.pink), ModBlocks.PINK_ROMENTA);
        construct.registerBlockItem(PrefList.ROMENTA.colorOf(StraddColor.blue), ModBlocks.BLUE_ROMENTA);
        construct.registerBlockItem(PrefList.ROMENTA.colorOf(StraddColor.orange), ModBlocks.ORANGE_ROMENTA);

        construct.registerBlockItem("titan_arum", ModBlocks.TITAN_ARUM);

        construct.registerBlockItem("jungoiseau", ModBlocks.JUNGOISEAU);

        construct.registerBlockItem("tall_allium", ModBlocks.TALL_ALLIUM);
        construct.registerBlockItem("blue_tall_allium", ModBlocks.BLUE_TALL_ALLIUM);

        construct.registerBlockItem("welwitschia", ModBlocks.WELWITSCHIA);
        construct.registerBlockItem("torch_ginger", ModBlocks.TORCH_GINGER);

        construct.registerBlockItem(PrefList.HIBISCUS.colorOf(StraddColor.blue), ModBlocks.BLUE_HIBISCUS);
        construct.registerBlockItem(PrefList.HIBISCUS.colorOf(StraddColor.orange), ModBlocks.ORANGE_HIBISCUS);
        construct.registerBlockItem(PrefList.HIBISCUS.colorOf(StraddColor.pink), ModBlocks.PINK_HIBISCUS);

        construct.registerBlockItem("dandelion_bed", ModBlocks.DANDELION_BED);

        construct.registerBlockItem(PrefList.HYACINTH.colorOf(StraddColor.blue), ModBlocks.BLUE_TALL_HYACINTH);
        construct.registerBlockItem(PrefList.HYACINTH.colorOf(StraddColor.pink), ModBlocks.PINK_TALL_HYACINTH);
        construct.registerBlockItem(PrefList.HYACINTH.colorOf(StraddColor.white), ModBlocks.WHITE_TALL_HYACINTH);
        construct.registerBlockItem(PrefList.HYACINTH.colorOf(StraddColor.yellow), ModBlocks.YELLOW_TALL_HYACINTH);
        construct.registerBlockItem(PrefList.HYACINTH.colorOf(StraddColor.red), ModBlocks.RED_TALL_HYACINTH);
        construct.registerBlockItem(PrefList.HYACINTH.colorOf(StraddColor.purple), ModBlocks.PURPLE_TALL_HYACINTH);
    }

    public static void init(BalmCreativeModeTabRegistrar tab) {
        tab.register("main_tab", (resourceLocation, builder) -> builder.icon(() -> new ItemStack(ModBlocks.MOTH_IRIS.asItem())).title(Component.translatable("tab.oddflowers")).displayItems(
                (itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.BLUE_TWIN_CELALION.asItem());
                    output.accept(ModBlocks.WHITE_TWIN_CELALION.asItem());
                    output.accept(ModBlocks.ORANGE_TWIN_CELALION.asItem());
                    output.accept(ModBlocks.PINK_TWIN_CELALION.asItem());
                    output.accept(ModBlocks.RED_TWIN_CELALION.asItem());

                    output.accept(ModBlocks.BLUE_HIBISCUS);
                    output.accept(ModBlocks.ORANGE_HIBISCUS);
                    output.accept(ModBlocks.PINK_HIBISCUS);

                    output.accept(ModBlocks.ORANGE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.RED_TALL_TULIP.asItem());
                    output.accept(ModBlocks.WHITE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.PINK_TALL_TULIP.asItem());
                    output.accept(ModBlocks.PURPLE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.TURQUOISE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.GLOWING_TALL_TULIP.asItem());

                    output.accept(ModBlocks.RED_GINGER_TULIP.asItem());
                    output.accept(ModBlocks.WHITE_GINGER_TULIP.asItem());
                    output.accept(ModBlocks.PINK_GINGER_TULIP.asItem());
                    output.accept(ModBlocks.ORANGE_GINGER_TULIP.asItem());

                    output.accept(ModBlocks.PINK_ROMENTA);
                    output.accept(ModBlocks.BLUE_ROMENTA);
                    output.accept(ModBlocks.ORANGE_ROMENTA);

                    output.accept(ModBlocks.BLUE_TALL_HYACINTH);
                    output.accept(ModBlocks.PINK_TALL_HYACINTH);
                    output.accept(ModBlocks.RED_TALL_HYACINTH);
                    output.accept(ModBlocks.YELLOW_TALL_HYACINTH);
                    output.accept(ModBlocks.WHITE_TALL_HYACINTH);
                    output.accept(ModBlocks.PURPLE_TALL_HYACINTH);

                    output.accept(ModBlocks.TALL_ALLIUM);
                    output.accept(ModBlocks.BLUE_TALL_ALLIUM);

                    output.accept(ModBlocks.WATER_HYACINTH.asItem());
                    output.accept(ModBlocks.LAVA_HYACINTH.asItem());
                    output.accept(ModBlocks.TORCH_GINGER);
                    output.accept(ModBlocks.DANDELION_BED);

                    output.accept(ModBlocks.BLEEDING_QUADHEART.asItem());
                    output.accept(ModBlocks.CANDY_BLEEDING_QUADHEART.asItem());
                    output.accept(ModBlocks.HOLLOW_BLEEDING_QUADHEART.asItem());

                    output.accept(ModBlocks.BEE_BALM);
                    output.accept(ModBlocks.CRIMSON_BALM);
                    output.accept(ModBlocks.WARPED_BALM);

                    output.accept(ModBlocks.TITAN_ARUM);
                    output.accept(ModBlocks.JUNGOISEAU);
                    output.accept(ModBlocks.LAMPBLOSSOM);
                    output.accept(ModBlocks.WELWITSCHIA);
                    output.accept(ModBlocks.MOTH_IRIS.asItem());
                    output.accept(ModBlocks.GROTTAL_BLOOM.asItem());


                }));
    }

    private static class FloweryConstruct {
        private final BalmItemRegistrar items;

        public FloweryConstruct(BalmItemRegistrar reg) {
            this.items = reg;
        }

        public DeferredItem registerBasic(String name, int stack) {
            return items.register(name, Item::new, properties -> properties.stacksTo(stack)).asDeferredItem();
        };

        public DeferredItem registerBlockItem(String name, DeferredBlock block) {
            return registerBlockItem(name, block.asBlock());
        };

        public DeferredItem registerBlockItem(String name, Block block) {
            return items.register(name, a -> new BlockItem(block, a), Item.Properties::new).asDeferredItem();
        };
    }
}
