package io.github.magishanpixel.mgnflowers.worldgen.features;

import com.mojang.serialization.Codec;
import io.github.magishanpixel.mgnflowers.block.VineLotusBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class VineLotusFeature extends Feature<NoneFeatureConfiguration> {
    public VineLotusFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();
        RandomSource rand = context.random();

        if (level.getBlockState(origin.below()).is(Blocks.WATER)) {
            Block block = switch (rand.nextIntBetweenInclusive(1, 2)) {
                case 2 -> ModBlocks.WHITE_VINE_LOTUS.asBlock();
                default -> ModBlocks.PINK_VINE_LOTUS.asBlock();
            };

            int currY = 1;
            int maxTop = rand.nextIntBetweenInclusive(0, 2);

            for (int i = 0; i <= maxTop; i++) {
                BlockPos pos = origin.above(i);
                if (!level.getBlockState(pos.above()).isAir() || i >= maxTop) {
                    level.setBlock(pos, block.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false).setValue(VineLotusBlock.STEM, 3), 3);
                    break;
                }
                level.setBlock(pos, block.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false).setValue(VineLotusBlock.STEM, 2), 2);
            }

            while(currY < 50) {
                BlockPos pos = origin.below(currY);
                BlockState bottomState = level.getBlockState(pos.below());

                if (!bottomState.is(Blocks.WATER) && !bottomState.canBeReplaced()) {
                    level.setBlock(pos, block.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, true).setValue(VineLotusBlock.STEM, 1), 2);
                    break;
                } else {
                    level.setBlock(pos, block.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, true).setValue(VineLotusBlock.STEM, 2), 2);
                    currY++;
                }
            }

         return true;
        }

        return false;
    }
}
