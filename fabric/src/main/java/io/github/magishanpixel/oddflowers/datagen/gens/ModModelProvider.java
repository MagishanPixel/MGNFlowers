package io.github.magishanpixel.oddflowers.datagen.gens;

import io.github.magishanpixel.oddflowers.block.TallFloweryBlock;
import io.github.magishanpixel.oddflowers.init.ModBlocks;
import io.github.magishanpixel.oddflowers.misc.OddLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.Condition;
import net.minecraft.data.models.blockstates.MultiPartGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators gen) {

        genBlockCustomModel(gen, ModBlocks.MOTH_IRIS.asBlock());
        genBlockCustomModel(gen, ModBlocks.GROTTAL_BLOOM.asBlock());

        genBlockCustomModel(gen, ModBlocks.BLEEDING_QUADHEART.asBlock());
        genBlockCustomModel(gen, ModBlocks.CANDY_BLEEDING_QUADHEART.asBlock());
        genBlockCustomModel(gen, ModBlocks.HOLLOW_BLEEDING_QUADHEART.asBlock());

        gen.createCrossBlock(ModBlocks.BLUE_TWIN_CENDALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.WHITE_TWIN_CENDALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.RED_TWIN_CENDALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.PINK_TWIN_CENDALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.ORANGE_TWIN_CENDALION.asBlock(), BlockModelGenerators.TintState.TINTED);

        createTallFlower(gen, ModBlocks.ORANGE_TALL_TULIP.asBlock(), "orange", "tall_tulip");
        createTallFlower(gen, ModBlocks.WHITE_TALL_TULIP.asBlock(), "white", "tall_tulip");
        createTallFlower(gen, ModBlocks.PINK_TALL_TULIP.asBlock(), "pink", "tall_tulip");
        createTallFlower(gen, ModBlocks.PURPLE_TALL_TULIP.asBlock(), "purple", "tall_tulip");
        createTallFlower(gen, ModBlocks.RED_TALL_TULIP.asBlock(), "red", "tall_tulip");
        createTallFlower(gen, ModBlocks.GLOWING_TALL_TULIP.asBlock(), "glowing", "tall_tulip");
        createTallFlower(gen, ModBlocks.TURQUOISE_TALL_TULIP.asBlock(), "turquoise", "tall_tulip");

        createTallFlower(gen, ModBlocks.RED_GINGER_TULIP.asBlock(), "red", "ginger_tulip");
        createTallFlower(gen, ModBlocks.ORANGE_GINGER_TULIP.asBlock(), "orange", "ginger_tulip");
        createTallFlower(gen, ModBlocks.WHITE_GINGER_TULIP.asBlock(), "white", "ginger_tulip");
        createTallFlower(gen, ModBlocks.PINK_GINGER_TULIP.asBlock(), "pink", "ginger_tulip");

        createFlowerBed(gen, ModBlocks.WATER_HYACINTH.asBlock());
        createFlowerBed(gen, ModBlocks.LAVA_HYACINTH.asBlock());

        gen.createSimpleFlatItemModel(ModBlocks.BLUE_TWIN_CENDALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.WHITE_TWIN_CENDALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.RED_TWIN_CENDALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.PINK_TWIN_CENDALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.ORANGE_TWIN_CENDALION.asBlock());

        gen.createSimpleFlatItemModel(ModBlocks.BLEEDING_QUADHEART.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.CANDY_BLEEDING_QUADHEART.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.HOLLOW_BLEEDING_QUADHEART.asBlock());
    }

    @Override
    public void generateItemModels(ItemModelGenerators gen) {
        gen.generateFlatItem(ModBlocks.MOTH_IRIS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.GROTTAL_BLOOM.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.WATER_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.LAVA_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.RED_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.ORANGE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.GLOWING_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PURPLE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.TURQUOISE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.PINK_GINGER_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.RED_GINGER_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.ORANGE_GINGER_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_GINGER_TULIP.asItem(), ModelTemplates.FLAT_ITEM);;
    }

    private void createFlowerBed(BlockModelGenerators gen, Block flowerBedBlock) {
        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(flowerBedBlock);

        ResourceLocation resourceLocation = getModelPath(blockId.getPath() + "1");
        ResourceLocation resourceLocation2 = getModelPath(blockId.getPath() + "2");
        ResourceLocation resourceLocation3 = getModelPath(blockId.getPath() + "3");
        ResourceLocation resourceLocation4 = getModelPath(blockId.getPath() + "4");

        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(flowerBedBlock)
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation)
                        .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation)
                        .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation)
                        .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation2))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation2)
                        .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation3)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation4)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)));
    }

    private ResourceLocation getModelPath(String path) {
        return OddLib.newId("block/" + path);
    }

    private void genBlockCustomModel(BlockModelGenerators gen, Block block) {
        gen.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, ModelLocationUtils.getModelLocation(block)));
    }

    private void createTallFlower(BlockModelGenerators gen, Block block, String color, String base) {
        ResourceLocation bottom = getModelPath(base + "s/bases/" + base + "_bottom");
        ResourceLocation middle = getModelPath(base + "s/bases/" + base +  "_middle");
        ResourceLocation top = getModelPath(base + "s/" + color + "_" + base + "_top");

        if (color.equals("glowing")) {
            bottom = getModelPath(base + "s/bases/glowing_" + base + "_bottom");
            middle = getModelPath(base + "s/bases/glowing_" + base + "_middle");
        }
        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(block)
                .with(Condition.condition().term(TallFloweryBlock.STEM, 1), Variant.variant().with(VariantProperties.MODEL, bottom))
                .with(Condition.condition().term(TallFloweryBlock.STEM, 2), Variant.variant().with(VariantProperties.MODEL, middle))
                .with(Condition.condition().term(TallFloweryBlock.STEM, 3), Variant.variant().with(VariantProperties.MODEL, top))
        );
        //this.blockStateOutput.accept(
        // MultiPartGenerator.multiPart(flowerBedBlock)
        // .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4})
        // .term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, Rotation.R270)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation2)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, Rotation.R270)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation3)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, Rotation.R270)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation4)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, Rotation.R90)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, Rotation.R180)).with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, Rotation.R270)));
    }


}
