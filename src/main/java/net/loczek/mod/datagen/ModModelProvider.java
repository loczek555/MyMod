package net.loczek.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.loczek.mod.block.ModBlocks;
import net.loczek.mod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool platynaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATYNA_BLOCK);
        BlockStateModelGenerator.BlockTexturePool tungstenPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TUNGSTEN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATYNA_ORE_BLOCK);

        platynaPool.stairs(ModBlocks.PLATYNA_STAIRS);
        platynaPool.slab(ModBlocks.PLATYNA_SLAB);
        tungstenPool.stairs(ModBlocks.TUNGSTEN_STAIRS);
        tungstenPool.slab(ModBlocks.TUNGSTEN_SLAB);

        blockStateModelGenerator.registerSimpleState(ModBlocks.ORE_MELTING_STATION);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_PLATYNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLATYNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PLATYNA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATYNA_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATYNA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATYNA_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATYNA_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATYNA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATYNA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATYNA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PLATYNA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_BOOTS));
    }
}
