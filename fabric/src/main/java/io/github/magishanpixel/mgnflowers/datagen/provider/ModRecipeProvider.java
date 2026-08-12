package io.github.magishanpixel.mgnflowers.datagen.provider;

import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.misc.FlowerProperty;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        if (MGNFlowers.dataGenList != null) {
            for (Map.Entry<String, FlowerProperty> entry : MGNFlowers.dataGenList.entrySet()) {
                DyeColor col = entry.getValue().dyeCol;
                Item itemDye = switch (col) {
                    case WHITE -> Items.WHITE_DYE;
                    case ORANGE -> Items.ORANGE_DYE;
                    case MAGENTA -> Items.MAGENTA_DYE;
                    case LIGHT_BLUE -> Items.LIGHT_BLUE_DYE;
                    case YELLOW -> Items.YELLOW_DYE;
                    case LIME -> Items.LIME_DYE;
                    case PINK -> Items.PINK_DYE;
                    case GRAY -> Items.GRAY_DYE;
                    case LIGHT_GRAY -> Items.LIGHT_GRAY_DYE;
                    case CYAN -> Items.CYAN_DYE;
                    case PURPLE -> Items.PURPLE_DYE;
                    case BLUE -> Items.BLUE_DYE;
                    case BROWN -> Items.BROWN_DYE;
                    case GREEN -> Items.GREEN_DYE;
                    case RED -> Items.RED_DYE;
                    case BLACK -> Items.BLACK_DYE;
                };

                Item flower = BuiltInRegistries.ITEM.get(MGNFlowers.newId(entry.getKey()));

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, itemDye)
                        .requires(flower)
                        .unlockedBy("has_" + entry.getKey(), FabricRecipeProvider.has(flower))
                        .save(recipeOutput, BuiltInRegistries.ITEM.getKey(itemDye).getPath() + "_from_" + entry.getKey());
                ;
            }
        }
    }
}
