package net.loczek.mod;

import net.fabricmc.api.ClientModInitializer;
import net.loczek.mod.screen.ModScreenHandlers;
import net.loczek.mod.screen.OreSmeltingScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CustomModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandlers.ORE_SMELTING_SCREEN_HANDLER, OreSmeltingScreen::new);

    }
}
