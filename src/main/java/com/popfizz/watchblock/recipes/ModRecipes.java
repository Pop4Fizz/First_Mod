package com.popfizz.watchblock.recipes;

import com.popfizz.watchblock.WatchBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(WatchBlock.MOD_ID, PlatingStationRecipe.Serializer.ID),
                PlatingStationRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(WatchBlock.MOD_ID, PlatingStationRecipe.Type.ID),
                PlatingStationRecipe.Type.INSTANCE);
    }
}

