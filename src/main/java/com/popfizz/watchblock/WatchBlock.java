package com.popfizz.watchblock;

import com.popfizz.watchblock.items.world.feature.ModConfiguredFeatures;
import com.popfizz.watchblock.items.world.feature.ModOreGeneration;
import com.popfizz.watchblock.registry.ModItems;
import com.popfizz.watchblock.registry.Modblocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WatchBlock implements ModInitializer {

    public static final String MOD_ID = "testitem";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();

        ModItems.registerItems();
        Modblocks.registerBlocks();

        ModOreGeneration.generateOres();
  }
}
