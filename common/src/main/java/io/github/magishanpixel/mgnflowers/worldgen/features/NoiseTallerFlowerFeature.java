package io.github.magishanpixel.mgnflowers.worldgen.features;

import com.mojang.serialization.Codec;
import io.github.magishanpixel.mgnflowers.worldgen.features.config.NoiseTallerFlowerConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public class NoiseTallerFlowerFeature extends Feature<NoiseTallerFlowerConfig> {
    public NoiseTallerFlowerFeature(Codec<NoiseTallerFlowerConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoiseTallerFlowerConfig> context) {
        LevelAccessor level = context.level();
        BlockPos origin = context.origin();
        NoiseTallerFlowerConfig config = context.config();
        RandomSource rand = context.random();

        NormalNoise noise = NormalNoise.create(new WorldgenRandom(new LegacyRandomSource(config.seed())), config.noiseParams());
        double resNoise = noise.getValue((double)origin.getX() * config.scale(), (double)origin.getY() * config.scale(), (double)origin.getZ() * config.scale());
        double resval = Mth.clamp(((double)1.0F + resNoise) / (double)2.0F, (double)0.0F, 0.9999);

        List<Holder<Block>> list = context.config().flowers();
        Block block = list.get((int)(resval * (double)list.size())).value();

        return TallerFlowerFeature.placeFlower(level, origin, block, rand, config.maxHeight());
    }
}
