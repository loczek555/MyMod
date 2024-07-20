package net.loczek.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.loczek.mod.CustomMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PLATYNA  = registerItem("platyna", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN  = registerItem("tungsten", new Item(new FabricItemSettings()));
    public static final Item RAW_PLATYNA  = registerItem("raw_platyna", new Item(new FabricItemSettings()));
    public static final Item RAW_TUNGSTEN  = registerItem("raw_tungsten", new Item(new FabricItemSettings()));

    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe",
            new PickaxeItem(ModToolMaterial.TUNGSTEN, 2, 2f, new FabricItemSettings()));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe",
            new AxeItem(ModToolMaterial.TUNGSTEN, 2, 2f, new FabricItemSettings()));
    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword",
            new SwordItem(ModToolMaterial.TUNGSTEN, 12, 2f, new FabricItemSettings()));
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel",
            new ShovelItem(ModToolMaterial.TUNGSTEN, 2, 2f, new FabricItemSettings()));
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe",
            new HoeItem(ModToolMaterial.TUNGSTEN, 2, 2f, new FabricItemSettings()));

    public static final Item PLATYNA_PICKAXE = registerItem("platyna_pickaxe",
            new PickaxeItem(ModToolMaterial.PLATYNA, 2, 2f, new FabricItemSettings()));
    public static final Item PLATYNA_AXE = registerItem("platyna_axe",
            new AxeItem(ModToolMaterial.PLATYNA, 2, 2f, new FabricItemSettings()));
    public static final Item PLATYNA_SWORD = registerItem("platyna_sword",
            new SwordItem(ModToolMaterial.PLATYNA, 12, 2f, new FabricItemSettings()));
    public static final Item PLATYNA_SHOVEL = registerItem("platyna_shovel",
            new ShovelItem(ModToolMaterial.PLATYNA, 2, 2f, new FabricItemSettings()));
    public static final Item PLATYNA_HOE = registerItem("platyna_hoe",
            new HoeItem(ModToolMaterial.PLATYNA, 2, 2f, new FabricItemSettings()));

    public static final Item TUNGSTEN_HELMET = registerItem("tungsten_helmet",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TUNGSTEN_CHESTPLATE = registerItem("tungsten_chestplate",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TUNGSTEN_LEGGINGS = registerItem("tungsten_leggings",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TUNGSTEN_BOOTS = registerItem("tungsten_boots",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item PLATYNA_HELMET = registerItem("platyna_helmet",
            new ArmorItem(ModArmorMaterials.PLATYNA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATYNA_CHESTPLATE = registerItem("platyna_chestplate",
            new ArmorItem(ModArmorMaterials.PLATYNA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATYNA_LEGGINGS = registerItem("platyna_leggings",
            new ArmorItem(ModArmorMaterials.PLATYNA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATYNA_BOOTS = registerItem("platyna_boots",
            new ArmorItem(ModArmorMaterials.PLATYNA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void  addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PLATYNA);
        entries.add(TUNGSTEN);
        entries.add(RAW_PLATYNA);
        entries.add(RAW_TUNGSTEN);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomMod.LOGGER.info("Registering mod items for" + CustomMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
