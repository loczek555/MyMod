package net.loczek.mod.recipe;

import net.loczek.mod.CustomMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(CustomMod.MOD_ID, OreMelterRecipe.Serializer.ID),
                OreMelterRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(CustomMod.MOD_ID, OreMelterRecipe.Type.ID),
                OreMelterRecipe.Type.INSTANCE);
    }
}