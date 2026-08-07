package io.github.magishanpixel.mgnflowers.datagen.provider;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.PrefList;
import io.github.magishanpixel.mgnflowers.misc.StraddColor;
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
        translationBuilder.add("tab.mgnflowers", "MGN's Flowers");

        translationBuilder.add(ModBlocks.MOTH_IRIS.asBlock(), "Moth Iris");
        translationBuilder.add(ModBlocks.GROTTAL_BLOOM.asBlock(), "Grottal Bloom");

        translationBuilder.add(ModBlocks.BLUE_TWIN_POPPY.asBlock(), "Blue Twin Poppy");
        translationBuilder.add(ModBlocks.ORANGE_TWIN_POPPY.asBlock(), "Orange Twin Poppy");
        translationBuilder.add(ModBlocks.WHITE_TWIN_POPPY.asBlock(), "White Twin Poppy");
        translationBuilder.add(ModBlocks.RED_TWIN_POPPY.asBlock(), "Red Twin Poppy");
        translationBuilder.add(ModBlocks.PINK_TWIN_POPPY.asBlock(), "Pink Twin Poppy");

        translationBuilder.add(ModBlocks.ORANGE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.orange));
        translationBuilder.add(ModBlocks.RED_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.red));
        translationBuilder.add(ModBlocks.WHITE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.PINK_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.TURQUOISE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.of("turquoise", true));
        translationBuilder.add(ModBlocks.GLOWING_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.of("glowing", true));
        translationBuilder.add(ModBlocks.PURPLE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.purple));

        translationBuilder.add(ModBlocks.RED_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.red));
        translationBuilder.add(ModBlocks.WHITE_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.ORANGE_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.orange));
        translationBuilder.add(ModBlocks.PINK_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.pink));

        translationBuilder.add(ModBlocks.WATER_HYACINTH.asBlock(), "Water Hyacinth");

        translationBuilder.add(ModBlocks.BLEEDING_HEART.asBlock(), "Bleeding Heart");
        translationBuilder.add(ModBlocks.CANDY_BLEEDING_HEART.asBlock(), PrefList.BLEEDING_HEART.of("candy", true));
        translationBuilder.add(ModBlocks.HOLLOW_BLEEDING_HEART.asBlock(), PrefList.BLEEDING_HEART.of("hollow", true));

        translationBuilder.add(ModBlocks.BEE_BALM.asBlock(), "Bee Balm");

        translationBuilder.add(ModBlocks.LAMPBLOSSOM.asBlock(), "Lampblossom");

        translationBuilder.add(ModBlocks.PINK_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.BLUE_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.ORANGE_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.orange));

        translationBuilder.add(ModBlocks.BIRD_OF_PARADISE.asBlock(), "Bird Of Paradise");

        translationBuilder.add(ModBlocks.TALL_ALLIUM.asBlock(), "Tall Allium");
        translationBuilder.add(ModBlocks.BLUE_TALL_ALLIUM.asBlock(), "Blue Tall Allium");

        translationBuilder.add(ModBlocks.WELWITSCHIA.asBlock(), "Welwitschia");
        translationBuilder.add(ModBlocks.TORCH_GINGER.asBlock(), "Torch Ginger");

        translationBuilder.add(ModBlocks.DANDELION_BED.asBlock(), "Dandelion Bed");

        translationBuilder.add(ModBlocks.BLUE_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.PINK_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.PURPLE_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.purple));
        translationBuilder.add(ModBlocks.YELLOW_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.yellow));
        translationBuilder.add(ModBlocks.WHITE_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.RED_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.red));

        translationBuilder.add(ModBlocks.WHITE_VINE_LOTUS.asBlock(), PrefList.VINE_LOTUS.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.PINK_VINE_LOTUS.asBlock(), PrefList.VINE_LOTUS.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.GLOWING_VINE_LOTUS.asBlock(), PrefList.VINE_LOTUS.of("glowing", true));

        translationBuilder.add(ModBlocks.PINK_LACECAP_HYDRANGEA.asBlock(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.WHITE_LACECAP_HYDRANGEA.asBlock(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.BLUE_LACECAP_HYDRANGEA.asBlock(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.blue));

        translationBuilder.add(ModBlocks.FIRE_LILY.asBlock(), "Fire Lily");
        translationBuilder.add(ModBlocks.SUNFLOWER_BED.asBlock(), "Sunflower Bed");
        translationBuilder.add(ModBlocks.WATER_POPPY.asBlock(), "Water Poppy");

        translationBuilder.add(ModBlocks.IRIS.asBlock(), "Iris");

        translationBuilder.add(ModBlocks.PINK_CYCLAMEN.asBlock(), PrefList.CYCLAMEN.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.WHITE_CYCLAMEN.asBlock(), PrefList.CYCLAMEN.colorOf_Cap(StraddColor.white));

        translationBuilder.add(ModBlocks.TRILLIUM.asBlock(), "Trillium");
        translationBuilder.add(ModBlocks.WOOD_SORREL.asBlock(), "Wood Sorrel");

        translationBuilder.add(ModBlocks.SAVANNAH_SUNSET_IRIS.asBlock(), "Savannah Sunset Iris");
        translationBuilder.add(ModBlocks.SAND_VERBENA.asBlock(), "Sand Verbena");
        translationBuilder.add(ModBlocks.RED_BEE_BALM.asBlock(), "Red Bee Balm");
        translationBuilder.add(ModBlocks.GLACIER_LILY.asBlock(), "Glacier Lily");
        translationBuilder.add(ModBlocks.WINTER_ACONITE.asBlock(), "Winter Aconite");
    }
}
