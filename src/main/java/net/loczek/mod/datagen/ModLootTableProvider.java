package net.loczek.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.loczek.mod.block.ModBlocks;
import net.loczek.mod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PLATYNA_BLOCK);
        addDrop(ModBlocks.TUNGSTEN_BLOCK);

        addDrop(ModBlocks.PLATYNA_STAIRS);
        addDrop(ModBlocks.TUNGSTEN_STAIRS);

        addDrop(ModBlocks.PLATYNA_SLAB, slabDrops(ModBlocks.PLATYNA_SLAB));
        addDrop(ModBlocks.TUNGSTEN_SLAB, slabDrops(ModBlocks.TUNGSTEN_SLAB));

        addDrop(ModBlocks.PLATYNA_ORE_BLOCK, customOreDrops(ModBlocks.PLATYNA_ORE_BLOCK, ModItems.RAW_PLATYNA));
        addDrop(ModBlocks.TUNGSTEN_ORE_BLOCK, customOreDrops(ModBlocks.TUNGSTEN_ORE_BLOCK, ModItems.RAW_TUNGSTEN));
    }



    public LootTable.Builder customOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder<?>)this.applyExplosionDecay(drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }


}
