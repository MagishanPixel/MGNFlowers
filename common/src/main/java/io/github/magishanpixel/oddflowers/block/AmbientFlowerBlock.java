package io.github.magishanpixel.oddflowers.block;

import io.github.magishanpixel.oddflowers.OddFlowers;
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
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class AmbientFlowerBlock extends FlowerBlock {
    private final MayPlace mayPlace;
    private final Supplier<ParticleOptions> particleFetcher;
    private final AmbientSettings ambientSettings;

    public AmbientFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, @Nullable MayPlace mayPlace, Supplier<ParticleOptions> particleFetcher, Properties properties) {
        this(suspiciousStewEffect, effectDuration, mayPlace, particleFetcher, new AmbientSettings(0.1f, 0f, Vec3.ZERO), properties);
    }

    public AmbientFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, @Nullable MayPlace mayPlace, Supplier<ParticleOptions> particleFetcher, AmbientSettings ambientSet, Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
        this.mayPlace = mayPlace;
        this.particleFetcher = particleFetcher;
        this.ambientSettings = ambientSet;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        Vec3 v = pos.getCenter().add(ambientSettings.offset);

        if (random.nextFloat() <= 0.1f) {
            level.addParticle(
                    particleFetcher.get(),
                    v.x + OddLib.floatInRange(random, -ambientSettings.range, ambientSettings.range),
                    v.y + OddLib.floatInRange(random, -ambientSettings.range, ambientSettings.range),
                    v.z + OddLib.floatInRange(random, -ambientSettings.range, ambientSettings.range),
                    0,0,0
            );
        }


    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        if (mayPlace == null) {
            return super.mayPlaceOn(state,level,pos);
        }

        return mayPlace.check(state, level, pos, super.mayPlaceOn(state, level, pos));
    }


    public interface MayPlace {
        boolean check(BlockState state, BlockGetter level, BlockPos pos, boolean defaultBool);
    }

    public record AmbientSettings(float chance, float range, Vec3 offset) {}
}
