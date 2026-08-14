package io.github.magishanpixel.mgnflowers.datagen.provider;

import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.PrefList;
import io.github.magishanpixel.mgnflowers.misc.StraddColor;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModTranslateProvider extends FabricLanguageProvider {
    public ModTranslateProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput,"en_us",registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add("tab.mgnflowers", "MGN's Flowers");

        tr(translationBuilder,ModBlocks.MOTH_IRIS.asBlock(), "Moth Iris");
        tr(translationBuilder,ModBlocks.GROTTAL_BLOOM.asBlock(), "Grottal Bloom");

        tr(translationBuilder,ModBlocks.BLUE_TWIN_POPPY.asBlock(), "Blue Twin Poppy");
        tr(translationBuilder,ModBlocks.ORANGE_TWIN_POPPY.asBlock(), "Orange Twin Poppy");
        tr(translationBuilder,ModBlocks.WHITE_TWIN_POPPY.asBlock(), "White Twin Poppy");
        tr(translationBuilder,ModBlocks.RED_TWIN_POPPY.asBlock(), "Red Twin Poppy");
        tr(translationBuilder,ModBlocks.PINK_TWIN_POPPY.asBlock(), "Pink Twin Poppy");

        tr(translationBuilder,ModBlocks.ORANGE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.orange));
        tr(translationBuilder,ModBlocks.RED_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.red));
        tr(translationBuilder,ModBlocks.WHITE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.white));
        tr(translationBuilder,ModBlocks.PINK_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.pink));
        tr(translationBuilder,ModBlocks.TURQUOISE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.of("turquoise", true));
        tr(translationBuilder,ModBlocks.GLOWING_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.of("glowing", true));
        tr(translationBuilder,ModBlocks.PURPLE_TALL_TULIP.asBlock(), PrefList.TALL_TULIP.colorOf_Cap(StraddColor.purple));

        tr(translationBuilder,ModBlocks.RED_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.red));
        tr(translationBuilder,ModBlocks.WHITE_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.white));
        tr(translationBuilder,ModBlocks.ORANGE_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.orange));
        tr(translationBuilder,ModBlocks.PINK_GINGER_LILY.asBlock(), PrefList.GINGER_LILY.colorOf_Cap(StraddColor.pink));

        tr(translationBuilder,ModBlocks.WATER_HYACINTH.asBlock(), "Water Hyacinth");

        tr(translationBuilder,ModBlocks.BLEEDING_HEART.asBlock(), "Bleeding Heart");
        tr(translationBuilder,ModBlocks.CANDY_BLEEDING_HEART.asBlock(), PrefList.BLEEDING_HEART.of("candy", true));
        tr(translationBuilder,ModBlocks.HOLLOW_BLEEDING_HEART.asBlock(), PrefList.BLEEDING_HEART.of("hollow", true));

        tr(translationBuilder,ModBlocks.BEE_BALM.asBlock(), "Bee Balm");

        tr(translationBuilder,ModBlocks.LAMPBLOSSOM.asBlock(), "Lampblossom");

        tr(translationBuilder,ModBlocks.PINK_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.pink));
        tr(translationBuilder,ModBlocks.BLUE_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.blue));
        tr(translationBuilder,ModBlocks.ORANGE_ROMENTA.asBlock(), PrefList.ROMENTA.colorOf_Cap(StraddColor.orange));

        tr(translationBuilder,ModBlocks.BIRD_OF_PARADISE.asBlock(), "Bird Of Paradise");

        tr(translationBuilder,ModBlocks.TALL_ALLIUM.asBlock(), "Tall Allium");
        tr(translationBuilder,ModBlocks.BLUE_TALL_ALLIUM.asBlock(), "Blue Tall Allium");

        tr(translationBuilder,ModBlocks.WELWITSCHIA.asBlock(), "Welwitschia");
        tr(translationBuilder,ModBlocks.TORCH_GINGER.asBlock(), "Torch Ginger");

        tr(translationBuilder,ModBlocks.DANDELION_BED.asBlock(), "Dandelion Bed");

        tr(translationBuilder,ModBlocks.BLUE_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.blue));
        tr(translationBuilder,ModBlocks.PINK_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.pink));
        tr(translationBuilder,ModBlocks.PURPLE_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.purple));
        tr(translationBuilder,ModBlocks.YELLOW_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.yellow));
        tr(translationBuilder,ModBlocks.WHITE_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.white));
        tr(translationBuilder,ModBlocks.RED_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf_Cap(StraddColor.red));

        tr(translationBuilder,ModBlocks.WHITE_VINE_LOTUS.asBlock(), PrefList.VINE_LOTUS.colorOf_Cap(StraddColor.white));
        tr(translationBuilder,ModBlocks.PINK_VINE_LOTUS.asBlock(), PrefList.VINE_LOTUS.colorOf_Cap(StraddColor.pink));
        tr(translationBuilder,ModBlocks.GLOWING_VINE_LOTUS.asBlock(), PrefList.VINE_LOTUS.of("glowing", true));

        tr(translationBuilder,ModBlocks.PINK_LACECAP_HYDRANGEA.asBlock(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.pink));
        tr(translationBuilder,ModBlocks.WHITE_LACECAP_HYDRANGEA.asBlock(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.white));
        tr(translationBuilder,ModBlocks.BLUE_LACECAP_HYDRANGEA.asBlock(), PrefList.LACECAP_HYDRANGEA.colorOf_Cap(StraddColor.blue));

        tr(translationBuilder,ModBlocks.FIRE_LILY.asBlock(), "Fire Lily");
        tr(translationBuilder,ModBlocks.SUNFLOWER_BED.asBlock(), "Sunflower Bed");
        tr(translationBuilder,ModBlocks.WATER_POPPY.asBlock(), "Water Poppy");

        tr(translationBuilder,ModBlocks.IRIS.asBlock(), "Iris");

        tr(translationBuilder,ModBlocks.PINK_CYCLAMEN.asBlock(), PrefList.CYCLAMEN.colorOf_Cap(StraddColor.pink));
        tr(translationBuilder,ModBlocks.WHITE_CYCLAMEN.asBlock(), PrefList.CYCLAMEN.colorOf_Cap(StraddColor.white));

        tr(translationBuilder,ModBlocks.TRILLIUM.asBlock(), "Trillium");
        tr(translationBuilder,ModBlocks.WOOD_SORREL.asBlock(), "Wood Sorrel");

        tr(translationBuilder,ModBlocks.SAVANNAH_SUNSET_IRIS.asBlock(), "Savannah Sunset Iris");
        tr(translationBuilder,ModBlocks.SAND_VERBENA.asBlock(), "Sand Verbena");
        tr(translationBuilder,ModBlocks.RED_BEE_BALM.asBlock(), "Red Bee Balm");
        tr(translationBuilder,ModBlocks.GLACIER_LILY.asBlock(), "Glacier Lily");
        tr(translationBuilder,ModBlocks.WINTER_ACONITE.asBlock(), "Winter Aconite");
    }

    private static void tr(TranslationBuilder v,Block block, String str) {
        v.add(block, str);
        v.add(block.asItem(), str);
    }
}
