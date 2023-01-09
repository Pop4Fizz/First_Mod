package com.popfizz.watchblock.registry;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.items.custom.EightBallItem;
import com.popfizz.watchblock.items.custom.ModItemGroup;
import com.popfizz.watchblock.items.custom.armor.CustomArmorMaterial;
import com.popfizz.watchblock.items.custom.tools.RubyToolMaterial;
import com.popfizz.watchblock.items.custom.tools.RubyToolMaterial.CustomHoeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.mixin.content.registry.HoeItemAccessor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import javax.tools.Tool;


public class ModItems {

    //Items
    public static final Item RUBY = new Item(new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.COMMON));
    public static final Item DENSE_RUBY = new Item(new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.UNCOMMON));
    public static ToolItem RUBY_SWORD = new SwordItem(RubyToolMaterial.INSTANCE, 7, -2.4F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final Item EIGHT_BALL = new EightBallItem(new FabricItemSettings().group(ModItemGroup.Danny_davito).maxCount(1).rarity(Rarity.EPIC));
   public static final ToolItem RUBY_PICKAXE = new PickaxeItem(RubyToolMaterial.INSTANCE, 5, -2.8F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final ToolItem RUBY_AXE = new AxeItem(RubyToolMaterial.INSTANCE, 8, -3.1F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final ToolItem RUBY_SHOVEL = new ShovelItem(RubyToolMaterial.INSTANCE, 4.5F, -3F,  new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final ToolItem RUBY_HOE = new CustomHoeItem(RubyToolMaterial.INSTANCE, 1, -0F, new Item.Settings().group(ModItemGroup.Danny_davito));




   //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(Modblocks.RUBY_BLOCK, new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.UNCOMMON));

    public static final BlockItem DEEPSLATE_RUBY_ORE = new BlockItem(Modblocks.DEEPSLATE_RUBY_ORE, new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.COMMON));


    //Armor Items

    

    //Weapon Items


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "eight_ball"), EIGHT_BALL);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "dense_ruby"), DENSE_RUBY);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_hoe"), RUBY_HOE);

    }
}