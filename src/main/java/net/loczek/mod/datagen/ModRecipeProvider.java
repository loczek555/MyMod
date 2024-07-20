package net.loczek.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.loczek.mod.block.ModBlocks;
import net.loczek.mod.item.ModItems;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_PLATYNA), RecipeCategory.MISC, ModItems.PLATYNA, 0.5f, 200, "custom");
        offerSmelting(exporter, List.of(ModItems.RAW_TUNGSTEN), RecipeCategory.MISC, ModItems.TUNGSTEN, 0.5f, 200, "custom");
        offerBlasting(exporter, List.of(ModItems.RAW_PLATYNA), RecipeCategory.MISC, ModItems.PLATYNA, 0.5f, 100, "custom");
        offerBlasting(exporter, List.of(ModItems.RAW_TUNGSTEN), RecipeCategory.MISC, ModItems.TUNGSTEN, 0.5f, 100, "custom");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.PLATYNA, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.PLATYNA_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.TUNGSTEN, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.TUNGSTEN_BLOCK);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATYNA_SLAB, Ingredient.ofItems(ModBlocks.PLATYNA_BLOCK))
                .criterion("has_platyna_block", InventoryChangedCriterion.Conditions.items(ModBlocks.PLATYNA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PLATYNA_SLAB)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUNGSTEN_SLAB, Ingredient.ofItems(ModBlocks.TUNGSTEN_BLOCK))
                .criterion("has_tungsten_block", InventoryChangedCriterion.Conditions.items(ModBlocks.TUNGSTEN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUNGSTEN_SLAB)));

        createStairsRecipe(ModBlocks.PLATYNA_STAIRS, Ingredient.ofItems(ModBlocks.PLATYNA_BLOCK))
                .criterion("has_platyna_block", InventoryChangedCriterion.Conditions.items(ModBlocks.PLATYNA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PLATYNA_STAIRS)));
        createStairsRecipe(ModBlocks.TUNGSTEN_STAIRS, Ingredient.ofItems(ModBlocks.TUNGSTEN_BLOCK))
                .criterion("has_tungsten_block", InventoryChangedCriterion.Conditions.items(ModBlocks.TUNGSTEN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUNGSTEN_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE, 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN)
                .criterion(hasItem(ModItems.TUNGSTEN),  conditionsFromItem(ModItems.TUNGSTEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TUNGSTEN_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE, 1)
                .pattern(" TT")
                .pattern(" ST")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN)
                .criterion(hasItem(ModItems.TUNGSTEN),  conditionsFromItem(ModItems.TUNGSTEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TUNGSTEN_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SWORD, 1)
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN)
                .criterion(hasItem(ModItems.TUNGSTEN),  conditionsFromItem(ModItems.TUNGSTEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TUNGSTEN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL, 1)
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN)
                .criterion(hasItem(ModItems.TUNGSTEN),  conditionsFromItem(ModItems.TUNGSTEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TUNGSTEN_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE, 1)
                .pattern(" TT")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN)
                .criterion(hasItem(ModItems.TUNGSTEN),  conditionsFromItem(ModItems.TUNGSTEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TUNGSTEN_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATYNA_PICKAXE, 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.PLATYNA)
                .criterion(hasItem(ModItems.PLATYNA),  conditionsFromItem(ModItems.PLATYNA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATYNA_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATYNA_AXE, 1)
                .pattern(" TT")
                .pattern(" ST")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.PLATYNA)
                .criterion(hasItem(ModItems.PLATYNA),  conditionsFromItem(ModItems.PLATYNA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATYNA_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATYNA_SWORD, 1)
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.PLATYNA)
                .criterion(hasItem(ModItems.PLATYNA),  conditionsFromItem(ModItems.PLATYNA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATYNA_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATYNA_SHOVEL, 1)
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.PLATYNA)
                .criterion(hasItem(ModItems.PLATYNA),  conditionsFromItem(ModItems.PLATYNA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATYNA_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATYNA_HOE, 1)
                .pattern(" TT")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.PLATYNA)
                .criterion(hasItem(ModItems.PLATYNA),  conditionsFromItem(ModItems.TUNGSTEN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATYNA_HOE)));



    }
}
