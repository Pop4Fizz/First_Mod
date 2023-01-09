package com.popfizz.watchblock.items.custom.armor;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.items.custom.ModItemGroup;
import com.popfizz.watchblock.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomMaterial {



    public static final ArmorMaterial Custom_ARMOR_METERIAL = new CustomArmorMaterial();
    public static final Item RUBY_HELMET = new ArmorItem(Custom_ARMOR_METERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(Custom_ARMOR_METERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_LEGGINGS = new ArmorItem(Custom_ARMOR_METERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final Item RUBY_BOOTS = new ArmorItem(Custom_ARMOR_METERIAL, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.Danny_davito));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_boots"), RUBY_BOOTS);

    }
}


