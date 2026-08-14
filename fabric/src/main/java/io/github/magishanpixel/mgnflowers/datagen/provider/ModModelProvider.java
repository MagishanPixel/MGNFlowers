package io.github.magishanpixel.mgnflowers.datagen.provider;

import com.google.gson.JsonObject;
import io.github.magishanpixel.mgnflowers.MGNFlowers;
import io.github.magishanpixel.mgnflowers.block.CustomFlowerBedBlock;
import io.github.magishanpixel.mgnflowers.block.TallerFlowerBlock;
import io.github.magishanpixel.mgnflowers.block.VineLotusBlock;
import io.github.magishanpixel.mgnflowers.init.ModBlocks;
import io.github.magishanpixel.mgnflowers.misc.MGNConstants;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.ConditionBuilder;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

@Environment(EnvType.CLIENT)
public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private final Set<Identifier> modelCreated = new HashSet<>();

    @Override
    public void generateBlockStateModels(BlockModelGenerators gen) {
        genRotVariantBlock(gen, ModBlocks.MOTH_IRIS.asBlock());
        genRotVariantBlock(gen, ModBlocks.IRIS.asBlock());
        genRotVariantBlock(gen, ModBlocks.SAVANNAH_SUNSET_IRIS.asBlock());
        genBlockCustomModel(gen, ModBlocks.GROTTAL_BLOOM.asBlock());

        genRotVariantBlock(gen, ModBlocks.TRILLIUM.asBlock());
        genRotVariantBlock(gen, ModBlocks.WHITE_CYCLAMEN.asBlock());
        genRotVariantBlock(gen, ModBlocks.PINK_CYCLAMEN.asBlock());

        genBlockCustomModel(gen, ModBlocks.BLEEDING_HEART.asBlock());
        genBlockCustomModel(gen, ModBlocks.CANDY_BLEEDING_HEART.asBlock());
        genBlockCustomModel(gen, ModBlocks.HOLLOW_BLEEDING_HEART.asBlock());

        genBlockCustomModel(gen, ModBlocks.BEE_BALM.asBlock());

        genRotVariantBlock(gen, ModBlocks.PINK_LACECAP_HYDRANGEA.asBlock());
        genRotVariantBlock(gen, ModBlocks.WHITE_LACECAP_HYDRANGEA.asBlock());
        genRotVariantBlock(gen, ModBlocks.BLUE_LACECAP_HYDRANGEA.asBlock());
        genBlockCustomModel(gen, ModBlocks.FIRE_LILY.asBlock());

        genBlockCustomModel(gen, ModBlocks.LAMPBLOSSOM.asBlock());

        gen.createCrossBlock(ModBlocks.BLUE_TWIN_POPPY.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.WHITE_TWIN_POPPY.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.RED_TWIN_POPPY.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.PINK_TWIN_POPPY.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.ORANGE_TWIN_POPPY.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);

        gen.createCrossBlock(ModBlocks.BLUE_ROMENTA.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.PINK_ROMENTA.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.ORANGE_ROMENTA.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);

        gen.createCrossBlock(ModBlocks.WELWITSCHIA.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);
        gen.createCrossBlock(ModBlocks.BIRD_OF_PARADISE.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);

        createTallFlower(gen, ModBlocks.ORANGE_TALL_TULIP.asBlock(), "orange", "tall_tulip");
        createTallFlower(gen, ModBlocks.WHITE_TALL_TULIP.asBlock(), "white", "tall_tulip");
        createTallFlower(gen, ModBlocks.PINK_TALL_TULIP.asBlock(), "pink", "tall_tulip");
        createTallFlower(gen, ModBlocks.PURPLE_TALL_TULIP.asBlock(), "purple", "tall_tulip");
        createTallFlower(gen, ModBlocks.RED_TALL_TULIP.asBlock(), "red", "tall_tulip");
        createTallFlower(gen, ModBlocks.TURQUOISE_TALL_TULIP.asBlock(), "turquoise", "tall_tulip");

        createTallFlower(gen, ModBlocks.RED_GINGER_LILY.asBlock(), "red", "ginger_lily");
        createTallFlower(gen, ModBlocks.ORANGE_GINGER_LILY.asBlock(), "orange", "ginger_lily");
        createTallFlower(gen, ModBlocks.WHITE_GINGER_LILY.asBlock(), "white", "ginger_lily");
        createTallFlower(gen, ModBlocks.PINK_GINGER_LILY.asBlock(), "pink", "ginger_lily");

        createTallFlower(gen, ModBlocks.TALL_ALLIUM.asBlock(), "", "tall_allium");
        createTallFlower(gen, ModBlocks.BLUE_TALL_ALLIUM.asBlock(), "blue", "tall_allium");

        createVineLotus(gen, ModBlocks.WHITE_VINE_LOTUS.asBlock(), "white");
        createVineLotus(gen, ModBlocks.PINK_VINE_LOTUS.asBlock(), "pink");
        createVineLotus(gen, ModBlocks.GLOWING_VINE_LOTUS.asBlock(), "glowing");

        genBlockCustomModel(gen, ModBlocks.BLUE_HYACINTH.asBlock());
        genBlockCustomModel(gen, ModBlocks.PINK_HYACINTH.asBlock());
        genBlockCustomModel(gen, ModBlocks.PURPLE_HYACINTH.asBlock());
        genBlockCustomModel(gen, ModBlocks.YELLOW_HYACINTH.asBlock());
        genBlockCustomModel(gen, ModBlocks.WHITE_HYACINTH.asBlock());
        genBlockCustomModel(gen, ModBlocks.RED_HYACINTH.asBlock());

        createSingleTypeTallFlower(gen, ModBlocks.GLOWING_TALL_TULIP.asBlock(), "glowing_tall_tulip");
        createCustomFlowerBed(gen, ModBlocks.SAND_VERBENA.asBlock(), 4);

        createSunflowerBed(gen);
        gen.createCrossBlock(ModBlocks.GLACIER_LILY.asBlock(), BlockModelGenerators.PlantType.NOT_TINTED);

        createSlightlyCrossModel(gen, getBlockPath("fireweed_bottom"), getBlockPath("fireweed_bottom"));
        createSlightlyCrossModel(gen, getBlockPath("fireweed_top"), getBlockPath("fireweed_top"));

        createCustomFlowerBed(gen, ModBlocks.WATER_HYACINTH.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.TORCH_GINGER.asBlock(), 3);
        createCustomFlowerBed(gen, ModBlocks.DANDELION_BED.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.WATER_POPPY.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.WOOD_SORREL.asBlock(), 4);
        createCustomFlowerBed(gen, ModBlocks.WINTER_ACONITE.asBlock(), 4);

        genBlockCustomModel(gen, ModBlocks.RED_BEE_BALM.asBlock());

        gen.registerSimpleFlatItemModel(ModBlocks.BLUE_TWIN_POPPY.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.WHITE_TWIN_POPPY.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.RED_TWIN_POPPY.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.PINK_TWIN_POPPY.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.ORANGE_TWIN_POPPY.asBlock());

        gen.registerSimpleFlatItemModel(ModBlocks.BLEEDING_HEART.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.CANDY_BLEEDING_HEART.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.HOLLOW_BLEEDING_HEART.asBlock());

        gen.registerSimpleFlatItemModel(ModBlocks.BLUE_ROMENTA.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.PINK_ROMENTA.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.ORANGE_ROMENTA.asBlock());

        gen.registerSimpleFlatItemModel(ModBlocks.BIRD_OF_PARADISE.asBlock());
        gen.registerSimpleFlatItemModel(ModBlocks.WELWITSCHIA.asBlock());

        gen.registerSimpleFlatItemModel(ModBlocks.GLACIER_LILY.asBlock());

    }

    @Override
    public void generateItemModels(ItemModelGenerators gen) {
        gen.generateFlatItem(ModBlocks.MOTH_IRIS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.IRIS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.GROTTAL_BLOOM.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.WATER_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.RED_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.ORANGE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.GLOWING_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PURPLE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.TURQUOISE_TALL_TULIP.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.PINK_GINGER_LILY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.RED_GINGER_LILY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.ORANGE_GINGER_LILY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_GINGER_LILY.asItem(), ModelTemplates.FLAT_ITEM);;

        gen.generateFlatItem(ModBlocks.BEE_BALM.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.LAMPBLOSSOM.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.TALL_ALLIUM.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.BLUE_TALL_ALLIUM.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.TORCH_GINGER.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.DANDELION_BED.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.PINK_VINE_LOTUS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_VINE_LOTUS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.GLOWING_VINE_LOTUS.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.BLUE_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PURPLE_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.YELLOW_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.RED_HYACINTH.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.WATER_POPPY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.SUNFLOWER_BED.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.FIRE_LILY.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.BLUE_LACECAP_HYDRANGEA.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_LACECAP_HYDRANGEA.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_LACECAP_HYDRANGEA.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.WOOD_SORREL.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.TRILLIUM.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WHITE_CYCLAMEN.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.PINK_CYCLAMEN.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.SAVANNAH_SUNSET_IRIS.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.SAND_VERBENA.asItem(), ModelTemplates.FLAT_ITEM);

        gen.generateFlatItem(ModBlocks.RED_BEE_BALM.asItem(), ModelTemplates.FLAT_ITEM);
        gen.generateFlatItem(ModBlocks.WINTER_ACONITE.asItem(), ModelTemplates.FLAT_ITEM);
    }

    private void createFlatItemPlant(BlockModelGenerators gen, Block block) {
        gen.createFlatItemModelWithBlockTexture(block.asItem(), block);
    }

    private void createCustomFlowerBed(BlockModelGenerators gen, Block flowerBedBlock, int maxCount) {
        Identifier blockId = BuiltInRegistries.BLOCK.getKey(flowerBedBlock);

        var stateGen = MultiVariantGenerator.dispatch(flowerBedBlock);
        var p = PropertyDispatch.initial(CustomFlowerBedBlock.AMOUNT, BlockStateProperties.HORIZONTAL_FACING);

        for (int i = 1; i <= 4; i++) {
            Identifier texture = getBlockPath(blockId.getPath() + Math.min(i, maxCount));

            p = p.select(i, Direction.NORTH, BlockModelGenerators.plainVariant(texture))
                    .select(i, Direction.EAST, BlockModelGenerators.plainVariant(texture).with(BlockModelGenerators.Y_ROT_90))
                    .select(i, Direction.SOUTH, BlockModelGenerators.plainVariant(texture).with(BlockModelGenerators.Y_ROT_180))
                    .select(i, Direction.WEST, BlockModelGenerators.plainVariant(texture).with(BlockModelGenerators.Y_ROT_270))

            ;
                   // .with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), Variant.variant().with(VariantProperties.MODEL, texture))
                    //.with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), Variant.variant().with(VariantProperties.MODEL, texture).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    //.with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), Variant.variant().with(VariantProperties.MODEL, texture).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                    //.with(Condition.condition().term(CustomFlowerBedBlock.AMOUNT, i).term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), Variant.variant().with(VariantProperties.MODEL, texture).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270));
        }


        gen.blockStateOutput.accept(stateGen.with(p));

    }

    private void createSunflowerBed(BlockModelGenerators gen) {
        Block block = ModBlocks.SUNFLOWER_BED.asBlock();

        String id = "sunflower_bed";

        Identifier group1 = getBlockPath(id + 1);
        Identifier group2 = getBlockPath(id + 2);
        Identifier group3 = getBlockPath(id + 3);
        Identifier group4 = getBlockPath(id + 4);

        var p = PropertyDispatch.initial(CustomFlowerBedBlock.AMOUNT);
        var v = MultiPartGenerator.multiPart(block);

        for (Direction dir : List.of(Direction.NORTH,Direction.SOUTH,Direction.EAST,Direction.WEST)) {
            List<Identifier> myList;

            switch (dir) {
                case NORTH -> myList = List.of(group2, group3, group4, group1);
                case SOUTH -> myList = List.of(group4, group1, group2, group3);
                case EAST -> myList = List.of(group1, group2, group3, group4);
                case WEST -> myList = List.of(group3, group4, group1, group2);
                default -> myList = List.of();
            }

            for (int i = 1; i <= 4; i++) {
                int b = i; // ????
                MGNConstants.LOG.info("b " + i);
                Integer[] a = i < 4 ? IntStream.rangeClosed(Math.min(i + 1, 4), 4).boxed().toArray(Integer[]::new): new Integer[]{};
                Function<ConditionBuilder, ConditionBuilder> condition = (c) -> c.term(CustomFlowerBedBlock.AMOUNT, b, a);
                v.with(condition.apply(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, dir)).build(), BlockModelGenerators.plainVariant(myList.get(i - 1)));
            }
        }

        gen.blockStateOutput.accept(v);


    }

    private static Identifier getBlockPath(String path) {
        return MGNFlowers.newId("block/" + path);
    }

    private void genBlockCustomModel(BlockModelGenerators gen, Block block) {
        gen.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block))));
    }

    private void genRotVariantBlock(BlockModelGenerators gen, Block block) {
        gen.blockStateOutput.accept(MultiVariantGenerator.dispatch(block, BlockModelGenerators.createRotatedVariants(new Variant(ModelLocationUtils.getModelLocation(block))) ));
    }

    private void createSlightlyCrossModel(BlockModelGenerators gen, Identifier location, Identifier texture) {
        if (modelCreated.contains(location)) return;

        JsonObject obj = new JsonObject();
        obj.addProperty("parent", getBlockPath("templates/slightly_cross").toString());

        JsonObject textures = new JsonObject();
        textures.addProperty("0", texture.toString());
        textures.addProperty("particle", texture.toString());
        obj.add("textures", textures);

        gen.modelOutput.accept(location, () -> obj);

        modelCreated.add(location);
    }

    private void createTallFlower(BlockModelGenerators gen, Block block, String color, String base) {
        createTallFlower(gen, block, color, base, true);
    }

    private void createTallFlower(BlockModelGenerators gen, Block block, String color, String base, boolean generateModel) {
        String strBottom =  base + "_bottom";
        String strMiddle =  base + "_middle";
        String strTop = (color.isEmpty() ? "" : (color + "_")) + base + "_top";
        String strShort = (color.isEmpty() ? "" : (color + "_")) + base + "_short";

        final boolean canBeShort = ((TallerFlowerBlock) block).canBeShort;

        Identifier bottom = getBlockPath("taller_flower/multi/" + base + "/bases/" + strBottom);
        Identifier middle = getBlockPath("taller_flower/multi/" + base + "/bases/" + strMiddle);
        Identifier top = getBlockPath("taller_flower/multi/" + base + "/" + strTop);
        Identifier shortStem = getBlockPath("taller_flower/multi/" + base + "/" + strShort);

        if (generateModel) {
            createSlightlyCrossModel(gen, bottom, getBlockPath(strBottom));
            createSlightlyCrossModel(gen, middle, getBlockPath(strMiddle));
            createSlightlyCrossModel(gen, top, getBlockPath(strTop));

            if (canBeShort) {
                createSlightlyCrossModel(gen, top, getBlockPath(strTop));
            }
        }

        gen.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(
                PropertyDispatch.initial(TallerFlowerBlock.STEM)
                        .select(0, BlockModelGenerators.plainVariant(canBeShort ? shortStem : bottom))
                        .select(1, BlockModelGenerators.plainVariant(bottom))
                        .select(2, BlockModelGenerators.plainVariant(middle))
                        .select(3, BlockModelGenerators.plainVariant(top))

        ));
    }

    private void createVineLotus(BlockModelGenerators gen, Block block, String color) {
        String stemBonus = color.equals("glowing") ? "glowing_" : "";
        String strBottom = stemBonus + "vine_lotus_bottom";
        String strMiddle = stemBonus + "vine_lotus_middle";
        String strTop = color + "_vine_lotus_top";
        String strShort = color + "_vine_lotus_short";
        String strCut = color + "_vine_lotus_cut";

        Identifier bottom = getBlockPath(strBottom);
        Identifier middle = getBlockPath(strMiddle);
        Identifier top = getBlockPath(strTop);
        Identifier shortStem = getBlockPath(strShort);
        Identifier cut = getBlockPath(strCut);

        /*
        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(block)
                .with(Condition.condition().term(VineLotusBlock.SHEARED, false).term(TallerFlowerBlock.STEM, 0), Variant.variant().with(VariantProperties.MODEL, shortStem))
                .with(Condition.condition().term(VineLotusBlock.SHEARED, false).term(TallerFlowerBlock.STEM, 1), Variant.variant().with(VariantProperties.MODEL, bottom))
                .with(Condition.condition().term(VineLotusBlock.SHEARED, false).term(TallerFlowerBlock.STEM, 2), Variant.variant().with(VariantProperties.MODEL, middle))
                .with(Condition.condition().term(VineLotusBlock.SHEARED, false).term(TallerFlowerBlock.STEM, 3), Variant.variant().with(VariantProperties.MODEL, top))
                .with(Condition.condition().term(VineLotusBlock.SHEARED, true).term(TallerFlowerBlock.STEM, 0), Variant.variant().with(VariantProperties.MODEL, cut))
        );*/
        gen.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(TallerFlowerBlock.STEM, VineLotusBlock.SHEARED)
                .select(0, false, BlockModelGenerators.plainVariant(shortStem))
                .select(1, false, BlockModelGenerators.plainVariant(bottom))
                .select(2, false, BlockModelGenerators.plainVariant(middle))
                .select(3, false, BlockModelGenerators.plainVariant(top))
                .select(0, true, BlockModelGenerators.plainVariant(cut))
                .select(1, true, BlockModelGenerators.plainVariant(cut))
                .select(2, true, BlockModelGenerators.plainVariant(cut))
                .select(3, true, BlockModelGenerators.plainVariant(cut))
        ));


    }

    private void createSingleTypeTallFlower(BlockModelGenerators gen, Block block, String name) {
        createSingleTypeTallFlower(gen, block, name, true);
    }

    private void createSingleTypeTallFlower(BlockModelGenerators gen, Block block, String name, boolean generateModel) {
        Identifier bottom = getBlockPath("taller_flower/single/" + name + "/" + "bottom");
        Identifier middle = getBlockPath("taller_flower/single/" + name + "/" + "middle");
        Identifier top = getBlockPath("taller_flower/single/" + name + "/" + "top");
        Identifier shortStem = getBlockPath("taller_flower/single/" + name + "/" + "short");

        boolean canBeShort = ((TallerFlowerBlock) block).canBeShort;

        if (generateModel) {
            createSlightlyCrossModel(gen, bottom, getBlockPath(name + "_bottom"));
            createSlightlyCrossModel(gen, middle, getBlockPath(name + "_middle"));
            createSlightlyCrossModel(gen, top, getBlockPath(name + "_top"));

            if (canBeShort) {
                createSlightlyCrossModel(gen, shortStem, getBlockPath(name + "_short"));
            }
        }

        /*
        gen.blockStateOutput.accept(MultiPartGenerator.multiPart(block)
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 0), Variant.variant().with(VariantProperties.MODEL, canBeShort ? shortStem : bottom))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 1), Variant.variant().with(VariantProperties.MODEL, bottom))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 2), Variant.variant().with(VariantProperties.MODEL, middle))
                .with(Condition.condition().term(TallerFlowerBlock.STEM, 3), Variant.variant().with(VariantProperties.MODEL, top))
        );*/

        gen.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(
                PropertyDispatch.initial(TallerFlowerBlock.STEM)
                        .select(0, BlockModelGenerators.plainVariant(canBeShort ? shortStem : bottom))
                        .select(1, BlockModelGenerators.plainVariant(bottom))
                        .select(2, BlockModelGenerators.plainVariant(middle))
                        .select(3, BlockModelGenerators.plainVariant(top))

        ));
    }

}
