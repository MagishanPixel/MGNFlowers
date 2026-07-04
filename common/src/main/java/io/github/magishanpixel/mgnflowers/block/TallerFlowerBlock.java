package io.github.magishanpixel.mgnflowers.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class TallerFlowerBlock extends FlowerBlock {
    public static final IntegerProperty STEM = IntegerProperty.create("stem", 0, 3);
    private static final VoxelShape TALL_SHAPE = Block.box((double)3.0F, (double)0.0F, (double)3.0F, (double)13.0F, (double)16.0F, (double)13.0F);
    public final boolean canBeShort;

    public TallerFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, Properties properties) {
        this(suspiciousStewEffect, effectDuration, false, properties);
    }

    public TallerFlowerBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, boolean canBeShort, Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(STEM, canBeShort ? 0 : 1));
        this.canBeShort = canBeShort;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(STEM);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return super.mayPlaceOn(state, level, pos) || state.is(this);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        return super.updateShape(
                updateStem(state, level, currentPos),
                facing,facingState,level,currentPos,facingPos
        );
    }

    private BlockState updateStem(BlockState state, LevelAccessor level, BlockPos pos) {
        BlockState up = level.getBlockState(pos.above());
        BlockState down = level.getBlockState(pos.below());

        BlockState resState = state;

        if (up.is(this) && down.is(this)) {
            resState = resState.setValue(STEM, 2);
        } else if (up.is(this) && (!down.is(this))) {
            resState = resState.setValue(STEM, 1);
        }   else if (!up.is(this) && (down.is(this))) {
            resState = resState.setValue(STEM, 3);
        } else if (!up.is(this) && !down.is(this)) {
            if (canBeShort) {
                resState = resState.setValue(STEM, 0);
            } else {
                level.destroyBlock(pos, true);
            }
        }

        return resState;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return updateStem(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos());
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        if (canBeShort) return;

        if (!level.getBlockState(pos.below()).is(this)) {
            boolean extraBool = false;

            if (placer != null) {
                if (placer.hasInfiniteMaterials()) {
                    extraBool = true;
                }
            }

            if ((stack.getCount() > 1 || extraBool) && level.getBlockState(pos.above()).canBeReplaced()) {
                level.setBlock(pos.above(), this.defaultBlockState().setValue(STEM, 3), 3);
                stack.shrink(1);
            } else {
                level.destroyBlock(pos, true);
            }
        }

    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 vec3 = state.getOffset(level, pos);
        return TALL_SHAPE.move(vec3.x, vec3.y, vec3.z);
    }
}
