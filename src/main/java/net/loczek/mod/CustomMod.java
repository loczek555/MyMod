package net.loczek.mod;

import net.fabricmc.api.ModInitializer;

import net.loczek.mod.block.ModBlocks;
import net.loczek.mod.block.entity.ModBlockEntities;
import net.loczek.mod.item.ModItemGroups;
import net.loczek.mod.item.ModItems;
import net.loczek.mod.recipe.ModRecipes;
import net.loczek.mod.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMod implements ModInitializer {
	public static final String MOD_ID = "custom_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlockEntities.registerBlockEntities();
		ModBlocks.registerModBlocks();

		ModRecipes.registerRecipes();

		ModScreenHandlers.registerScreenHandlers();

	}
}