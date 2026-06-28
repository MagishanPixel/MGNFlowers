package io.github.magishanpixel.mgnflowers.datagen.gens;

import io.github.magishanpixel.mgnflowers.block.CustomFlowerBedBlock;
import io.github.magishanpixel.mgnflowers.block.TallerFlowerBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.MagishanLib;
import io.github.magishanpixel.mgnflowers.misc.PrefList;
import io.github.magishanpixel.mgnflowers.misc.StraddColor;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.List;
import java.util.stream.IntStream;

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

        genBlockCustomModel(gen, ModBlocks.BEE_BALM.asBlock());

        genBlockCustomModel(gen, ModBlocks.BLUE_HIBISCUS.asBlock());
        genBlockCustomModel(gen, ModBlocks.ORANGE_HIBISCUS.asBlock());
        genBlockCustomModel(gen, ModBlocks.PINK_HIBISCUS.asBlock());
        genBlockCustomModel(gen, ModBlocks.PINK_LACECAP_HYDRANGEA.asBlock());
        genBlockCustomModel(gen, ModBlocks.WHITE_LACECAP_HYDRANGEA.asBlock());
        genBlockCustomModel(gen, ModBlocks.BLUE_LACECAP_HYDRANGEA.asBlock());
        genBlockCustomModel(gen, ModBlocks.FIRE_LILY.asBlock());

        genBlockCustomModel(gen, ModBlocks.LAMPBLOSSOM.asBlock());

        gen.createDoublePlant(ModBlocks.TITAN_ARUM.asBlock(), BlockModelGenerators.TintState.NOT_TINTED);

        gen.createCrossBlock(ModBlocks.BLUE_TWIN_CELALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.WHITE_TWIN_CELALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.RED_TWIN_CELALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.PINK_TWIN_CELALION.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.ORANGE_TWIN_CELALION.asBlock(), BlockModelGenerators.TintState.TINTED);

        gen.createCrossBlock(ModBlocks.BLUE_ROMENTA.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.PINK_ROMENTA.asBlock(), BlockModelGenerators.TintState.TINTED);
        gen.createCrossBlock(ModBlocks.ORANGE_ROMENTA.asBlock(), BlockModelGenerators.TintState.TINTED);

        gen.createCrossBlock(ModBlocks.WELWITSCHIA.asBlock(), BlockModelGenerators.TintState.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.BIRD_OF_PARADISE.asBlock(), BlockModelGenerators.TintState.TINTED);

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

        createTallFlower(gen, ModBlocks.TALL_ALLIUM.asBlock(), "", "tall_allium");
        createTallFlower(gen, ModBlocks.BLUE_TALL_ALLIUM.asBlock(), "blue", "tall_allium");

        createTallFlower(gen, ModBlocks.WHITE_VINE_LOTUS.asBlock(), "white", "vine_lotus");
        createTallFlower(gen, ModBlocks.PINK_VINE_LOTUS.asBlock(), "pink", "vine_lotus");

        createSingleTypeTallFlower(gen, ModBlocks.BLUE_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf(StraddColor.blue));
        createSingleTypeTallFlower(gen, ModBlocks.PINK_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf(StraddColor.pink));
        createSingleTypeTallFlower(gen, ModBlocks.PURPLE_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf(StraddColor.purple));
        createSingleTypeTallFlower(gen, ModBlocks.YELLOW_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf(StraddColor.yellow));
        createSingleTypeTallFlower(gen, ModBlocks.WHITE_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf(StraddColor.white));
        createSingleTypeTallFlower(gen, ModBlocks.RED_TALL_HYACINTH.asBlock(), PrefList.HYACINTH.colorOf(StraddColor.red));

        createCustomFlowerBed(gen, ModBlocks.WATER_HYACINTH.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.LAVA_HYACINTH.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.TORCH_GINGER.asBlock(), 3);
        createCustomFlowerBed(gen, ModBlocks.DANDELION_BED.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.WATER_POPPY.asBlock(), 4);

        gen.createSimpleFlatItemModel(ModBlocks.BLUE_TWIN_CELALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.WHITE_TWIN_CELALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.RED_TWIN_CELALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.PINK_TWIN_CELALION.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.ORANGE_TWIN_CELALION.asBlock());

        gen.createSimpleFlatItemModel(ModBlocks.BLEEDING_QUADHEART.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.CANDY_BLEEDING_QUADHEART.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.HOLLOW_BLEEDING_QUADHEART.asBlock());

        gen.createSimpleFlatItemModel(ModBlocks.BLUE_ROMENTA.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.PINK_ROMENTA.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.ORANGE_ROMENTA.asBlock());

        gen.createSimpleFlatItemModel(ModBlocks.BIRD_OF_PARADISE.asBlock());
        gen.createSimpleFlatItemModel(ModBlocks.WELWITSCHIA.asBlock());

        createSunflowerBed(gen);


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

        gen.generateFlatItem(ModBlocks.BEE_BALM.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.LAMPBLOSSOM.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.TALL_ALLIUM.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.BLUE_TALL_ALLIUM.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.TORCH_GINGER.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.ORANGE_HIBISCUS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.BLUE_HIBISCUS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_HIBISCUS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.DANDELION_BED.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.PINK_VINE_LOTUS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_VINE_LOTUS.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.BLUE_TALL_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_TALL_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PURPLE_TALL_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.YELLOW_TALL_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_TALL_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.RED_TALL_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.WATER_POPPY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.SUNFLOWER_BED.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.FIRE_LILY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.BLUE_LACECAP_HYDRANGEA.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_LACECAP_HYDRANGEA.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_LACECAP_HYDRANGEA.asItem(), ModelTemplates.FLAT_ITEM);

    }

    private void createWaterBed(BlockModelGenerators gen, Block flowerBedBlock) {
        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(flowerBedBlock);

        ResourceLocation resourceLocation = getModelPath(blockId.getPath() + "1");
        ResourceLocation resourceLocation2 = getModelPath(blockId.getPath() + "2");
        ResourceLocation resourceLocation3 = getModelPath(blockId.getPath() + "3");
        ResourceLocation resourceLocation4 = getModelPath(blockId.getPath() + "4");

        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(flowerBedBlock)
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 1, new Integer[]{2, 3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation2))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 2, new Integer[]{3, 4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation3))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 3, new Integer[]{4}).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation4))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                .with(Condition.condition().term(BlockStateProperties.FLOWER_AMOUNT, 4).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)));
    }

    private void createCustomFlowerBed(BlockModelGenerators gen, Block flowerBedBlock, int maxCount) {
        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(flowerBedBlock);

        MultiPartGenerator stateGen = MultiPartGenerator.multiPart(flowerBedBlock);

        for (int i = 1; i <= maxCount; i++) {
            ResourceLocation texture = getModelPath(blockId.getPath() + i);

            stateGen = stateGen
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, texture))
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, texture).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, texture).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, texture).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270));

        }


        gen.blockStateOutput.accept(stateGen);

    }

    private void createSunflowerBed(BlockModelGenerators gen) {
        Block block = ModBlocks.SUNFLOWER_BED.asBlock();

        String id = "sunflower_bed";

        ResourceLocation group1 = getModelPath(id + 1);
        ResourceLocation group2 = getModelPath(id + 2);
        ResourceLocation group3 = getModelPath(id + 3);
        ResourceLocation group4 = getModelPath(id + 4);

        MultiPartGenerator v = MultiPartGenerator.multiPart(block);

        for (Direction dir : List.of(Direction.NORTH,Direction.SOUTH,Direction.EAST,Direction.WEST)) {
            List<ResourceLocation> myList;

            switch (dir) {
                case NORTH -> myList = List.of(group2, group3, group4, group1);
                case SOUTH -> myList = List.of(group4, group1, group2, group3);
                case EAST -> myList = List.of(group1, group2, group3, group4);
                case WEST -> myList = List.of(group3, group4, group1, group2);
                default -> myList = List.of();
            }

            for (int i = 1; i <= 4; i++) {
               v = v.with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i, i < 4 ? IntStream.rangeClosed(Math.min(i + 1, 4), 4).boxed().toArray(Integer[]::new) : new Integer[]{}).term(BlockStateProperties.HORIZONTAL_FACING, dir), Variant.variant().with(VariantProperties.MODEL, myList.get(i - 1)));
            }

            /*
            v = v
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, 1), Variant.variant().with(VariantProperties.MODEL, getModelPath(id + 1)))
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, 2), Variant.variant().with(VariantProperties.MODEL, getModelPath(id + 2)))
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, 3), Variant.variant().with(VariantProperties.MODEL, getModelPath(id + 3)))
                    .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, 4), Variant.variant().with(VariantProperties.MODEL, getModelPath(id + 4)));*/
        }

        gen.blockStateOutput.accept(v);
    }

    private ResourceLocation getModelPath(String path) {
        return MagishanLib.newId("block/" + path);
    }

    private void genBlockCustomModel(BlockModelGenerators gen, Block block) {
        gen.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, ModelLocationUtils.getModelLocation(block)));
    }

    private void createTallFlower(BlockModelGenerators gen, Block block, String color, String base) {
        ResourceLocation bottom = getModelPath(base + "s/bases/" + base + "_bottom");
        ResourceLocation middle = getModelPath(base + "s/bases/" + base +  "_middle");
        ResourceLocation top = getModelPath(base + "s/" + (color.isEmpty() ? "" : color + "_") + base + "_top");

        if (color.equals("glowing")) {
            bottom = getModelPath(base + "s/bases/glowing_" + base + "_bottom");
            middle = getModelPath(base + "s/bases/glowing_" + base + "_middle");
        }
        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(block)
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 1), Variant.variant().with(VariantProperties.MODEL, bottom))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 2), Variant.variant().with(VariantProperties.MODEL, middle))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 3), Variant.variant().with(VariantProperties.MODEL, top))
        );
    }

    private void createSingleTypeTallFlower(BlockModelGenerators gen, Block block, String name) {
        ResourceLocation bottom = getModelPath(name + "/" + "bottom");
        ResourceLocation middle = getModelPath(name + "/" +  "middle");
        ResourceLocation top = getModelPath(name + "/" + "top");

        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(block)
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 1), Variant.variant().with(VariantProperties.MODEL, bottom))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 2), Variant.variant().with(VariantProperties.MODEL, middle))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 3), Variant.variant().with(VariantProperties.MODEL, top))
        );
    }

}
