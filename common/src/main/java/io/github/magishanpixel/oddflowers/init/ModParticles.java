package io.github.magishanpixel.oddflowers.init;

import net.blay09.mods.balm.client.particle.BalmParticleProviderRegistrar;
import net.blay09.mods.balm.core.particles.BalmParticleTypeRegistrar;
import net.minecraft.client.particle.SimpleAnimatedParticle;

import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;

public class ModParticles {
    public static Holder<SimpleParticleType> BEE;
    public static Holder<SimpleParticleType> CRIMSON_FIREFLY;
    public static Holder<SimpleParticleType> WARPED_FIREFLY;
    public static Holder<SimpleParticleType> STAR_FALLING;

    public static void init(BalmParticleTypeRegistrar particles) {
        BEE = particles.register("bee", false).asHolder();
        CRIMSON_FIREFLY = particles.register("crimson_firefly", false).asHolder();
        WARPED_FIREFLY = particles.register("warped_firefly", false).asHolder();
        STAR_FALLING = particles.register("star_falling", false).asHolder();
    }
}
