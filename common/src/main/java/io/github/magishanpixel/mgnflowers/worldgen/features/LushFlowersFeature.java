package io.github.magishanpixel.mgnflowers.worldgen.features;

import com.mojang.serialization.Codec;
import io.github.magishanpixel.mgnflowers.block.TallerFlowerBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class LushFlowersFeature extends Feature<NoneFeatureConfiguration> {
    public LushFlowersFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    private static Block getBlock(RandomSource rand) {
        int v = rand.nextIntBetweenInclusive(1, 3);

        return switch (v) {
            case 2 -> ModBlocks.GLOWING_TALL_TULIP.asBlock();
            case 3 -> ModBlocks.LAMPBLOSSOM.asBlock();
            default -> ModBlocks.GROTTAL_BLOOM.asBlock();
        };
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();
        RandomSource rand = context.random();
        Block block = getBlock(rand);

        if (block.defaultBlockState().canSurvive(level, origin)) {
            if (block instanceof TallerFlowerBlock tallerFlower) {
                if (level.getBlockState(origin.above()).isAir()) {
                    int maxHeight = rand.nextIntBetweenInclusive(1, 3);
                    boolean firstStem = false;

                    for (int y = 0; y <= maxHeight; y++) {
                        BlockPos targPos = origin.above(y);
                        int numStem = 3;

                        if (level.getBlockState(targPos.above()).isAir() && y < maxHeight) {
                            if (!firstStem) {
                                firstStem = true;
                                numStem = 1;
                            } else {
                                numStem = 2;
                            }
                        }

                        level.setBlock(targPos, tallerFlower.defaultBlockState().setValue(TallerFlowerBlock.STEM, numStem), 2);
                    }

                } else {
                    level.setBlock(origin, ModBlocks.GROTTAL_BLOOM.defaultBlockState(), 2);
                }
            } else {
                level.setBlock(origin, block.defaultBlockState(), 2);
            }
            return true;
        }

        return false;
    }
}
