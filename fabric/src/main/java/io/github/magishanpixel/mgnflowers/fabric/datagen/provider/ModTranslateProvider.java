package io.github.magishanpixel.mgnflowers.fabric.datagen.provider;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.PrefList;
import io.github.magishanpixel.mgnflowers.misc.StraddColor;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModTranslateProvider extends FabricLanguageProvider {
    public ModTranslateProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.mgnflowers.main_tab", "MGN's Flowers");

        translationBuilder.add(ModBlocks.MOTH_IRIS.get(), "Moth Iris");
        translationBuilder.add(ModBlocks.GROTTAL_BLOOM.get(), "Grottal Bloom");

        translationBuilder.add(ModBlocks.BLUE_TWIN_POPPY.get(), "Blue Twin Poppy");
        translationBuilder.add(ModBlocks.ORANGE_TWIN_POPPY.get(), "Orange Twin Poppy");
        translationBuilder.add(ModBlocks.WHITE_TWIN_POPPY.get(), "White Twin Poppy");
        translationBuilder.add(ModBlocks.RED_TWIN_POPPY.get(), "Red Twin Poppy");
        translationBuilder.add(ModBlocks.PINK_TWIN_POPPY.get(), "Pink Twin Poppy");

        translationBuilder.add(ModBlocks.ORANGE_TALL_TULIP.get(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.orange));
        translationBuilder.add(ModBlocks.RED_TALL_TULIP.get(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.red));
        translationBuilder.add(ModBlocks.WHITE_TALL_TULIP.get(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.PINK_TALL_TULIP.get(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.TURQUOISE_TALL_TULIP.get(), PrefList.TALL_TULIP.of("turquoise", true));
        translationBuilder.add(ModBlocks.GLOWING_TALL_TULIP.get(), PrefList.TALL_TULIP.of("glowing", true));
        translationBuilder.add(ModBlocks.PURPLE_TALL_TULIP.get(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.purple));

        translationBuilder.add(ModBlocks.RED_GINGER_LILY.get(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.red));
        translationBuilder.add(ModBlocks.WHITE_GINGER_LILY.get(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.ORANGE_GINGER_LILY.get(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.orange));
        translationBuilder.add(ModBlocks.PINK_GINGER_LILY.get(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.pink));

        translationBuilder.add(ModBlocks.WATER_HYACINTH.get(), "Water Hyacinth");

        translationBuilder.add(ModBlocks.BLEEDING_HEART.get(), "Bleeding Heart");
        translationBuilder.add(ModBlocks.CANDY_BLEEDING_HEART.get(), PrefList.BLEEDING_HEART.of("candy", true));
        translationBuilder.add(ModBlocks.HOLLOW_BLEEDING_HEART.get(), PrefList.BLEEDING_HEART.of("hollow", true));

        translationBuilder.add(ModBlocks.BEE_BALM.get(), "Bee Balm");

        translationBuilder.add(ModBlocks.LAMPBLOSSOM.get(), "Lampblossom");

        translationBuilder.add(ModBlocks.PINK_ROMENTA.get(), PrefList.ROMENTA.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.BLUE_ROMENTA.get(), PrefList.ROMENTA.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.ORANGE_ROMENTA.get(), PrefList.ROMENTA.colorOf_Cap(StraddColor.orange));

        translationBuilder.add(ModBlocks.BIRD_OF_PARADISE.get(), "Bird Of Paradise");

        translationBuilder.add(ModBlocks.TALL_ALLIUM.get(), "Tall Allium");
        translationBuilder.add(ModBlocks.BLUE_TALL_ALLIUM.get(), "Blue Tall Allium");

        translationBuilder.add(ModBlocks.WELWITSCHIA.get(), "Welwitschia");
        translationBuilder.add(ModBlocks.TORCH_GINGER.get(), "Torch Ginger");

        translationBuilder.add(ModBlocks.DANDELION_BED.get(), "Dandelion Bed");

        translationBuilder.add(ModBlocks.BLUE_HYACINTH.get(), PrefList.HYACINTH.colorOf_Cap(StraddColor.blue));
        translationBuilder.add(ModBlocks.PINK_HYACINTH.get(), PrefList.HYACINTH.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.PURPLE_HYACINTH.get(), PrefList.HYACINTH.colorOf_Cap(StraddColor.purple));
        translationBuilder.add(ModBlocks.YELLOW_HYACINTH.get(), PrefList.HYACINTH.colorOf_Cap(StraddColor.yellow));
        translationBuilder.add(ModBlocks.WHITE_HYACINTH.get(), PrefList.HYACINTH.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.RED_HYACINTH.get(), PrefList.HYACINTH.colorOf_Cap(StraddColor.red));

        translationBuilder.add(ModBlocks.WHITE_VINE_LOTUS.get(), PrefList.VINE_LOTUS.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.PINK_VINE_LOTUS.get(), PrefList.VINE_LOTUS.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.GLOWING_VINE_LOTUS.get(), PrefList.VINE_LOTUS.of("glowing", true));

        translationBuilder.add(ModBlocks.PINK_LACECAP_HYDRANGEA.get(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.WHITE_LACECAP_HYDRANGEA.get(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.white));
        translationBuilder.add(ModBlocks.BLUE_LACECAP_HYDRANGEA.get(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.blue));

        translationBuilder.add(ModBlocks.FIRE_LILY.get(), "Fire Lily");
        translationBuilder.add(ModBlocks.SUNFLOWER_BED.get(), "Sunflower Bed");
        translationBuilder.add(ModBlocks.WATER_POPPY.get(), "Water Poppy");

        translationBuilder.add(ModBlocks.IRIS.get(), "Iris");

        translationBuilder.add(ModBlocks.PINK_CYCLAMEN.get(), PrefList.CYCLAMEN.colorOf_Cap(StraddColor.pink));
        translationBuilder.add(ModBlocks.WHITE_CYCLAMEN.get(), PrefList.CYCLAMEN.colorOf_Cap(StraddColor.white));

        translationBuilder.add(ModBlocks.TRILLIUM.get(), "Trillium");
        translationBuilder.add(ModBlocks.WOOD_SORREL.get(), "Wood Sorrel");

        translationBuilder.add(ModBlocks.SAVANNAH_SUNSET_IRIS.get(), "Savannah Sunset Iris");
        translationBuilder.add(ModBlocks.SAND_VERBENA.get(), "Sand Verbena");
        translationBuilder.add(ModBlocks.RED_BEE_BALM.get(), "Red Bee Balm");
        translationBuilder.add(ModBlocks.GLACIER_LILY.get(), "Glacier Lily");
        translationBuilder.add(ModBlocks.WINTER_ACONITE.get(), "Winter Aconite");
    }
}
