package io.github.magishanpixel.mgnflowers.worldgen.features;

import com.mojang.serialization.Codec;
import io.github.magishanpixel.mgnflowers.block.TallerFlowerBlock;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.TallerFlowerConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class TallerFlowerFeature extends Feature<TallerFlowerConfig> {

    public TallerFlowerFeature(Codec<TallerFlowerConfig> codec) {
        super(codec);
    }

    public Block pickBlock(FeaturePlaceContext<TallerFlowerConfig> context) {
        TallerFlowerConfig config = context.config();
        RandomSource rand = context.level().getRandom();

        return config.flowers().get(rand.nextIntBetweenInclusive(0, config.flowers().size() - 1)).value();
    }

    @Override
    public boolean place(FeaturePlaceContext<TallerFlowerConfig> context) {
        TallerFlowerConfig config = context.config();
        LevelAccessor level = context.level();
        BlockPos origin = context.origin();
        RandomSource rand = level.getRandom();

        return placeFlower(level, origin, pickBlock(context), rand, config.maxHeight());
    }

    public static boolean placeFlower(LevelAccessor level, BlockPos origin, Block block, RandomSource rand, int maxHeight) {
        boolean firstStem = false;
        BlockState bottomState = level.getBlockState(origin.below());

        if (level.isEmptyBlock(origin) && level.isEmptyBlock(origin.above()) && (bottomState.is(BlockTags.DIRT) || bottomState.is(Blocks.FARMLAND))) {
            int max = rand.nextIntBetweenInclusive(2, maxHeight);

            for (int height = 1; height <= max; height++) {
                BlockPos currPos = origin.above(height - 1);

                if (!firstStem) {
                    level.setBlock(currPos, block.defaultBlockState().setValue(TallerFlowerBlock.STEM, 1), 2);
                    firstStem = true;
                } else {
                    if (height >= max || !level.isEmptyBlock(currPos.above())) {
                        level.setBlock(currPos, block.defaultBlockState().setValue(TallerFlowerBlock.STEM, 3), 2);
                        break;
                    } else {
                        level.setBlock(currPos, block.defaultBlockState().setValue(TallerFlowerBlock.STEM, 2), 2);
                    }
                }
            }

            return true;
        }

        return false;
    }
}
