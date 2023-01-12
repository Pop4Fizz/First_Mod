package com.popfizz.watchblock;

import com.popfizz.watchblock.block.entity.ModBlockEntities;
import com.popfizz.watchblock.items.custom.armor.ArmorRegistry;
import com.popfizz.watchblock.items.world.feature.ModConfiguredFeatures;
import com.popfizz.watchblock.items.world.feature.ModOreGeneration;
import com.popfizz.watchblock.recipes.ModRecipes;
import com.popfizz.watchblock.registry.ModItems;
import com.popfizz.watchblock.registry.Modblocks;
import com.popfizz.watchblock.screen.ModScreenHandlers;
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
        ArmorRegistry.registerItems();
        ModBlockEntities.registerBlockEntities();
        ModScreenHandlers.registerAllScreenHandslers();
        ModRecipes.registerRecipes();

        ModOreGeneration.generateOres();
  }
}
