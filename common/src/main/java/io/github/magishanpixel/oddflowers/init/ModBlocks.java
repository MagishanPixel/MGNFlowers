package io.github.magishanpixel.oddflowers.init;

import io.github.magishanpixel.oddflowers.block.AmbientFlowerBlock;
import io.github.magishanpixel.oddflowers.block.TallerFlowerBlock;
import io.github.magishanpixel.oddflowers.block.WaterHyacinthBlock;
import io.github.magishanpixel.oddflowers.misc.PrefList;
import io.github.magishanpixel.oddflowers.misc.StraddColor;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ModBlocks {

    // CUSTOM
    public static DeferredBlock MOTH_IRIS;
    public static DeferredBlock GROTTAL_BLOOM;

    public static DeferredBlock BLUE_TWIN_CENDALION;
    public static DeferredBlock ORANGE_TWIN_CENDALION;
    public static DeferredBlock WHITE_TWIN_CENDALION;
    public static DeferredBlock RED_TWIN_CENDALION;
    public static DeferredBlock PINK_TWIN_CENDALION;

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
    public static DeferredBlock WARPED_BALM;
    public static DeferredBlock CRIMSON_BALM;

    public static DeferredBlock LAMPBLOSSOM;

    public static DeferredBlock PINK_ROMENTA;
    public static DeferredBlock BLUE_ROMENTA;
    public static DeferredBlock ORANGE_ROMENTA;

    public static DeferredBlock JUNGOISEAU;
    public static DeferredBlock TITAN_ARUM;

    public static DeferredBlock TALL_ALLIUM;
    public static DeferredBlock BLUE_TALL_ALLIUM;

    public static void init(BalmBlockRegistrar blocks) {
        FloweryConstruct construct = new FloweryConstruct(blocks);
        MOTH_IRIS = construct.registerBasic("moth_iris", MobEffects.LEVITATION, 2);
        GROTTAL_BLOOM = construct.registerBasic("grottal_bloom", MobEffects.GLOWING, 4, GlowValue.of(6, true));

        BLUE_TWIN_CENDALION = construct.registerBasic(PrefList.TWIN_CENDALION.colorOf(StraddColor.blue), MobEffects.WATER_BREATHING, 4);
        ORANGE_TWIN_CENDALION = construct.registerBasic(PrefList.TWIN_CENDALION.colorOf(StraddColor.orange), MobEffects.FIRE_RESISTANCE, 5);
        WHITE_TWIN_CENDALION = construct.registerBasic(PrefList.TWIN_CENDALION.colorOf(StraddColor.white), MobEffects.CONFUSION, 6);
        RED_TWIN_CENDALION = construct.registerBasic(PrefList.TWIN_CENDALION.colorOf(StraddColor.red), MobEffects.ABSORPTION, 2);
        PINK_TWIN_CENDALION = construct.registerBasic(PrefList.TWIN_CENDALION.colorOf(StraddColor.pink), MobEffects.HEAL, 2);

        ORANGE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.orange), a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 1, a));
        RED_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.DAMAGE_RESISTANCE, 4, a));
        WHITE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.LEVITATION, 3, a));
        PINK_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 2, a));
        PURPLE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.colorOf(StraddColor.purple), a -> new TallerFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, a));
        TURQUOISE_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.of("turquoise",false), a -> new TallerFlowerBlock(MobEffects.WATER_BREATHING, 6, a));
        GLOWING_TALL_TULIP = construct.registerSameProperty(PrefList.TALL_TULIP.of("glowing",false), a -> new TallerFlowerBlock(MobEffects.GLOWING, 4, a));

        RED_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.red), a -> new TallerFlowerBlock(MobEffects.HEALTH_BOOST, 2, a));
        WHITE_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.white), a -> new TallerFlowerBlock(MobEffects.GLOWING, 4, a));
        PINK_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.pink), a -> new TallerFlowerBlock(MobEffects.HEAL, 2, a));
        ORANGE_GINGER_TULIP = construct.registerSameProperty(PrefList.GINGER_TULIP.colorOf(StraddColor.orange), a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 6, a));

        WATER_HYACINTH = blocks.register("water_hyacinth", a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.WATER), properties -> setPropFlower(properties).offsetType(BlockBehaviour.OffsetType.NONE)).asDeferredBlock();
        LAVA_HYACINTH = blocks.register("lava_hyacinth", a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.LAVA), properties -> setPropFlower(properties).offsetType(BlockBehaviour.OffsetType.NONE)).asDeferredBlock();

        BLEEDING_QUADHEART = construct.registerBasic("bleeding_quadheart", MobEffects.HEAL, 3);
        CANDY_BLEEDING_QUADHEART = construct.registerBasic(PrefList.BLEEDING_QUADHEART.of("candy", false), MobEffects.HEALTH_BOOST, 3);
        HOLLOW_BLEEDING_QUADHEART = construct.registerBasic(PrefList.BLEEDING_QUADHEART.of("hollow", false), MobEffects.WITHER, 8);

        BEE_BALM = blocks.register("bee_balm", a -> new AmbientFlowerBlock(MobEffects.DIG_SLOWDOWN, 4,
                null,
                () -> ModParticles.BEE.value(), a), p -> setPropFlower(p).randomTicks()
        ).asDeferredBlock();
        WARPED_BALM = blocks.register("warped_balm", a -> new AmbientFlowerBlock(MobEffects.DARKNESS, 4,
                (state, level, pos, defaultBool) -> state.is(BlockTags.NYLIUM) || defaultBool,
                () -> ModParticles.WARPED_FIREFLY.value(), a), p -> setPropFlower(p).randomTicks()
        ).asDeferredBlock();
        CRIMSON_BALM = blocks.register("crimson_balm", a -> new AmbientFlowerBlock(MobEffects.FIRE_RESISTANCE, 4,
                (state, level, pos, defaultBool) -> state.is(BlockTags.NYLIUM) || defaultBool,
                () -> ModParticles.CRIMSON_FIREFLY.value(), a), p -> setPropFlower(p).randomTicks()
        ).asDeferredBlock();

        LAMPBLOSSOM = construct.registerBasic("lampblossom", MobEffects.GLOWING, 4, new GlowValue(value -> 6, (blockState, blockGetter, blockPos) -> true));

        PINK_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.pink), MobEffects.HEAL, 3);
        BLUE_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.blue), MobEffects.CONFUSION, 8);
        ORANGE_ROMENTA = construct.registerBasic(PrefList.ROMENTA.colorOf(StraddColor.orange), MobEffects.WATER_BREATHING, 4);

        TITAN_ARUM = construct.registerSameProperty("titan_arum", TallFlowerBlock::new, false);

        JUNGOISEAU = construct.registerBasic("jungoiseau", MobEffects.SLOW_FALLING, 5);

        TALL_ALLIUM = construct.registerSameProperty("tall_allium", a -> new TallerFlowerBlock(MobEffects.FIRE_RESISTANCE, 4, a));
        BLUE_TALL_ALLIUM = construct.registerSameProperty("blue_tall_allium", a -> new TallerFlowerBlock(MobEffects.WATER_BREATHING, 6, a));
    }

    private static BlockBehaviour.Properties setPropFlower(BlockBehaviour.Properties prop) {
        return prop.mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY);
    }

    private static class FloweryConstruct {
        private final BalmBlockRegistrar blocks;

        public FloweryConstruct(BalmBlockRegistrar reg) {
            this.blocks = reg;
        }

        public DeferredBlock registerSameProperty(String name, Function<BlockBehaviour.Properties, Block> constructor) {
            return blocks.register(name, constructor, ModBlocks::setPropFlower).asDeferredBlock();
        }

        public DeferredBlock registerSameProperty(String name, Function<BlockBehaviour.Properties, Block> constructor, boolean offset) {
            return blocks.register(name, constructor,a -> setPropFlower(a).offsetType(!offset ? BlockBehaviour.OffsetType.NONE : BlockBehaviour.OffsetType.XZ)).asDeferredBlock();
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds) {
            return registerBasic(name, suspiciousStew, lastSeconds, null, false);
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds, boolean offset) {
            return registerBasic(name, suspiciousStew, lastSeconds, null, offset);
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds, @Nullable GlowValue glowValue) {
            return registerBasic(name, suspiciousStew, lastSeconds, glowValue, false);
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds, @Nullable GlowValue glowValue, boolean offset) {
            return blocks.register(name, a -> new FlowerBlock(suspiciousStew, lastSeconds, a),
                    it -> {
                        BlockBehaviour.Properties prop = setPropFlower(it).offsetType(!offset ? BlockBehaviour.OffsetType.NONE : BlockBehaviour.OffsetType.XZ);
                        if (glowValue != null) {
                            prop.emissiveRendering(glowValue.emit);
                            prop.lightLevel(glowValue.glowness);
                        }
                        return prop;
                    }).asDeferredBlock();
        };


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
