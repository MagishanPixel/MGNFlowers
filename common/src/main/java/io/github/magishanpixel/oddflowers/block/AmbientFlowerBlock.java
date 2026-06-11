package io.github.magishanpixel.oddflowers.block;

import io.github.magishanpixel.oddflowers.misc.OddLib;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class AmbientFlowerBlock extends FlowerBlock {
    private final MayPlace mayPlace;
    private final FetchParticle particleFetcher;

    public AmbientFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, MayPlace mayPlace, FetchParticle particleFetcher, Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
        this.mayPlace = mayPlace;
        this.particleFetcher = particleFetcher;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        level.addParticle(
                particleFetcher.get(),
                0.5d + OddLib.doubleInRange(random, -0.5d, 0.5d),
                0.5d + OddLib.doubleInRange(random, -0.5d, 0.5d),
                0.5d + OddLib.doubleInRange(random, -0.5d, 0.5d),
                0,0,0
        );
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return mayPlace.check(state, level, pos, super.mayPlaceOn(state, level, pos));
    }

    public interface FetchParticle {
        ParticleOptions get();
    }

    public interface MayPlace {
        boolean check(BlockState state, BlockGetter level, BlockPos pos, boolean defaultBool);
    }
}
