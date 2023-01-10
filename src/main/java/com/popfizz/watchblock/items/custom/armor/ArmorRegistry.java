package com.popfizz.watchblock.items.custom.armor;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.items.custom.ModItemGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmorRegistry {



    public static final ArmorMaterial RUBY_ARMOR_METERIAL = new RubyArmorMaterial();
    public static final ArmorMaterial EMERALD_ARMOR_METERIAL = new EmeraldArmorMaterial();


    public static final Item RUBY_HELMET = new ArmorItem(
            RUBY_ARMOR_METERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito)
    );
    public static final Item RUBY_CHESTPLATE = new ArmorItem(
            RUBY_ARMOR_METERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito)
    );
    public static final Item RUBY_LEGGINGS = new ArmorItem(
            RUBY_ARMOR_METERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito)
    );
    public static final Item RUBY_BOOTS = new ArmorItem(
            RUBY_ARMOR_METERIAL, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito)
    );


    public static final Item EMERALD_HELMET = new ArmorItem(
            EMERALD_ARMOR_METERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito)
    );
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(
            EMERALD_ARMOR_METERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito)
    );
    public static final Item EMERALD_LEGGINGS = new ArmorItem(
            EMERALD_ARMOR_METERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito)
    );
    public static final Item EMERALD_BOOTS = new ArmorItem(
            EMERALD_ARMOR_METERIAL, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito)
    );



    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_boots"), RUBY_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_boots"), EMERALD_BOOTS);
    }
}


