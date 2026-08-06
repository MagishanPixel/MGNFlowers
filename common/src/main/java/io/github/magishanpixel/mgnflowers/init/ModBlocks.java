package io.github.magishanpixel.mgnflowers.init;

import io.github.magishanpixel.mgnflowers.block.*;
import io.github.magishanpixel.mgnflowers.item.WaterFlowerBedBlockItem;
import io.github.magishanpixel.mgnflowers.misc.*;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistration;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.core.Holder;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks {

    public static DeferredBlock MOTH_IRIS;
    public static DeferredBlock IRIS;
    public static DeferredBlock GROTTAL_BLOOM;

    public static DeferredBlock BLUE_TWIN_POPPY;
    public static DeferredBlock ORANGE_TWIN_POPPY;
    public static DeferredBlock WHITE_TWIN_POPPY;
    public static DeferredBlock RED_TWIN_POPPY;
    public static DeferredBlock PINK_TWIN_POPPY;

    public static DeferredBlock ORANGE_TALL_TULIP;
    public static DeferredBlock RED_TALL_TULIP;
    public static DeferredBlock WHITE_TALL_TULIP;
    public static DeferredBlock PINK_TALL_TULIP;
    public static DeferredBlock PURPLE_TALL_TULIP;
    public static DeferredBlock TURQUOISE_TALL_TULIP;

    public static DeferredBlock GLOWING_TALL_TULIP;

    public static DeferredBlock RED_GINGER_LILY;
    public static DeferredBlock WHITE_GINGER_LILY;
    public static DeferredBlock PINK_GINGER_LILY;
    public static DeferredBlock ORANGE_GINGER_LILY;

    public static DeferredBlock WATER_HYACINTH;

    public static DeferredBlock BLEEDING_QUADHEART;
    public static DeferredBlock CANDY_BLEEDING_QUADHEART;
    public static DeferredBlock HOLLOW_BLEEDING_QUADHEART;

    public static DeferredBlock BEE_BALM;

    public static DeferredBlock LAMPBLOSSOM;

    public static DeferredBlock PINK_ROMENTA;
    public static DeferredBlock BLUE_ROMENTA;
    public static DeferredBlock ORANGE_ROMENTA;

    public static DeferredBlock BIRD_OF_PARADISE;

    public static DeferredBlock TALL_ALLIUM;
    public static DeferredBlock BLUE_TALL_ALLIUM;

    public static DeferredBlock WELWITSCHIA;
    public static DeferredBlock TORCH_GINGER;

    public static DeferredBlock DANDELION_BED;

    public static DeferredBlock BLUE_HYACINTH;
    public static DeferredBlock WHITE_HYACINTH;
    public static DeferredBlock PURPLE_HYACINTH;
    public static DeferredBlock RED_HYACINTH;
    public static DeferredBlock PINK_HYACINTH;
    public static DeferredBlock YELLOW_HYACINTH;

    public static DeferredBlock WHITE_VINE_LOTUS;
    public static DeferredBlock PINK_VINE_LOTUS;
    public static DeferredBlock GLOWING_VINE_LOTUS;

    public static DeferredBlock WATER_POPPY;
    public static DeferredBlock FIRE_LILY;

    public static DeferredBlock WHITE_LACECAP_HYDRANGEA;
    public static DeferredBlock BLUE_LACECAP_HYDRANGEA;
    public static DeferredBlock PINK_LACECAP_HYDRANGEA;

    public static DeferredBlock SUNFLOWER_BED;

    public static DeferredBlock PINK_CYCLAMEN;
    public static DeferredBlock WHITE_CYCLAMEN;

    public static DeferredBlock TRILLIUM;
    public static DeferredBlock WOOD_SORREL;

    public static DeferredBlock SAVANNAH_SUNSET_IRIS;
    public static DeferredBlock SAND_VERBENA;
    public static DeferredBlock WILD_DAGGA;

    public static DeferredBlock RED_BEE_BALM;
    public static DeferredBlock GLACIER_LILY;
    public static DeferredBlock WINTER_ACONITE;

    public static void init(BalmBlockRegistrar blocks) {
        FloweryConstruct construct = new FloweryConstruct(blocks);

        MOTH_IRIS = construct.registerBasic("moth_iris", MobEffects.LEVITATION, 2, flowerProp().dye(DyeColor.LIGHT_GRAY).disableOffset().build());
        IRIS = construct.registerBasic("iris", MobEffects.ABSORPTION, 2, flowerProp().dye(DyeColor.PURPLE).disableOffset().build());
        SAVANNAH_SUNSET_IRIS = construct.registerBasic("savannah_sunset_iris", MobEffects.ABSORPTION, 2, flowerProp().dye(DyeColor.PURPLE).disableOffset().build());
        GROTTAL_BLOOM = construct.registerBasic("grottal_bloom", MobEffects.GLOWING, 4, flowerProp().setGlow(FlowerProperty.GlowValue.of(12, true)).dye(DyeColor.CYAN).build());

        BLUE_TWIN_POPPY = construct.registerBasic(PrefList.TWIN_POPPY.colorOf(StraddColor.blue), MobEffects.WATER_BREATHING, 4, DyeColor.BLUE);
        ORANGE_TWIN_POPPY = construct.registerBasic(PrefList.TWIN_POPPY.colorOf(StraddColor.orange), MobEffects.FIRE_RESISTANCE, 5, DyeColor.ORANGE);
        WHITE_TWIN_POPPY = construct.registerBasic(PrefList.TWIN_POPPY.colorOf(StraddColor.white), MobEffects.CONFUSION, 6, DyeColor.WHITE);
        RED_TWIN_POPPY = construct.registerBasic(PrefList.TWIN_POPPY.colorOf(StraddColor.red), MobEffects.ABSORPTION, 2, DyeColor.RED);
        PINK_TWIN_POPPY = construct.registerBasic(PrefList.TWIN_POPPY.colorOf(StraddColor.pink), MobEffects.HEAL, 2, DyeColor.PINK);

        ORANGE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.orange), a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 1, a), DyeColor.ORANGE);
        RED_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.DAMAGE_RESISTANCE, 4, a), DyeColor.RED);
        WHITE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.LEVITATION, 3, a), DyeColor.WHITE);
        PINK_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 2, a), DyeColor.PINK);
        PURPLE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.purple), a -> new TallerFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, a), DyeColor.PURPLE);
        TURQUOISE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.of("turquoise", false), a -> new TallerFlowerBlock(MobEffects.WATER_BREATHING, 6, a), DyeColor.LIGHT_BLUE);
        GLOWING_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.of("glowing", false), a -> new TallerFlowerBlock(MobEffects.GLOWING, 4, a.lightLevel(v -> v.getValue(TallerFlowerBlock.STEM) == 3 ? 12 : 0)), DyeColor.ORANGE);

        RED_GINGER_LILY = construct.registerSameProperty(PrefList.GINGER_LILY.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 2, a), DyeColor.RED);
        WHITE_GINGER_LILY = construct.registerSameProperty(PrefList.GINGER_LILY.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.GLOWING, 4, a), DyeColor.WHITE);
        PINK_GINGER_LILY = construct.registerSameProperty(PrefList.GINGER_LILY.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEAL, 2, a), DyeColor.PINK);
        ORANGE_GINGER_LILY = construct.registerSameProperty(PrefList.GINGER_LILY.colorOf(StraddColor.orange), a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 6, a), DyeColor.ORANGE);

        WATER_HYACINTH = construct.registerSameProperty("water_hyacinth", a -> new WaterFlowerBedBlock(a, WaterFlowerBedBlock.TYPE.WATER), flowerProp().setBlockItem(WaterFlowerBedBlockItem::new).disableOffset().disableDrop().dye(DyeColor.PINK).build());

        BLEEDING_QUADHEART = construct.registerBasic("bleeding_quadheart", MobEffects.HEAL, 3, DyeColor.RED);
        CANDY_BLEEDING_QUADHEART = construct.registerBasic(PrefList.BLEEDING_QUADHEART.of("candy", false), MobEffects.HEALTH_BOOST, 3, DyeColor.PINK);
        HOLLOW_BLEEDING_QUADHEART = construct.registerBasic(PrefList.BLEEDING_QUADHEART.of("hollow", false), MobEffects.WITHER, 8, DyeColor.BLACK);

        BEE_BALM = construct.registerBasic("bee_balm", MobEffects.DIG_SLOWDOWN, 4, DyeColor.YELLOW);

        LAMPBLOSSOM = construct.registerBasic("lampblossom", MobEffects.GLOWING, 4, flowerProp().setGlow(FlowerProperty.GlowValue.of(12, true)).dye(DyeColor.ORANGE).build());

        PINK_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.pink), MobEffects.HEAL, 3, DyeColor.PINK);
        BLUE_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.blue), MobEffects.CONFUSION, 8, DyeColor.BLUE);
        ORANGE_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.orange), MobEffects.WATER_BREATHING, 4, DyeColor.ORANGE);

        BIRD_OF_PARADISE = construct.registerBasic("bird_of_paradise", MobEffects.SLOW_FALLING, 5, DyeColor.ORANGE);

        TALL_ALLIUM = construct.registerSameProperty("tall_allium", a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 4, a), DyeColor.MAGENTA);
        BLUE_TALL_ALLIUM = construct.registerSameProperty("blue_tall_allium", a -> new TallerFlowerBlock(MobEffects.WATER_BREATHING, 6, a), DyeColor.BLUE);

        WELWITSCHIA = construct.registerSameProperty("welwitschia", a -> new CustomFlowerBlock(MobEffects.FIRE_RESISTANCE, 3, (state, level, pos, defaultBool) -> state.is(BlockTags.SAND) || defaultBool, a), DyeColor.BROWN);
        TORCH_GINGER = construct.registerSameProperty("torch_ginger", a -> new CustomFlowerBedBlock(a, 3),
                flowerProp().disableDrop().disableOffset().dye(DyeColor.RED).build());

        DANDELION_BED = construct.registerSameProperty("dandelion_bed", a -> new CustomFlowerBedBlock(a, 4),
                flowerProp().disableDrop().disableOffset().dye(DyeColor.WHITE).build());

        var SHAPE_hyacinth = Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

        PURPLE_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.purple), a -> new CustomFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, null, SHAPE_hyacinth, a), DyeColor.PURPLE);
        BLUE_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.blue), a -> new CustomFlowerBlock(MobEffects.NIGHT_VISION, 4, null, SHAPE_hyacinth, a), DyeColor.BLUE);
        RED_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.red), a -> new CustomFlowerBlock(MobEffects.HEAL, 4, null, SHAPE_hyacinth, a), DyeColor.RED);
        WHITE_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.white), a -> new CustomFlowerBlock(MobEffects.LEVITATION, 4, null, SHAPE_hyacinth, a), DyeColor.WHITE);
        YELLOW_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.yellow), a -> new CustomFlowerBlock(MobEffects.CONFUSION, 4, null, SHAPE_hyacinth, a), DyeColor.YELLOW);
        PINK_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.pink), a -> new CustomFlowerBlock(MobEffects.HEALTH_BOOST, 4, null, SHAPE_hyacinth, a), DyeColor.PINK);

        WHITE_VINE_LOTUS = construct.registerSameProperty(PrefList.VINE_LOTUS.colorOf(StraddColor.white), a -> new VineLotusBlock(MobEffects.NIGHT_VISION, 3, a), flowerProp().disableOffset().dye(DyeColor.WHITE).build());
        PINK_VINE_LOTUS = construct.registerSameProperty(PrefList.VINE_LOTUS.colorOf(StraddColor.pink), a -> new VineLotusBlock(MobEffects.REGENERATION, 2, a), flowerProp().disableOffset().dye(DyeColor.PINK).build());
        GLOWING_VINE_LOTUS = construct.registerSameProperty(PrefList.VINE_LOTUS.of("glowing", false), a -> new VineLotusBlock(MobEffects.GLOWING, 4, a.emissiveRendering((blockState, blockGetter, blockPos) -> true).lightLevel(ModBlocks::glowingVineLotus)), flowerProp().disableOffset().dye(DyeColor.ORANGE).build());

        SUNFLOWER_BED = construct.registerSameProperty("sunflower_bed", a -> new CustomFlowerBedBlock(a, 4),
                flowerProp().disableOffset().disableDrop().dye(DyeColor.YELLOW).build());
        WATER_POPPY = construct.registerSameProperty("water_poppy", a -> new WaterFlowerBedBlock(a, WaterFlowerBedBlock.TYPE.WATER),
                flowerProp().disableOffset().disableDrop().dye(DyeColor.RED).setBlockItem(WaterFlowerBedBlockItem::new).build());

        FIRE_LILY = construct.registerBasic("fire_lily", MobEffects.ABSORPTION, 3, DyeColor.ORANGE);
        WHITE_LACECAP_HYDRANGEA = construct.registerBasic(PrefList.LACECAP_HYDRANGEA.colorOf(StraddColor.white), MobEffects.LEVITATION, 5, DyeColor.WHITE);
        PINK_LACECAP_HYDRANGEA = construct.registerBasic(PrefList.LACECAP_HYDRANGEA.colorOf(StraddColor.pink), MobEffects.HEALTH_BOOST, 5, DyeColor.PINK);
        BLUE_LACECAP_HYDRANGEA = construct.registerBasic(PrefList.LACECAP_HYDRANGEA.colorOf(StraddColor.blue), MobEffects.NIGHT_VISION, 5, DyeColor.BLUE);

        PINK_CYCLAMEN = construct.registerBasic(PrefList.CYCLAMEN.colorOf(StraddColor.pink), MobEffects.DIG_SLOWDOWN, 4, flowerProp().disableOffset().dye(DyeColor.PINK).build());
        WHITE_CYCLAMEN = construct.registerBasic(PrefList.CYCLAMEN.colorOf(StraddColor.white), MobEffects.CONFUSION, 10, flowerProp().disableOffset().dye(DyeColor.WHITE).build());

        TRILLIUM = construct.registerBasic("trillium", MobEffects.HEAL, 1, flowerProp().dye(DyeColor.WHITE).disableOffset().build());
        WOOD_SORREL = construct.registerSameProperty("wood_sorrel", a -> new CustomFlowerBedBlock(a, 4),
                flowerProp().disableOffset().disableDrop().dye(DyeColor.YELLOW).build());

        SAND_VERBENA = construct.registerSameProperty("sand_verbena", a -> new SandFlowerBedBlock(a, 4),
                flowerProp().disableOffset().disableDrop().dye(DyeColor.PINK).build());
        WILD_DAGGA = construct.registerSameProperty("wild_dagga", a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 4, a), DyeColor.ORANGE);
        RED_BEE_BALM = construct.registerBasic("red_bee_balm", MobEffects.HEAL, 1, DyeColor.RED);
        GLACIER_LILY = construct.registerBasic("glacier_lily", MobEffects.FIRE_RESISTANCE, 3, DyeColor.RED);
        WINTER_ACONITE = construct.registerSameProperty("winter_aconite", a -> new CustomFlowerBedBlock(a, 4), flowerProp().disableOffset().dye(DyeColor.YELLOW).build());
    }

    private static FlowerProperty.Builder flowerProp() {
        return new FlowerProperty.Builder();
    }

    private static BlockBehaviour.Properties setPropFlower(BlockBehaviour.Properties prop) {
        return prop.mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY);
    }

    private static class FloweryConstruct {
        private final BalmBlockRegistrar blocks;

        public FloweryConstruct(BalmBlockRegistrar reg) {
            this.blocks = reg;
        }

        public DeferredBlock registerSameProperty(String name, Function<BlockBehaviour.Properties, Block> constructor, DyeColor dyeColor) {
            return registerAsFlower(name, constructor, new FlowerProperty.Builder().dye(dyeColor).notSmall().build());
        }

        public DeferredBlock registerSameProperty(String name, Function<BlockBehaviour.Properties, Block> constructor, FlowerProperty prop) {
            return registerAsFlower(name, constructor, prop);
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds, DyeColor dyeColor) {
            return registerAsFlower(name, a -> new FlowerBlock(suspiciousStew, lastSeconds, a), new FlowerProperty.Builder().dye(dyeColor).build());
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds, FlowerProperty prop) {
            return registerAsFlower(name, a -> new FlowerBlock(suspiciousStew, lastSeconds, a), prop);
        }

        public DeferredBlock registerAsFlower(String name, Function<BlockBehaviour.Properties, Block> constructors, FlowerProperty flowerProp) {
            if (MGNConstants.isDevelopment) {
                MagishanLib.dataGenList.put(name, flowerProp);
            }

            BalmBlockRegistration reg = blocks.register(name, constructors,
                    it -> {
                        BlockBehaviour.Properties prop = setPropFlower(it).offsetType(!flowerProp.isOffset ? BlockBehaviour.OffsetType.NONE : BlockBehaviour.OffsetType.XZ);

                        if (flowerProp.glowVal != null) {
                            prop.emissiveRendering(flowerProp.glowVal.emit);
                            prop.lightLevel(flowerProp.glowVal.glowness);
                        }

                        return prop;
                    });

            reg = flowerProp.blockItem != null ? reg.withItem(flowerProp.blockItem) : reg.withDefaultItem();

            return reg.asDeferredBlock();


        }
    }

    private static int glowingVineLotus(BlockState state) {
        int a = state.getValue(TallerFlowerBlock.STEM);

        if (a == 0 || a == 3) {
            return 12;
        }

        return 6;
    }



}
