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
        translationBuilder.add("tab.oddflowers", "Odd Flowers");

        translationBuilder.add(ModBlocks.MOTH_IRIS.asBlock(), "Moth Iris");
        translationBuilder.add(ModBlocks.GROTTAL_BLOOM.asBlock(), "Grottal Bloom");

        translationBuilder.add(ModBlocks.BLUE_TWIN_CELALION.asBlock(), "Blue Twin Celalion");
        translationBuilder.add(ModBlocks.ORANGE_TWIN_CELALION.asBlock(), "Orange Twin Celalion");
        translationBuilder.add(ModBlocks.WHITE_TWIN_CELALION.asBlock(), "White Twin Celalion");
        translationBuilder.add(ModBlocks.RED_TWIN_CELALION.asBlock(), "Red Twin Celalion");
        translationBuilder.add(ModBlocks.PINK_TWIN_CELALION.asBlock(), "Pink Twin Celalion");

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
        translationBuilder.add(ModBlocks.CANDY_BLEEDING_QUADHEART.asBlock(), PrefList.BLEEDING_QUADHEART.of("candy", true));
        translationBuilder.add(ModBlocks.HOLLOW_BLEEDING_QUADHEART.asBlock(), PrefList.BLEEDING_QUADHEART.of("hollow", true));

        translationBuilder.add(ModBlocks.BEE_BALM.asBlock(), "Bee Balm");
        translationBuilder.add(ModBlocks.CRIMSON_BALM.asBlock(), "Crimson Balm");
        translationBuilder.add(ModBlocks.WARPED_BALM.asBlock(), "Warped Balm");

        translationBuilder.add(ModBlocks.LAMPBLOSSOM.asBlock(), "Lampblossom");

        translationBuilder.add(ModBlocks.PINK_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.BLUE_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.ORANGE_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.orange));

        translationBuilder.add(ModBlocks.TITAN_ARUM.asBlock(), "Titan Arum");

        translationBuilder.add(ModBlocks.JUNGOISEAU.asBlock(), "Jungoiseau");

        translationBuilder.add(ModBlocks.TALL_ALLIUM.asBlock(), "Tall Allium");
        translationBuilder.add(ModBlocks.BLUE_TALL_ALLIUM.asBlock(), "Blue Tall Allium");

        translationBuilder.add(ModBlocks.WELWITSCHIA.asBlock(), "Welwitschia");
        translationBuilder.add(ModBlocks.TORCH_GINGER.asBlock(), "Torch Ginger");

        translationBuilder.add(ModBlocks.BLUE_HIBISCUS.asBlock(), PrefList.HIBISCUS.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.PINK_HIBISCUS.asBlock(), PrefList.HIBISCUS.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.ORANGE_HIBISCUS.asBlock(), PrefList.HIBISCUS.colorOf_Cap(StraddColor.orange));

        translationBuilder.add(ModBlocks.DANDELION_BED.asBlock(), "Dandelion Bed");

        translationBuilder.add(ModBlocks.BLUE_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.PINK_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.PURPLE_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.purple));
        translationBuilder.add(ModBlocks.YELLOW_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.yellow));
        translationBuilder.add(ModBlocks.WHITE_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.RED_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.red));

    }
}
