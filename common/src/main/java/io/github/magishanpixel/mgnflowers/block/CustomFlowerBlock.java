package io.github.magishanpixel.mgnflowers.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class CustomFlowerBlock extends FlowerBlock {
    private final MayPlace mayPlace;
    private final VoxelShape MY_SHAPE;

    public CustomFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, @Nullable MayPlace mayPlace, Properties properties) {
        this(suspiciousStewEffect, effectDuration, mayPlace, null, properties);
    }

    public CustomFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, @Nullable MayPlace mayPlace, @Nullable VoxelShape shape, Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
        this.mayPlace = mayPlace;
        this.MY_SHAPE = shape;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return MY_SHAPE == null ? super.getShape(state, level, pos, context) : MY_SHAPE;
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
