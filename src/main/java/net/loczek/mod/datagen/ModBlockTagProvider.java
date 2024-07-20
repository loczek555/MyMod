package net.loczek.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.loczek.mod.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PLATYNA_BLOCK)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.PLATYNA_ORE_BLOCK)
                .add(ModBlocks.TUNGSTEN_ORE_BLOCK)
                .add(ModBlocks.PLATYNA_SLAB)
                .add(ModBlocks.TUNGSTEN_SLAB)
                .add(ModBlocks.PLATYNA_STAIRS)
                .add(ModBlocks.TUNGSTEN_STAIRS)

                .add(ModBlocks.ORE_MELTING_STATION);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ORE_MELTING_STATION);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.TUNGSTEN_ORE_BLOCK)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.TUNGSTEN_SLAB)
                .add(ModBlocks.TUNGSTEN_STAIRS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.PLATYNA_ORE_BLOCK)
                .add(ModBlocks.PLATYNA_BLOCK)
                .add(ModBlocks.PLATYNA_SLAB)
                .add(ModBlocks.PLATYNA_STAIRS);
    }
}
