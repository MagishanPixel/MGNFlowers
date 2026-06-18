package io.github.magishanpixel.oddflowers.client.particle;

import io.github.magishanpixel.oddflowers.misc.OddLib;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

public class FlyParticle extends TextureSheetParticle {
    private static final float mainScale = 0.1f;
    private final int amountMoves;
    private int totalMoves = 1;
    private final double multMoves;
    private final boolean lit;

    public FlyParticle(ClientLevel level, double x, double y, double z, SpriteSet spriteSet, boolean lit) {
        super(level, x, y, z);

        RandomSource rand = level.getRandom();

        this.quadSize = 0;
        this.setLifetime(rand.nextIntBetweenInclusive(200, 600));
        this.pickSprite(spriteSet);
        this.setSpriteFromAge(spriteSet);
        this.friction = 0.9f;
        this.setParticleSpeed(
                OddLib.doubleInRange(random, -0.2d, 0.2d),
                OddLib.doubleInRange(random, -0.2d, 0.2d),
                OddLib.doubleInRange(random, -0.2d, 0.2d)
        );
        this.amountMoves = rand.nextIntBetweenInclusive(1, 4);
        this.multMoves = OddLib.doubleInRange(rand,0.15, 0.3);
        this.lit = lit;

    }

    @Override
    public void tick() {
        super.tick();

        if (!this.isAlive()) return;

        // SCALE TRANSITION
        int transitionTick = (int) (this.getLifetime()*0.15);
        int endTick = this.getLifetime() - transitionTick;

        float sz = mainScale;

        if (age < endTick) {
            if (age < transitionTick) {
                sz = OddLib.tweenHandling(0, mainScale, OddLib.alphaHandling((float) age,(float) transitionTick));
            }
        } else {
            sz = OddLib.tweenHandling(mainScale, 0, OddLib.alphaHandling((float) (age - endTick), (float) transitionTick));
        }

        this.quadSize = sz;

        // MOVINGGG
        if (totalMoves <= amountMoves) {
            if (age >= getLifetime() * (multMoves * totalMoves)) {
                this.setParticleSpeed(
                        OddLib.doubleInRange(random, -0.2d, 0.2d),
                        OddLib.doubleInRange(random, -0.2d, 0.2d),
                        OddLib.doubleInRange(random, -0.2d, 0.2d)
                );

                totalMoves++;
            }
        }


    }

    @Override
    protected int getLightColor(float partialTick) {
        return lit ? 0xE000E0 : super.getLightColor(partialTick);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return lit ? ParticleRenderType.PARTICLE_SHEET_LIT : ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }


    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;
        private final boolean lit;

        public Provider(SpriteSet sprites, boolean lit) {
            this.sprites = sprites;
            this.lit = lit;
        }

        public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new FlyParticle(level, x, y, z, sprites, lit);
        }
    }
}
