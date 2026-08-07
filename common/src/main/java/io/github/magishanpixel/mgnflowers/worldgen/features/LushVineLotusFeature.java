package io.github.magishanpixel.mgnflowers.worldgen.features;

import com.mojang.serialization.Codec;
import io.github.magishanpixel.mgnflowers.block.TallerFlowerBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.material.Fluids;

public class LushVineLotusFeature extends Feature<NoneFeatureConfiguration> {
    public LushVineLotusFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        RandomSource rand = context.random();
        BlockPos origin = context.origin();

        BlockState ogState = level.getBlockState(origin);
        //(ogState.is(Blocks.CLAY) || ogState.getFluidState().is(Fluids.WATER)) && level.getBlockState(origin.below()).is(Blocks.CLAY)
        if (ogState.isAir() || ogState.getFluidState().is(Fluids.WATER)) {
            /*
            if (ogState.is(Blocks.CLAY)) {
                boolean fond = false;
                for (int y = 1; y <= 20; y++) {
                    BlockPos v = origin.above(y);
                    BlockState st = level.getBlockState(v);

                    if (st.isAir() || st.getFluidState().is(Fluids.WATER)) {
                        fond = true;
                        origin = v;
                        break;
                    } else if (!st.is(Blocks.CLAY)) {
                        break;
                    }
                }

                if (!fond) {
                    return false;
                }
            }*/
            //level.getBlockState(origin).isAir() || level.getBlockState(origin).getFluidState().is(Fluids.WATER)




            //return true;
        }

        //level.setBlock(origin, Blocks.REDSTONE_BLOCK.defaultBlockState(), 2);

        int maxHeight = rand.nextIntBetweenInclusive(1, 3);
        boolean firstStem = false;

        for (int y = 0; y <= maxHeight; y++) {
            BlockPos targPos = origin.above(y);
            BlockState aboveState = level.getBlockState(targPos.above());
            int numStem = 3;

            if ((aboveState.isAir() || aboveState.getFluidState().is(Fluids.WATER)) && y < maxHeight) {
                if (!firstStem) {
                    firstStem = true;
                    numStem = 1;
                } else {
                    numStem = 2;
                }
            }

            level.setBlock(targPos, ModBlocks.GLOWING_VINE_LOTUS.defaultBlockState().setValue(TallerFlowerBlock.STEM, numStem).setValue(BlockStateProperties.WATERLOGGED, level.getBlockState(targPos).is(Blocks.WATER)), 2);

            if (numStem == 3) {
                break;
            }
        }

        return true;
    }
}
