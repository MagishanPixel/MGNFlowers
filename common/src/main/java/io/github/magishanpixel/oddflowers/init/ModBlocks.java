package io.github.magishanpixel.oddflowers.init;

import io.github.magishanpixel.oddflowers.block.TallFloweryBlock;
import io.github.magishanpixel.oddflowers.block.WaterHyacinthBlock;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.Nullable;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ModBlocks {

    // CUSTOM
    public static DeferredBlock MOTH_IRIS;
    public static DeferredBlock GROTTAL_BLOOM;

    public static DeferredBlock BLUE_TWIN_CENDALION;
    public static DeferredBlock ORANGE_TALL_TULIP;
    public static DeferredBlock RED_GINGER_TULIP;
    public static DeferredBlock WATER_HYACINTH;
    public static DeferredBlock LAVA_HYACINTH;

    public static void init(BalmBlockRegistrar blocks) {
        FloweryConstruct construct = new FloweryConstruct(blocks);
        MOTH_IRIS = construct.registerBasic("moth_iris", MobEffects.LEVITATION, 2);
        GROTTAL_BLOOM = construct.registerBasic("grottal_bloom", MobEffects.GLOWING, 4, GlowValue.of(6, true));
        BLUE_TWIN_CENDALION = construct.registerBasic("blue_twin_cendalion", MobEffects.WATER_BREATHING, 4);
        ORANGE_TALL_TULIP = construct.registerSameProperty("orange_tall_tulip",
                a -> new TallFloweryBlock(MobEffects.FIRE_RESISTANCE, 1, a)
        );
        RED_GINGER_TULIP = construct.registerSameProperty("red_tall_tulip",
                a -> new TallFloweryBlock(MobEffects.HEALTH_BOOST, 2, a)
        );
        WATER_HYACINTH = construct.registerSameProperty("water_hyacinth",
                a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.WATER)
        );
        LAVA_HYACINTH = construct.registerSameProperty("lava_hyacinth",
                a -> new WaterHyacinthBlock(a, WaterHyacinthBlock.TYPE.LAVA)
        );
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

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds) {
            return registerBasic(name, suspiciousStew, lastSeconds, null);
        }

        public DeferredBlock registerBasic(String name, Holder<MobEffect> suspiciousStew, int lastSeconds, @Nullable GlowValue glowValue) {
            return blocks.register(name, a -> new FlowerBlock(suspiciousStew, lastSeconds, a),
                    it -> {
                        BlockBehaviour.Properties prop = setPropFlower(it);
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
