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
    public static final ArmorMaterial RUBY_NETH_ARMOR = new RubyPNethArmor();
    public static final ArmorMaterial EMERALD_NETH_ARMOR = new EmeraldPNethArmor();

    public static final ArmorMaterial ENDERDRAGON_SCALED_ARMOR = new EScalesArmor();
    public static final ArmorMaterial WARDEN_SCULK_ARMOR = new WSculkArmor();
    public static final ArmorMaterial WITHER_BONE_ARMOR = new WBoneArmor();
    public static final ArmorMaterial GAURDIAN_HIDE_ARMOR = new GHideArmor();


    public static final Item RUBY_HELMET = new ArmorItem(RUBY_ARMOR_METERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(RUBY_ARMOR_METERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_LEGGINGS = new ArmorItem(RUBY_ARMOR_METERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_BOOTS = new ArmorItem(RUBY_ARMOR_METERIAL, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));


    public static final Item EMERALD_HELMET = new ArmorItem(EMERALD_ARMOR_METERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(EMERALD_ARMOR_METERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item EMERALD_LEGGINGS = new ArmorItem(EMERALD_ARMOR_METERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item EMERALD_BOOTS = new ArmorItem(EMERALD_ARMOR_METERIAL, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));


    public static final Item RUBY_NETH_HELMET = new ArmorItem(RUBY_NETH_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_NETH_CHESTPLATE = new ArmorItem(RUBY_NETH_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_NETH_LEGGINGS = new ArmorItem(RUBY_NETH_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_NETH_BOOTS = new ArmorItem(RUBY_NETH_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));

    public static final Item EMERALD_NETH_HELMET = new ArmorItem(EMERALD_NETH_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item EMERALD_NETH_CHESTPLATE = new ArmorItem(EMERALD_NETH_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item EMERALD_NETH_LEGGINGS = new ArmorItem(EMERALD_NETH_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item EMERALD_NETH_BOOTS = new ArmorItem(EMERALD_NETH_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));

    public static final Item ED_SCALE_HELMET = new ArmorItem(ENDERDRAGON_SCALED_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item ED_SCALE_CHESTPLATE = new ArmorItem(ENDERDRAGON_SCALED_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item ED_SCALE_LEGGINGS = new ArmorItem(ENDERDRAGON_SCALED_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item ED_SCALE_BOOTS = new ArmorItem(ENDERDRAGON_SCALED_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));

    public static final Item WS_HELMET = new ArmorItem(WARDEN_SCULK_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item WS_CHESTPLATE = new ArmorItem(WARDEN_SCULK_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item WS_LEGGINGS = new ArmorItem(WARDEN_SCULK_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item WS_BOOTS = new ArmorItem(WARDEN_SCULK_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));

    public static final Item WB_HELMET = new ArmorItem(WITHER_BONE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item WB_CHESTPLATE = new ArmorItem(WITHER_BONE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item WB_LEGGINGS = new ArmorItem(WITHER_BONE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item WB_BOOTS = new ArmorItem(WITHER_BONE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));

    public static final Item GH_HELMET = new ArmorItem(GAURDIAN_HIDE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item GH_CHESTPLATE = new ArmorItem(GAURDIAN_HIDE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item GH_LEGGINGS = new ArmorItem(GAURDIAN_HIDE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item GH_BOOTS = new ArmorItem(GAURDIAN_HIDE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));










    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_boots"), RUBY_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_boots"), EMERALD_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "rpn_helmet"), RUBY_NETH_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "rpn_chestplate"), RUBY_NETH_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "rpn_leggings"), RUBY_NETH_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "rpn_boots"), RUBY_NETH_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "epn_helmet"), EMERALD_NETH_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "epn_chestplate"), EMERALD_NETH_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "epn_leggings"), EMERALD_NETH_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "epn_boots"), EMERALD_NETH_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ws_helmet"), WS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"ws_chestplate"),WS_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"ws_leggings"),WS_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"ws_boots"),WS_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"wb_helmet"),WB_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"wb_chestplate"),WB_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"wb_leggings"),WB_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"wb_boots"),WB_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"eds_helmet"),ED_SCALE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"eds_chestplate"),ED_SCALE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"eds_leggings"),ED_SCALE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"eds_boots"),ED_SCALE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"gh_helmet"),GH_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"gh_chestplate"),GH_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"gh_leggings"),GH_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID,"gh_boots"),GH_BOOTS);

    }
}


