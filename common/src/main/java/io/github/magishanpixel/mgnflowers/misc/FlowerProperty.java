package io.github.magishanpixel.mgnflowers.misc;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

public class FlowerProperty {
    public final GlowValue glowVal;
    public final DyeColor dyeCol;
    public final boolean isOffset;
    public final boolean customDrop;
    public final boolean notSmallFlower;
    public final boolean notHoldable;
    public final BiFunction<Block, Item.Properties, BlockItem> blockItem;

    public FlowerProperty(GlowValue glowVal, DyeColor dyeCol, boolean isOffset, boolean hasCustomDrop, BiFunction<Block, Item.Properties, BlockItem> blockItem, boolean notSmallFlower, boolean notHoldable) {
        this.glowVal = glowVal;
        this.dyeCol = dyeCol;
        this.isOffset = isOffset;
        this.customDrop = hasCustomDrop;
        this.blockItem = blockItem;
        this.notSmallFlower = notSmallFlower;
        this.notHoldable = notHoldable;
    }

    public static class Builder {
        private GlowValue glowVal = null;
        private boolean isOffset = true;
        private DyeColor dyeCol = DyeColor.WHITE;
        private boolean customDrop = false;
        private boolean notSmall = false;
        private boolean notHoldable = false;
        private BiFunction<Block, Item.Properties, BlockItem> blockItem = null;

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

        public Builder setBlockItem(BiFunction<Block, Item.Properties, BlockItem> item) {
            this.blockItem = item;
            return this;
        }

        public Builder notSmall() {
            this.notSmall = true;
            return this;
        }

        public FlowerProperty build() {
            return new FlowerProperty(glowVal, dyeCol, isOffset, customDrop, blockItem, notSmall, notHoldable);
        }
    }

    public static class GlowValue {
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