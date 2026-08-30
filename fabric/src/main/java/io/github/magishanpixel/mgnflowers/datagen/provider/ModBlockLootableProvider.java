package io.github.magishanpixel.mgnflowers.datagen.provider;

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
    public ModBlockLootableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        createCustomFlowerBedDrops(ModBlocks.DANDELION_BED.asBlock());
        createCustomFlowerBedDrops(ModBlocks.SUNFLOWER_BED.asBlock());
        createCustomFlowerBedDrops(ModBlocks.WATER_POPPY.asBlock());
        createCustomFlowerBedDrops(ModBlocks.WATER_HYACINTH.asBlock());
        createCustomFlowerBedDrops(ModBlocks.WINTER_ACONITE.asBlock());
        createCustomFlowerBedDrops(ModBlocks.WOOD_SORREL.asBlock());
        createCustomFlowerBedDrops(ModBlocks.SAND_VERBENA.asBlock());


        if (MGNFlowers.dataGenList != null) {
            for (Map.Entry<String, FlowerProperty> entry : MGNFlowers.dataGenList.entrySet()) {
                if (!entry.getValue().customDrop) {
                    dropSelf(BuiltInRegistries.BLOCK.get(MGNFlowers.newId(entry.getKey())));
                }
            }
        }

        dropPottedContents(ModBlocks.POTTED_BLUE_TWIN_POPPY.asBlock());
        dropPottedContents(ModBlocks.POTTED_RED_TWIN_POPPY.asBlock());
        dropPottedContents(ModBlocks.POTTED_ORANGE_TWIN_POPPY.asBlock());
        dropPottedContents(ModBlocks.POTTED_PINK_TWIN_POPPY.asBlock());
        dropPottedContents(ModBlocks.POTTED_WHITE_TWIN_POPPY.asBlock());
        dropPottedContents(ModBlocks.POTTED_BIRD_OF_PARADISE.asBlock());
        dropPottedContents(ModBlocks.POTTED_BLUE_ROMENTA.asBlock());
        dropPottedContents(ModBlocks.POTTED_ORANGE_ROMENTA.asBlock());
        dropPottedContents(ModBlocks.POTTED_PINK_ROMENTA.asBlock());
        dropPottedContents(ModBlocks.POTTED_BLEEDING_HEART.asBlock());
        dropPottedContents(ModBlocks.POTTED_HOLLOW_BLEEDING_HEART.asBlock());
        dropPottedContents(ModBlocks.POTTED_CANDY_BLEEDING_HEART.asBlock());
        dropPottedContents(ModBlocks.POTTED_WELWITSCHIA.asBlock());
        dropPottedContents(ModBlocks.POTTED_IRIS.asBlock());
        dropPottedContents(ModBlocks.POTTED_MOTH_IRIS.asBlock());
        dropPottedContents(ModBlocks.POTTED_SAVANNAH_SUNSET_IRIS.asBlock());
        dropPottedContents(ModBlocks.POTTED_FIRE_LILY.asBlock());
        dropPottedContents(ModBlocks.POTTED_WHITE_LACECAP_HYDRANGEA.asBlock());
        dropPottedContents(ModBlocks.POTTED_BLUE_LACECAP_HYDRANGEA.asBlock());
        dropPottedContents(ModBlocks.POTTED_PINK_LACECAP_HYDRANGEA.asBlock());
        dropPottedContents(ModBlocks.POTTED_BEE_BALM.asBlock());
        dropPottedContents(ModBlocks.POTTED_RED_BEE_BALM.asBlock());
        dropPottedContents(ModBlocks.POTTED_LAMPBLOSSOM.asBlock());
        dropPottedContents(ModBlocks.POTTED_TRILLIUM.asBlock());
        dropPottedContents(ModBlocks.POTTED_GROTTAL_BLOOM.asBlock());
        dropPottedContents(ModBlocks.POTTED_BLUE_HYACINTH.asBlock());
        dropPottedContents(ModBlocks.POTTED_WHITE_HYACINTH.asBlock());
        dropPottedContents(ModBlocks.POTTED_PURPLE_HYACINTH.asBlock());
        dropPottedContents(ModBlocks.POTTED_RED_HYACINTH.asBlock());
        dropPottedContents(ModBlocks.POTTED_PINK_HYACINTH.asBlock());
        dropPottedContents(ModBlocks.POTTED_YELLOW_HYACINTH.asBlock());
    }


    private void createCustomFlowerBedDrops(Block block) {
        add(block, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add((LootPoolEntryContainer.Builder)this.applyExplosionDecay(block, LootItem.lootTableItem(block).apply(IntStream.rangeClosed(1, 8).boxed().toList(), (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(net.minecraft.advancements.critereon.StatePropertiesPredicate.Builder.properties().hasProperty(CustomFlowerBedBlock.AMOUNT, integer))))))));
    }
}
