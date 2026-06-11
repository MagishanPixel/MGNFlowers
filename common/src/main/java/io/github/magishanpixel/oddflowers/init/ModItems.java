package io.github.magishanpixel.oddflowers.init;

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
        construct.registerBlockItem("blue_twin_cendalion", ModBlocks.BLUE_TWIN_CENDALION);
        construct.registerBlockItem("orange_tall_tulip", ModBlocks.ORANGE_TALL_TULIP);
        construct.registerBlockItem("red_ginger_tulip", ModBlocks.RED_GINGER_TULIP);
        construct.registerBlockItem("water_hyacinth", ModBlocks.WATER_HYACINTH);
        construct.registerBlockItem("lava_hyacinth", ModBlocks.LAVA_HYACINTH);

    }

    public static void init(BalmCreativeModeTabRegistrar tab) {
        tab.register("main_tab", (resourceLocation, builder) -> builder.icon(() -> new ItemStack(ModBlocks.MOTH_IRIS.asItem())).title(Component.translatable("tab.oddflowers")).displayItems(
                (itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.MOTH_IRIS.asItem());
                    output.accept(ModBlocks.GROTTAL_BLOOM.asItem());
                    output.accept(ModBlocks.BLUE_TWIN_CENDALION.asItem());
                    output.accept(ModBlocks.ORANGE_TALL_TULIP.asItem());
                    output.accept(ModBlocks.RED_GINGER_TULIP.asItem());
                    output.accept(ModBlocks.WATER_HYACINTH.asItem());
                    output.accept(ModBlocks.LAVA_HYACINTH.asItem());
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
