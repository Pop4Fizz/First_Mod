package com.popfizz.watchblock;

import com.popfizz.watchblock.registry.ModItems;
import com.popfizz.watchblock.registry.Modblocks;
import net.fabricmc.api.ModInitializer;

public class WatchBlock implements ModInitializer {

    public static final String MOD_ID = "testitem";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        Modblocks.registerBlocks();
    }
}
