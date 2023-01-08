package com.popfizz.watchblock.items.custom.tools;

import com.popfizz.watchblock.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {
    public static final RubyToolMaterial INSTANCE = new RubyToolMaterial();

    @Override
    public int getDurability() {
        return 700;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }
}
