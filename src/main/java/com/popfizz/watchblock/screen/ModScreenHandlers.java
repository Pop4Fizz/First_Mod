package com.popfizz.watchblock.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;

public class ModScreenHandlers {
public static ScreenHandlerType<PlatingStationScreenHandler> PLATING_STATION_SCREEN_HANDLER;

public static void registerAllScreenHandslers() {
    PLATING_STATION_SCREEN_HANDLER = new ScreenHandlerType<>(PlatingStationScreenHandler::new);
}

}
