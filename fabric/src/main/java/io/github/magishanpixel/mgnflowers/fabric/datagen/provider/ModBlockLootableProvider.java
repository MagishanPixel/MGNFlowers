package io.github.magishanpixel.mgnflowers.fabric.datagen.provider;

import io.github.magishanpixel.mgnflowers.MGNConstants;
import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.block.CustomFlowerBedBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.FlowerProperty;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class ModBlockLootableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        createCustomFlowerBedDrops(ModBlocks.DANDELION_BED.get());
        createCustomFlowerBedDrops(ModBlocks.SUNFLOWER_BED.get());
        createCustomFlowerBedDrops(ModBlocks.WATER_POPPY.get());
        createCustomFlowerBedDrops(ModBlocks.WATER_HYACINTH.get());
        createCustomFlowerBedDrops(ModBlocks.WINTER_ACONITE.get());
        createCustomFlowerBedDrops(ModBlocks.WOOD_SORREL.get());
        createCustomFlowerBedDrops(ModBlocks.SAND_VERBENA.get());


        if (MGNFlowers.dataGenList != null) {
            for (Map.Entry<String, FlowerProperty> entry : MGNFlowers.dataGenList.entrySet()) {
                if (!entry.getValue().customDrop) {
                    dropSelf(BuiltInRegistries.BLOCK.get(MGNConstants.newId(entry.getKey())));
                }
            }
        }

        dropPottedContents(ModBlocks.POTTED_BLUE_TWIN_POPPY.get());
        dropPottedContents(ModBlocks.POTTED_RED_TWIN_POPPY.get());
        dropPottedContents(ModBlocks.POTTED_ORANGE_TWIN_POPPY.get());
        dropPottedContents(ModBlocks.POTTED_PINK_TWIN_POPPY.get());
        dropPottedContents(ModBlocks.POTTED_WHITE_TWIN_POPPY.get());
        dropPottedContents(ModBlocks.POTTED_BIRD_OF_PARADISE.get());
        dropPottedContents(ModBlocks.POTTED_BLUE_ROMENTA.get());
        dropPottedContents(ModBlocks.POTTED_ORANGE_ROMENTA.get());
        dropPottedContents(ModBlocks.POTTED_PINK_ROMENTA.get());
        dropPottedContents(ModBlocks.POTTED_BLEEDING_HEART.get());
        dropPottedContents(ModBlocks.POTTED_HOLLOW_BLEEDING_HEART.get());
        dropPottedContents(ModBlocks.POTTED_CANDY_BLEEDING_HEART.get());
        dropPottedContents(ModBlocks.POTTED_WELWITSCHIA.get());
        dropPottedContents(ModBlocks.POTTED_IRIS.get());
        dropPottedContents(ModBlocks.POTTED_MOTH_IRIS.get());
        dropPottedContents(ModBlocks.POTTED_SAVANNAH_SUNSET_IRIS.get());
        dropPottedContents(ModBlocks.POTTED_FIRE_LILY.get());
        dropPottedContents(ModBlocks.POTTED_WHITE_LACECAP_HYDRANGEA.get());
        dropPottedContents(ModBlocks.POTTED_BLUE_LACECAP_HYDRANGEA.get());
        dropPottedContents(ModBlocks.POTTED_PINK_LACECAP_HYDRANGEA.get());
        dropPottedContents(ModBlocks.POTTED_BEE_BALM.get());
        dropPottedContents(ModBlocks.POTTED_RED_BEE_BALM.get());
        dropPottedContents(ModBlocks.POTTED_LAMPBLOSSOM.get());
        dropPottedContents(ModBlocks.POTTED_TRILLIUM.get());
        dropPottedContents(ModBlocks.POTTED_GROTTAL_BLOOM.get());
        dropPottedContents(ModBlocks.POTTED_BLUE_HYACINTH.get());
        dropPottedContents(ModBlocks.POTTED_WHITE_HYACINTH.get());
        dropPottedContents(ModBlocks.POTTED_PURPLE_HYACINTH.get());
        dropPottedContents(ModBlocks.POTTED_RED_HYACINTH.get());
        dropPottedContents(ModBlocks.POTTED_PINK_HYACINTH.get());
        dropPottedContents(ModBlocks.POTTED_YELLOW_HYACINTH.get());
        dropPottedContents(ModBlocks.POTTED_GLACIER_LILY.get());
    }


    private void createCustomFlowerBedDrops(Block block) {
        add(block, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add((LootPoolEntryContainer.Builder)this.applyExplosionDecay(block, LootItem.lootTableItem(block).apply(IntStream.rangeClosed(1, 8).boxed().toList(), (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(net.minecraft.advancements.critereon.StatePropertiesPredicate.Builder.properties().hasProperty(CustomFlowerBedBlock.AMOUNT, integer))))))));
    }
}
