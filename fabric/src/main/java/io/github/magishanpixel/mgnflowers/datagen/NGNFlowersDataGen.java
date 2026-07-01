package io.github.magishanpixel.mgnflowers.datagen;

import io.github.magishanpixel.mgnflowers.datagen.gens.*;
import io.github.magishanpixel.mgnflowers.datagen.world.ConfiguredFeatureBootstrap;
import io.github.magishanpixel.mgnflowers.datagen.world.PlacedFeatureBootstrap;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class NGNFlowersDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModTranslateProvider::new);
        pack.addProvider(ModBlockLootableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModDynamicRegistryProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, ConfiguredFeatureBootstrap::boot);
        registryBuilder.add(Registries.PLACED_FEATURE, PlacedFeatureBootstrap::boot);
    }
}
