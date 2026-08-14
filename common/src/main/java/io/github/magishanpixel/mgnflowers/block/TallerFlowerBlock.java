package io.github.magishanpixel.mgnflowers.block;

import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
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
    protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess tickAccess, BlockPos pos, Direction p_401236_, BlockPos p_401082_, BlockState p_401336_, RandomSource p_401169_) {

        BlockState resState = updateStem(state, level, pos, false);

        if (resState != null) {
            return resState;
        } else {
            tickAccess.scheduleTick(pos, this, 1);
        }

        return state;
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!canSurvive(state, level, pos) || (state.getValue(STEM) == 1 && !canBeShort && !level.getBlockState(pos.above()).is(this))) {
            level.destroyBlock(pos, true);
        }
    }

    private BlockState updateStem(BlockState state, LevelReader level, BlockPos pos, boolean firstPlace) {
        BlockState up = level.getBlockState(pos.above());
        BlockState down = level.getBlockState(pos.below());

        BlockState resState = state;

        if (canSurvive(state, level, pos)) {
            if (up.is(this) && down.is(this)) {
                resState = resState.setValue(STEM, 2);
            } else if (up.is(this) && (!down.is(this))) {
                resState = resState.setValue(STEM, 1);
            }   else if (!up.is(this) && (down.is(this))) {
                resState = resState.setValue(STEM, 3);
            } else if (!up.is(this) && !down.is(this)) {
                if (canBeShort) {
                    resState = resState.setValue(STEM, 0);
                } else if (firstPlace) {
                    resState = resState.setValue(STEM, 1);
                } else  {
                    return null;
                }
            }
        } else {
            return null;
        }


        return resState;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {

        return updateStem(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos(), true);
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
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 vec3 = state.getOffset(pos);
        return TALL_SHAPE.move(vec3.x, vec3.y, vec3.z);
    }
}
