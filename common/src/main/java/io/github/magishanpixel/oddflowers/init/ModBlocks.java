package io.github.magishanpixel.oddflowers.init;

import io.github.magishanpixel.oddflowers.block.*;
import io.github.magishanpixel.oddflowers.misc.Constants;
import io.github.magishanpixel.oddflowers.misc.OddLib;
import io.github.magishanpixel.oddflowers.misc.PrefList;
import io.github.magishanpixel.oddflowers.misc.StraddColor;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.core.Holder;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ModBlocks {

    // CUSTOM
    public static DeferredBlock MOTH_IRIS;
    public static DeferredBlock GROTTAL_BLOOM;

    public static DeferredBlock BLUE_TWIN_CELALION;
    public static DeferredBlock ORANGE_TWIN_CELALION;
    public static DeferredBlock WHITE_TWIN_CELALION;
    public static DeferredBlock RED_TWIN_CELALION;
    public static DeferredBlock PINK_TWIN_CELALION;

    public static DeferredBlock ORANGE_TALL_TULIP;
    public static DeferredBlock RED_TALL_TULIP;
    public static DeferredBlock WHITE_TALL_TULIP;
    public static DeferredBlock PINK_TALL_TULIP;
    public static DeferredBlock PURPLE_TALL_TULIP;
    public static DeferredBlock TURQUOISE_TALL_TULIP;

    public static DeferredBlock GLOWING_TALL_TULIP;

    public static DeferredBlock RED_GINGER_TULIP;
    public static DeferredBlock WHITE_GINGER_TULIP;
    public static DeferredBlock PINK_GINGER_TULIP;
    public static DeferredBlock ORANGE_GINGER_TULIP;

    public static DeferredBlock WATER_HYACINTH;
    public static DeferredBlock LAVA_HYACINTH;

    public static DeferredBlock BLEEDING_QUADHEART;
    public static DeferredBlock CANDY_BLEEDING_QUADHEART;
    public static DeferredBlock HOLLOW_BLEEDING_QUADHEART;

    public static DeferredBlock BEE_BALM;

    public static DeferredBlock LAMPBLOSSOM;

    public static DeferredBlock PINK_ROMENTA;
    public static DeferredBlock BLUE_ROMENTA;
    public static DeferredBlock ORANGE_ROMENTA;

    public static DeferredBlock BIRD_OF_PARADISE;
    public static DeferredBlock TITAN_ARUM;

    public static DeferredBlock TALL_ALLIUM;
    public static DeferredBlock BLUE_TALL_ALLIUM;

    public static DeferredBlock WELWITSCHIA;
    public static DeferredBlock TORCH_GINGER;

    public static DeferredBlock BLUE_HIBISCUS;
    public static DeferredBlock ORANGE_HIBISCUS;
    public static DeferredBlock PINK_HIBISCUS;

    public static DeferredBlock DANDELION_BED;

    public static DeferredBlock BLUE_TALL_HYACINTH;
    public static DeferredBlock WHITE_TALL_HYACINTH;
    public static DeferredBlock PURPLE_TALL_HYACINTH;
    public static DeferredBlock RED_TALL_HYACINTH;
    public static DeferredBlock PINK_TALL_HYACINTH;
    public static DeferredBlock YELLOW_TALL_HYACINTH;

    public static DeferredBlock WHITE_VINE_LOTUS;
    public static DeferredBlock PINK_VINE_LOTUS;

    public static DeferredBlock WATER_POPPY;
    public static DeferredBlock FIRE_LILY;

    public static DeferredBlock WHITE_LACECAP_HYDRANGEA;
    public static DeferredBlock BLUE_LACECAP_HYDRANGEA;
    public static DeferredBlock PINK_LACECAP_HYDRANGEA;

    public static DeferredBlock SUNFLOWER_BED;

    public static void init(BalmBlockRegistrar blocks) {
        FloweryConstruct construct = new FloweryConstruct(blocks);

        MOTH_IRIS = construct.registerBasic("moth_iris", MobEffects.LEVITATION, 2, DyeColor.LIGHT_GRAY);
        GROTTAL_BLOOM = construct.registerBasic("grottal_bloom", MobEffects.GLOWING, 4, flowerProp().setGlow(GlowValue.of(6, true)).dye(DyeColor.CYAN).build());

        BLUE_TWIN_CELALION = construct.registerBasic(PrefList.TWIN_CELALION.colorOf(StraddColor.blue), MobEffects.WATER_BREATHING, 4, DyeColor.BLUE);
        ORANGE_TWIN_CELALION = construct.registerBasic(PrefList.TWIN_CELALION.colorOf(StraddColor.orange), MobEffects.FIRE_RESISTANCE, 5, DyeColor.ORANGE);
        WHITE_TWIN_CELALION = construct.registerBasic(PrefList.TWIN_CELALION.colorOf(StraddColor.white), MobEffects.CONFUSION, 6, DyeColor.WHITE);
        RED_TWIN_CELALION = construct.registerBasic(PrefList.TWIN_CELALION.colorOf(StraddColor.red), MobEffects.ABSORPTION, 2, DyeColor.RED);
        PINK_TWIN_CELALION = construct.registerBasic(PrefList.TWIN_CELALION.colorOf(StraddColor.pink), MobEffects.HEAL, 2, DyeColor.PINK);

        ORANGE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.orange), a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 1, a), DyeColor.ORANGE);
        RED_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.DAMAGE_RESISTANCE, 4, a), DyeColor.RED);
        WHITE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.LEVITATION, 3, a), DyeColor.WHITE);
        PINK_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 2, a), DyeColor.PINK);
        PURPLE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.purple), a -> new TallerFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, a), DyeColor.PURPLE);
        TURQUOISE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.of("turquoise", false), a -> new TallerFlowerBlock(MobEffects.WATER_BREATHING, 6, a), DyeColor.LIGHT_BLUE);
        GLOWING_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.of("glowing", false), a -> new TallerFlowerBlock(MobEffects.GLOWING, 4, a), DyeColor.ORANGE);

        RED_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 2, a), DyeColor.RED);
        WHITE_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.GLOWING, 4, a), DyeColor.WHITE);
        PINK_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEAL, 2, a), DyeColor.PINK);
        ORANGE_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.orange), a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 6, a), DyeColor.ORANGE);

        WATER_HYACINTH = construct.registerSameProperty("water_hyacinth", a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.WATER), flowerProp().disableOffset().disableDrop().dye(DyeColor.PINK).build());
        LAVA_HYACINTH = construct.registerSameProperty("lava_hyacinth", a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.LAVA), flowerProp().disableOffset().disableDrop().dye(DyeColor.ORANGE).build());

        BLEEDING_QUADHEART = construct.registerBasic("bleeding_quadheart", MobEffects.HEAL, 3, DyeColor.RED);
        CANDY_BLEEDING_QUADHEART = construct.registerBasic(PrefList.BLEEDING_QUADHEART.of("candy", false), MobEffects.HEALTH_BOOST, 3, DyeColor.PINK);
        HOLLOW_BLEEDING_QUADHEART = construct.registerBasic(PrefList.BLEEDING_QUADHEART.of("hollow", false), MobEffects.WITHER, 8, DyeColor.BLACK);

        BEE_BALM = construct.registerBasic("bee_balm", MobEffects.DIG_SLOWDOWN, 4, DyeColor.YELLOW);

        LAMPBLOSSOM = construct.registerBasic("lampblossom", MobEffects.GLOWING, 4, flowerProp().setGlow(GlowValue.of(6, true)).dye(DyeColor.ORANGE).build());

        PINK_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.pink), MobEffects.HEAL, 3, DyeColor.PINK);
        BLUE_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.blue), MobEffects.CONFUSION, 8, DyeColor.BLUE);
        ORANGE_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.orange), MobEffects.WATER_BREATHING, 4, DyeColor.ORANGE);

        TITAN_ARUM = construct.registerSameProperty("titan_arum", TallFlowerBlock::new, flowerProp().disableOffset().disableDrop().dye(DyeColor.GREEN).build());

        BIRD_OF_PARADISE = construct.registerBasic("bird_of_paradise", MobEffects.SLOW_FALLING, 5, DyeColor.ORANGE);

        TALL_ALLIUM = construct.registerSameProperty("tall_allium", a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 4, a), DyeColor.MAGENTA);
        BLUE_TALL_ALLIUM = construct.registerSameProperty("blue_tall_allium", a -> new TallerFlowerBlock(MobEffects.WATER_BREATHING, 6, a), DyeColor.BLUE);

        WELWITSCHIA = construct.registerSameProperty("welwitschia", a -> new MayPlaceFlowerBlock(MobEffects.FIRE_RESISTANCE, 3, (state, level, pos, defaultBool) -> state.is(BlockTags.SAND) || defaultBool, a), DyeColor.BROWN);
        TORCH_GINGER = construct.registerSameProperty("torch_ginger", a -> new CustomFlowerBedBlock(a, 3),
                flowerProp().disableDrop().disableOffset().dye(DyeColor.RED).build());
        BLUE_HIBISCUS = construct.registerBasic(PrefList.HIBISCUS.colorOf(StraddColor.blue), MobEffects.HEAL, 1, DyeColor.BLUE);
        ORANGE_HIBISCUS = construct.registerBasic(PrefList.HIBISCUS.colorOf(StraddColor.orange), MobEffects.FIRE_RESISTANCE, 2, DyeColor.ORANGE);
        PINK_HIBISCUS = construct.registerBasic(PrefList.HIBISCUS.colorOf(StraddColor.pink), MobEffects.HEALTH_BOOST, 4, DyeColor.PINK);

        DANDELION_BED = construct.registerSameProperty("dandelion_bed", a -> new CustomFlowerBedBlock(a, 4),
                flowerProp().disableDrop().disableOffset().dye(DyeColor.WHITE).build());

        PURPLE_TALL_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.purple), a -> new TallerFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, a), DyeColor.PURPLE);
        BLUE_TALL_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.blue), a -> new TallerFlowerBlock(MobEffects.NIGHT_VISION, 4, a), DyeColor.BLUE);
        RED_TALL_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.HEAL, 4, a), DyeColor.RED);
        WHITE_TALL_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.LEVITATION, 4, a), DyeColor.WHITE);
        YELLOW_TALL_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.yellow), a -> new TallerFlowerBlock(MobEffects.CONFUSION, 4, a), DyeColor.YELLOW);
        PINK_TALL_HYACINTH = construct.registerSameProperty(PrefList.HYACINTH.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 4, a), DyeColor.PINK);

        WHITE_VINE_LOTUS = construct.registerSameProperty(PrefList.VINE_LOTUS.colorOf(StraddColor.white), a -> new VineLotusBlock(MobEffects.NIGHT_VISION, 3, a), flowerProp().disableOffset().dye(DyeColor.WHITE).build());
        PINK_VINE_LOTUS = construct.registerSameProperty(PrefList.VINE_LOTUS.colorOf(StraddColor.pink), a -> new VineLotusBlock(MobEffects.REGENERATION, 2, a), flowerProp().disableOffset().dye(DyeColor.PINK).build());

        SUNFLOWER_BED = construct.registerSameProperty("sunflower_bed", a -> new CustomFlowerBedBlock(a, 4),
                flowerProp().disableOffset().disableDrop().dye(DyeColor.YELLOW).build());
        WATER_POPPY = construct.registerSameProperty("water_poppy", a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.WATER),
                flowerProp().disableOffset().disableDrop().dye(DyeColor.RED).build());

        FIRE_LILY = construct.registerBasic("fire_lily", MobEffects.ABSORPTION, 3, DyeColor.ORANGE);
        WHITE_LACECAP_HYDRANGEA = construct.registerBasic(PrefList.LACECAP_HYDRANGEA.colorOf(StraddColor.white), MobEffects.LEVITATION, 5, DyeColor.WHITE);
        PINK_LACECAP_HYDRANGEA = construct.registerBasic(PrefList.LACECAP_HYDRANGEA.colorOf(StraddColor.pink), MobEffects.HEALTH_BOOST, 5, DyeColor.PINK);
        BLUE_LACECAP_HYDRANGEA = construct.registerBasic(PrefList.LACECAP_HYDRANGEA.colorOf(StraddColor.blue), MobEffects.NIGHT_VISION, 5, DyeColor.BLUE);

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
            return registerAsFlower(name, constructor, new FlowerProperty.Builder().dye(dyeColor).build());
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
            if (Constants.isDevelopment) {
                OddLib.dataGenList.put(name, flowerProp);
            }

            return blocks.register(name, constructors,
                    it -> {
                        BlockBehaviour.Properties prop = setPropFlower(it).offsetType(!flowerProp.isOffset ? BlockBehaviour.OffsetType.NONE : BlockBehaviour.OffsetType.XZ);

                        if (flowerProp.glowVal != null) {
                            prop.emissiveRendering(flowerProp.glowVal.emit);
                            prop.lightLevel(flowerProp.glowVal.glowness);
                        }

                        return prop;
                    }).asDeferredBlock();
        }
    }


    public static class FlowerProperty {
        public final GlowValue glowVal;
        public final DyeColor dyeCol;
        public final boolean isOffset;
        public final boolean customDrop;

        public FlowerProperty(GlowValue glowVal, DyeColor dyeCol, boolean isOffset, boolean hasCustomDrop) {
            this.glowVal = glowVal;
            this.dyeCol = dyeCol;
            this.isOffset = isOffset;
            this.customDrop = hasCustomDrop;
        }

        public static class Builder {
            private GlowValue glowVal = null;
            private boolean isOffset = true;
            private DyeColor dyeCol = DyeColor.WHITE;
            private boolean customDrop = false;

            public Builder setGlow(GlowValue val) {
                this.glowVal = val;
                return this;
            }

            public Builder dye(DyeColor col) {
                this.dyeCol = col;
                return this;
            }

            public Builder disableOffset() {
                this.isOffset = false;
                return this;
            }

            public Builder disableDrop() {
                this.customDrop = true;
                return this;
            }

            public FlowerProperty build() {
                return new FlowerProperty(glowVal, dyeCol, isOffset, customDrop);
            }
        }
    }

    private static class GlowValue {
        public final ToIntFunction<BlockState> glowness;
        public final BlockBehaviour.StatePredicate emit;

        public static GlowValue of(int glow, boolean emit) {
            return new GlowValue(value -> glow, (blockState, blockGetter, blockPos) -> emit);
        }

        public static GlowValue of(ToIntFunction<BlockState> glowness, BlockBehaviour.StatePredicate emit) {
            return new GlowValue(glowness, emit);
        }

        public GlowValue(ToIntFunction<BlockState> glowness, BlockBehaviour.StatePredicate emit) {
            this.glowness = glowness;
            this.emit = emit;
        }
    }
}
