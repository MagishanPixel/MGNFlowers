package io.github.magishanpixel.mgnflowers.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class MayPlaceFlowerBlock extends FlowerBlock {
    private final MayPlace mayPlace;

    public MayPlaceFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, @Nullable MayPlace mayPlace, Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
        this.mayPlace = mayPlace;
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
