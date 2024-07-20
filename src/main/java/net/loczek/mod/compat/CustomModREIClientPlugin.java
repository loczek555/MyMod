package net.loczek.mod.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.loczek.mod.block.ModBlocks;
import net.loczek.mod.recipe.OreMelterRecipe;
import net.loczek.mod.screen.OreMeltingScreen;

import java.awt.*;

public class CustomModREIClientPlugin implements REIClientPlugin {


    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new OreMeltingCategory());

        registry.addWorkstations(OreMeltingCategory.ORE_MELTER, EntryStacks.of(ModBlocks.ORE_MELTING_STATION));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(OreMelterRecipe.class, OreMelterRecipe.Type.INSTANCE,
                OreMeltingDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), OreMeltingScreen.class,
                OreMeltingCategory.ORE_MELTER);
    }
}
