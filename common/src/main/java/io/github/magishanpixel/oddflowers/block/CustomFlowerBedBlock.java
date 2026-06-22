package io.github.magishanpixel.oddflowers.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomFlowerBedBlock extends BushBlock implements BonemealableBlock {
    private final int MAX_COUNT;
    public static final IntegerProperty AMOUNT = IntegerProperty.create("flower_amount", 1, 8);
    public static final DirectionProperty  FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final MapCodec<CustomFlowerBedBlock> CODEC = simpleCodec(CustomFlowerBedBlock::new);
    private static final VoxelShape SHAPE = Block.box((double)0.0F, (double)0.0F, (double)2.0F, (double)16.0F, (double)5.0F, (double)16.0F);

    public CustomFlowerBedBlock(Properties properties) {
        super(properties);
        this.MAX_COUNT = 4;
    }

    public CustomFlowerBedBlock(Properties properties, int maxCount) {
        super(properties);
        this.MAX_COUNT = maxCount;
    }

    public BlockState rotate(BlockState p_273485_, Rotation p_273021_) {
        return (BlockState)p_273485_.setValue(FACING, p_273021_.rotate((Direction)p_273485_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_272961_, Mirror p_273278_) {
        return p_272961_.rotate(p_273278_.getRotation((Direction)p_272961_.getValue(FACING)));
    }

    public boolean canBeReplaced(BlockState p_272922_, BlockPlaceContext p_273534_) {
        return !p_273534_.isSecondaryUseActive() && p_273534_.getItemInHand().is(this.asItem()) && (Integer)p_272922_.getValue(AMOUNT) < MAX_COUNT ? true : super.canBeReplaced(p_272922_, p_273534_);
    }

    public VoxelShape getShape(BlockState p_273399_, BlockGetter p_273568_, BlockPos p_273314_, CollisionContext p_273274_) {
        return SHAPE;
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_273158_) {
        BlockState blockstate = p_273158_.getLevel().getBlockState(p_273158_.getClickedPos());
        return blockstate.is(this) ? (BlockState)blockstate.setValue(AMOUNT, Math.min(MAX_COUNT, (Integer)blockstate.getValue(AMOUNT) + 1)) : (BlockState)this.defaultBlockState().setValue(FACING, p_273158_.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_272634_) {
        p_272634_.add(new Property[]{FACING, AMOUNT});
    }

    public boolean isValidBonemealTarget(LevelReader p_272968_, BlockPos p_273762_, BlockState p_273662_) {
        return true;
    }

    public boolean isBonemealSuccess(Level p_272604_, RandomSource p_273609_, BlockPos p_272988_, BlockState p_273231_) {
        return true;
    }

    public void performBonemeal(ServerLevel p_273476_, RandomSource p_273093_, BlockPos p_272601_, BlockState p_272683_) {
        int i = (Integer)p_272683_.getValue(AMOUNT);
        if (i < MAX_COUNT) {
            p_273476_.setBlock(p_272601_, (BlockState)p_272683_.setValue(AMOUNT, i + 1), 2);
        } else {
            popResource(p_273476_, p_272601_, new ItemStack(this));
        }

    }

    @Override
    protected MapCodec<? extends BushBlock> codec() {
        return CODEC;
    }
}
