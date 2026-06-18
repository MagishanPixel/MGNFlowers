package io.github.magishanpixel.oddflowers.client.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.magishanpixel.oddflowers.misc.OddLib;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class StarFallingParticle extends TextureSheetParticle {
    private final SpriteSet mySpr;
    private final Quaternionf myRot;

    protected StarFallingParticle(ClientLevel level, double x, double y, double z, SpriteSet spr) {
        super(level, x, y, z);

        RandomSource rand = level.getRandom();

        this.mySpr = spr;
        this.setSpriteFromAge(mySpr);
        this.setLifetime(level.getRandom().nextIntBetweenInclusive(5, 15));
        this.quadSize = 0.2f;
        this.myRot = new Quaternionf().rotationXYZ(
                (float)(Math.toRadians(180 + OddLib.doubleInRange(rand,-10, 10))),
                (float)Math.toRadians(90 + OddLib.doubleInRange(rand,-10, 10)),
                (float)Math.toRadians(OddLib.doubleInRange(rand,-10, 10)));
    }

    @Override
    public void tick() {
        super.tick();

        if (this.isAlive()) {
            this.setSpriteFromAge(mySpr);
        }
    }

    @Override
    public void render(VertexConsumer buffer, Camera renderInfo, float partialTicks) {
        Vec3 camPos = renderInfo.getPosition();

        float x = (float) (Mth.lerp(partialTicks, this.xo, this.x) - camPos.x);
        float y = (float) (Mth.lerp(partialTicks, this.yo, this.y) - camPos.y);
        float z = (float) (Mth.lerp(partialTicks, this.zo, this.z) - camPos.z);

        Vector3f[] vertices = {
                new Vector3f(-1.0F, -1.0F, 0.0F),
                new Vector3f(-1.0F, 1.0F, 0.0F),
                new Vector3f(1.0F, 1.0F, 0.0F),
                new Vector3f(1.0F, -1.0F, 0.0F)
        };

        float u0 = this.getU0();
        float u1 = this.getU1();
        float v0 = this.getV0();
        float v1 = this.getV1();

        int light = this.getLightColor(partialTicks);

        for (int i = 0; i < 4; i++) {
            Vector3f vertex = new Vector3f(vertices[i]);

            vertex.rotate(this.myRot);
            vertex.mul(this.quadSize);
            vertex.add(x, y, z);

            float u = (i == 0 || i == 1) ? u0 : u1;
            float v = (i == 0 || i == 3) ? v0 : v1;

            buffer.addVertex(vertex.x(), vertex.y(), vertex.z())
                    .setUv(u, v)
                    .setColor(this.rCol, this.gCol, this.bCol, this.alpha)
                    .setLight(light);



        }
    }

    @Override
    protected int getLightColor(float partialTick) {
        return 0xE000E0;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_LIT ;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet sprites) {
            this.sprites = sprites;
        }

        public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new StarFallingParticle(level, x, y, z, sprites);
        }
    }
}
