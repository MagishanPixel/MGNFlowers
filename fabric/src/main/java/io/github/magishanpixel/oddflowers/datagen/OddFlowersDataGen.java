package io.github.magishanpixel.oddflowers.datagen;

import io.github.magishanpixel.oddflowers.datagen.gens.ModModelProvider;
import io.github.magishanpixel.oddflowers.datagen.gens.ModTranslateProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OddFlowersDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModTranslateProvider::new);
    }
}
