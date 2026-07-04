package io.github.magishanpixel.mgnflowers.worldgen.features.provider;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseBasedStateProvider;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public class NoiseBlockProvider extends NoiseBasedStateProvider {
    public static final MapCodec<NoiseBlockProvider> CODEC = RecordCodecBuilder.mapCodec(
            inst -> noiseCodec(inst)
                    .and(Codec.list(BuiltInRegistries.BLOCK.holderByNameCodec())
                            .fieldOf("blocks").forGetter(NoiseBlockProvider::myBlocks))
                    .apply(inst, NoiseBlockProvider::new)
    );

    public final List<Holder<Block>> blocks;

    public List<Holder<Block>> myBlocks() {
        return this.blocks;
    }

    public NoiseBlockProvider(long seed, NormalNoise.NoiseParameters parameters, float scale, List<Holder<Block>> blocks) {
        super(seed, parameters, scale);
        this.blocks = blocks;
    }

    @Override
    protected BlockStateProviderType<?> type() {
        return null;
    }

    @Override
    public BlockState getState(RandomSource randomSource, BlockPos blockPos) {
        return null;
    }
}
