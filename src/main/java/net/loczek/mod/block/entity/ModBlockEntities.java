package net.loczek.mod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.loczek.mod.CustomMod;
import net.loczek.mod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<OreMeltingStationsBlockEntity> ORE_MELTING_STATIONS_BLOCK_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CustomMod.MOD_ID, "ore_melting_be"),
                    FabricBlockEntityTypeBuilder.create(OreMeltingStationsBlockEntity::new,
                            ModBlocks.ORE_MELTING_STATION).build());

    public static void registerBlockEntities() {
        CustomMod.LOGGER.info("Registering Block Entities for " + CustomMod.MOD_ID);
    }

}
