package io.github.magishanpixel.mgnflowers.worldgen.features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.magishanpixel.mgnflowers.worldgen.features.provider.NoiseBlockProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public record NoiseTallerFlowerConfig(int maxHeight, long seed, NormalNoise.NoiseParameters noiseParams, float scale, List<Holder<Block>> flowers) implements FeatureConfiguration {
    public static final Codec<NoiseTallerFlowerConfig> CODEC = RecordCodecBuilder.create(inst -> inst.group(
            Codec.INT.fieldOf("max_height").forGetter(NoiseTallerFlowerConfig::maxHeight),
            Codec.LONG.fieldOf("seed").forGetter(NoiseTallerFlowerConfig::seed),
            NormalNoise.NoiseParameters.DIRECT_CODEC.fieldOf("noise").forGetter(NoiseTallerFlowerConfig::noiseParams),
            Codec.FLOAT.fieldOf("scale").forGetter(NoiseTallerFlowerConfig::scale),
            Codec.list(BuiltInRegistries.BLOCK.holderByNameCodec())
                    .fieldOf("flowers").forGetter(NoiseTallerFlowerConfig::flowers)
    ).apply(inst, NoiseTallerFlowerConfig::new));


}
