package net.loczek.mod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.loczek.mod.CustomMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<OreMeltingScreenHandler> ORE_SMELTING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(CustomMod.MOD_ID, "ore_melter"),
                    new ExtendedScreenHandlerType<>(OreMeltingScreenHandler::new));

    public static void registerScreenHandlers() {
        CustomMod.LOGGER.info("Registering Screen Handlers for " + CustomMod.MOD_ID);
    }
}
