package io.github.magishanpixel.mgnflowers.fabric;

import io.github.magishanpixel.mgnflowers.init.ModItems;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;
import io.github.magishanpixel.mgnflowers.MGNFlowers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MGNFlowers_FABRIC implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(MGNFlowers.MOD_ID, EmptyLoadContext.INSTANCE, new MGNFlowers());

        ItemGroupEvents.modifyEntriesEvent(ModItems.MAIN_TAB_KEY).register(v -> {
            ModItems.addToTab(block -> v.accept(block.get().asItem()));
        });

        ModBiomeModifications.init();
    }
}
