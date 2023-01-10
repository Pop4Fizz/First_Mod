package com.popfizz.watchblock.items.custom.armor;

import com.popfizz.watchblock.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

    public class EmeraldArmorMaterial implements ArmorMaterial {
        private static final int[] BASE_DURABILITY = new int[] {11, 13, 14, 9};
        private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 4};
        //{feet, legs, chest, helm}
        @Override
        public int getDurability(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * 45;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return PROTECTION_VALUES[slot.getEntitySlotId()];
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.EMERALD);
        }

        @Override
        public String getName() {
            return "emerald";
        }

        @Override
        public float getToughness() {
            return 2
            ;
        }

        @Override
        public float getKnockbackResistance() {
            return 0F;
        }

    }
