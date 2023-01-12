package com.popfizz.watchblock;

import com.popfizz.watchblock.screen.ModScreenHandlers;
import com.popfizz.watchblock.screen.PlatingStationScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class WatchBlockClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.PLATING_STATION_SCREEN_HANDLER, PlatingStationScreen::new);
    }
}
