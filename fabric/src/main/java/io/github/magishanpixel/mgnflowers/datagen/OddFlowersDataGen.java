package io.github.magishanpixel.mgnflowers.datagen;

import io.github.magishanpixel.mgnflowers.datagen.gens.ModBlockLootableProvider;
import io.github.magishanpixel.mgnflowers.datagen.gens.ModModelProvider;
import io.github.magishanpixel.mgnflowers.datagen.gens.ModRecipeProvider;
import io.github.magishanpixel.mgnflowers.datagen.gens.ModTranslateProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OddFlowersDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModTranslateProvider::new);
        pack.addProvider(ModBlockLootableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
