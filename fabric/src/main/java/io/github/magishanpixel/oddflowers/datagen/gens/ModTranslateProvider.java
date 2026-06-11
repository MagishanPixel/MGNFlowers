package io.github.magishanpixel.oddflowers.datagen.gens;

import io.github.magishanpixel.oddflowers.init.ModBlocks;
import io.github.magishanpixel.oddflowers.misc.PrefList;
import io.github.magishanpixel.oddflowers.misc.StraddColor;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModTranslateProvider extends FabricLanguageProvider {
    public ModTranslateProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput,"en_us",registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.MOTH_IRIS.asBlock(), "Moth Iris");
        translationBuilder.add(ModBlocks.GROTTAL_BLOOM.asBlock(), "Grottal Bloom");

        translationBuilder.add(ModBlocks.BLUE_TWIN_CENDALION.asBlock(), "Blue Twin Cendalion");
        translationBuilder.add(ModBlocks.ORANGE_TWIN_CENDALION.asBlock(), "Orange Twin Cendalion");
        translationBuilder.add(ModBlocks.WHITE_TWIN_CENDALION.asBlock(), "White Twin Cendalion");
        translationBuilder.add(ModBlocks.RED_TWIN_CENDALION.asBlock(), "Red Twin Cendalion");
        translationBuilder.add(ModBlocks.PINK_TWIN_CENDALION.asBlock(), "Pink Twin Cendalion");

        translationBuilder.add(ModBlocks.ORANGE_TALL_TULIP.asBlock(), "Orange Tall Tulip");
        translationBuilder.add(ModBlocks.RED_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.red));
        translationBuilder.add(ModBlocks.WHITE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.PINK_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.TURQUOISE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.of("turquoise", true));
        translationBuilder.add(ModBlocks.GLOWING_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.of("glowing", true));
        translationBuilder.add(ModBlocks.PURPLE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.purple));

        translationBuilder.add(ModBlocks.RED_GINGER_TULIP.asBlock(), PrefList.GINGER_TULIP.colorOf_Cap(StraddColor.red));
        translationBuilder.add(ModBlocks.WHITE_GINGER_TULIP.asBlock(), PrefList.GINGER_TULIP.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.ORANGE_GINGER_TULIP.asBlock(), PrefList.GINGER_TULIP.colorOf_Cap(StraddColor.orange));
        translationBuilder.add(ModBlocks.PINK_GINGER_TULIP.asBlock(), PrefList.GINGER_TULIP.colorOf_Cap(StraddColor.pink));

        translationBuilder.add(ModBlocks.WATER_HYACINTH.asBlock(), "Water Hyacinth");
        translationBuilder.add(ModBlocks.LAVA_HYACINTH.asBlock(), "Lava Hyacinth");

        translationBuilder.add(ModBlocks.BLEEDING_QUADHEART.asBlock(), "Bleeding Quadheart");
        translationBuilder.add(ModBlocks.CANDY_BLEEDING_QUADHEART.asBlock(), PrefList.Bleeding_Quadheart.of("candy", true));
        translationBuilder.add(ModBlocks.HOLLOW_BLEEDING_QUADHEART.asBlock(), PrefList.Bleeding_Quadheart.of("hollow", true));

    }
}
