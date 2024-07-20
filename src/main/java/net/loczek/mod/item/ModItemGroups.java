package net.loczek.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.loczek.mod.CustomMod;
import net.loczek.mod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CUSTOM_ORES = Registry.register(Registries.ITEM_GROUP,
           new Identifier(CustomMod.MOD_ID, "custom_ores"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom_ores"))
                    .icon(() -> new ItemStack(ModItems.PLATYNA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PLATYNA);
                        entries.add(ModItems.TUNGSTEN);
                        entries.add(ModItems.RAW_PLATYNA);
                        entries.add(ModItems.RAW_TUNGSTEN);

                        entries.add(ModBlocks.PLATYNA_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.PLATYNA_ORE_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_ORE_BLOCK);

                        entries.add(ModBlocks.PLATYNA_SLAB);
                        entries.add(ModBlocks.TUNGSTEN_SLAB);
                        entries.add(ModBlocks.PLATYNA_STAIRS);
                        entries.add(ModBlocks.TUNGSTEN_STAIRS);

                    }).build());

    public static final ItemGroup CUSTOM_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomMod.MOD_ID, "custom_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom_tools"))
                    .icon(() -> new ItemStack(ModItems.PLATYNA_PICKAXE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TUNGSTEN_PICKAXE);
                        entries.add(ModItems.TUNGSTEN_AXE);
                        entries.add(ModItems.TUNGSTEN_SWORD);
                        entries.add(ModItems.TUNGSTEN_SHOVEL);
                        entries.add(ModItems.TUNGSTEN_HOE);

                        entries.add(ModItems.PLATYNA_PICKAXE);
                        entries.add(ModItems.PLATYNA_AXE);
                        entries.add(ModItems.PLATYNA_SWORD);
                        entries.add(ModItems.PLATYNA_SHOVEL);
                        entries.add(ModItems.PLATYNA_HOE);

                    }).build());

    public static final ItemGroup CUSTOM_ARMOR = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomMod.MOD_ID, "custom_armor"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom_armor"))
                    .icon(() -> new ItemStack(ModItems.PLATYNA_CHESTPLATE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TUNGSTEN_HELMET);
                        entries.add(ModItems.TUNGSTEN_CHESTPLATE);
                        entries.add(ModItems.TUNGSTEN_LEGGINGS);
                        entries.add(ModItems.TUNGSTEN_BOOTS);

                        entries.add(ModItems.PLATYNA_HELMET);
                        entries.add(ModItems.PLATYNA_CHESTPLATE);
                        entries.add(ModItems.PLATYNA_LEGGINGS);
                        entries.add(ModItems.PLATYNA_BOOTS);

                    }).build());

    public static final ItemGroup CUSTOM_STATIONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomMod.MOD_ID, "custom_stations"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom_stations"))
                    .icon(() -> new ItemStack(ModBlocks.ORE_MELTING_STATION)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.ORE_MELTING_STATION);

                    }).build());

    public static void registerItemGroups() {
        CustomMod.LOGGER.info("Registering item groups for " + CustomMod.MOD_ID);
    }

}
