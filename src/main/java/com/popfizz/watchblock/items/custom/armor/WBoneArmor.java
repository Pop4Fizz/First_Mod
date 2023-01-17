package com.popfizz.watchblock.items.custom.armor;

import com.popfizz.watchblock.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WBoneArmor implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{15, 17, 19, 14};
    private static final int[] PROTECTION_VALUES = new int[]{3, 6, 8, 3};

    //{feet, legs, chest, helm}
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 48;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY_PLATING);
    }

    @Override
    public String getName() {
        return "wba";
    }

    @Override
    public float getToughness() {
        return 4F;
    }

    @Override
    public float getKnockbackResistance() {
        return .1F;
    }

}