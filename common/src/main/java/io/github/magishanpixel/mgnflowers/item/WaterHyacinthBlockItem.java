package io.github.magishanpixel.mgnflowers.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;

public class WaterHyacinthBlockItem extends BlockItem {
    public WaterHyacinthBlockItem(Block block, Properties prop) {
        super(block, prop);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        return InteractionResult.PASS;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player plr, InteractionHand hand) {
        BlockHitResult res;
        BlockHitResult blockhitresult = getPlayerPOVHitResult(level, plr, ClipContext.Fluid.SOURCE_ONLY);

        if (!plr.level().getBlockState(blockhitresult.getBlockPos()).getFluidState().isSource()) {
            res = getPlayerPOVHitResult(level, plr, ClipContext.Fluid.ANY);
        } else {
            res = blockhitresult.withPosition(blockhitresult.getBlockPos().above());
        }

        InteractionResult interactionresult = super.useOn(new UseOnContext(plr, hand, res));
        return new InteractionResultHolder(interactionresult, plr.getItemInHand(hand));
    }
}
