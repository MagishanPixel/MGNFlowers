package io.github.magishanpixel.mgnflowers.forge.mixin;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinTest {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void what(GameConfig p_91084_, CallbackInfo ci) {
        MGNConstants.LOG.info("HELOOOOWWW");
    }
}
