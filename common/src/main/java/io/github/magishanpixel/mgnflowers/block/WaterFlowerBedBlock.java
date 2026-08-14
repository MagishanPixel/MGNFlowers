package io.github.magishanpixel.mgnflowers.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class WaterFlowerBedBlock extends CustomFlowerBedBlock {
    public enum TYPE {
        LAVA,
        WATER
    }

    private final TYPE hyacinthType;

    public WaterFlowerBedBlock(Properties properties, TYPE type) {
        super(properties);
        this.hyacinthType = type;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        FluidState fluidstate = level.getFluidState(pos);
        FluidState fluidstate1 = level.getFluidState(pos.above());
        if (this.hyacinthType.equals(TYPE.LAVA)) {
            return fluidstate.getType() == Fluids.LAVA;
        }
        return (fluidstate.getType() == Fluids.WATER || state.getBlock() instanceof IceBlock) && fluidstate1.getType() == Fluids.EMPTY;
    }


}
