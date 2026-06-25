package io.github.magishanpixel.oddflowers.client;

import io.github.magishanpixel.oddflowers.client.particle.FlyParticle;
import io.github.magishanpixel.oddflowers.client.particle.StarFallingParticle;
import io.github.magishanpixel.oddflowers.init.ModBlocks;
import io.github.magishanpixel.oddflowers.init.ModParticles;
import io.github.magishanpixel.oddflowers.misc.OddLib;
import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.client.particle.BalmParticleProviderRegistrar;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class OddFlowersClient implements BalmClientModule {

    public static void init() {

    }

    @Override
    public ResourceLocation getId() {
        return OddLib.newId("client");
    }

    @Override
    public void registerParticleProviders(BalmParticleProviderRegistrar particles) {
        particles.register(ModParticles.BEE, a -> new FlyParticle.Provider(a, false));
        particles.register(ModParticles.CRIMSON_FIREFLY, a -> new FlyParticle.Provider(a, true));
        particles.register(ModParticles.WARPED_FIREFLY, a -> new FlyParticle.Provider(a, true));
        particles.register(ModParticles.STAR_FALLING, StarFallingParticle.Provider::new);
    }

    @Override
    public void registerBlockRenderTypes(BalmBlockRenderTypeRegistrar rend) {
        rend.setRenderLayer(ModBlocks.MOTH_IRIS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.GROTTAL_BLOOM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.RED_TWIN_CELALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_TWIN_CELALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_TWIN_CELALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_TWIN_CELALION, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TWIN_CELALION, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WHITE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PURPLE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.TURQUOISE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_TALL_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.GLOWING_TALL_TULIP, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.ORANGE_GINGER_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_GINGER_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_GINGER_TULIP, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_GINGER_TULIP, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WATER_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.LAVA_HYACINTH, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLEEDING_QUADHEART, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.CANDY_BLEEDING_QUADHEART, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.HOLLOW_BLEEDING_QUADHEART, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BEE_BALM, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WARPED_BALM, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.CRIMSON_BALM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.LAMPBLOSSOM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.PINK_ROMENTA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_ROMENTA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_ROMENTA, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.TITAN_ARUM, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BIRD_OF_PARADISE, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.TALL_ALLIUM, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.BLUE_TALL_ALLIUM, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.WELWITSCHIA, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.TORCH_GINGER, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLUE_HIBISCUS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_HIBISCUS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.ORANGE_HIBISCUS, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.DANDELION_BED, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.BLUE_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PINK_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.RED_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.PURPLE_TALL_HYACINTH, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.YELLOW_TALL_HYACINTH, RenderType.cutout());

        rend.setRenderLayer(ModBlocks.PINK_VINE_LOTUS, RenderType.cutout());
        rend.setRenderLayer(ModBlocks.WHITE_VINE_LOTUS, RenderType.cutout());

    }


}
