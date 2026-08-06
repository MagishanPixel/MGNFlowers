package io.github.magishanpixel.mgnflowers.worldgen.features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

import java.util.List;

public record TallerFlowerConfig(int maxHeight, List<Holder<Block>> flowers) implements FeatureConfiguration {
    public static final Codec<TallerFlowerConfig> CODEC = RecordCodecBuilder.create(inst -> inst.group(
            Codec.INT.fieldOf("max_height").forGetter(TallerFlowerConfig::maxHeight),
            Codec.list(BuiltInRegistries.BLOCK.holderByNameCodec())
                    .fieldOf("flowers")
                    .forGetter(TallerFlowerConfig::flowers)
    ).apply(inst, TallerFlowerConfig::new));
}