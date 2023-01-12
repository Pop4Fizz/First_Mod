package com.popfizz.watchblock.registry;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.items.custom.EightBallItem;
import com.popfizz.watchblock.items.custom.ModItemGroup;
import com.popfizz.watchblock.items.custom.tools.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {

    //Ruby Items
    public static final Item RUBY = new Item(
            new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.COMMON));
    public static final Item DENSE_RUBY = new Item(
            new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.UNCOMMON));
    public static ToolItem RUBY_SWORD = new SwordItem(
            ModToolMaterial.RUBY, 7, -2.4F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final Item EIGHT_BALL = new EightBallItem(
           new FabricItemSettings().group(ModItemGroup.Danny_davito).maxCount(1).rarity(Rarity.EPIC));
   public static final ToolItem RUBY_PICKAXE = new PickaxeItem(
           ModToolMaterial.RUBY, 5, -2.8F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final ToolItem RUBY_AXE = new AxeItem(
           ModToolMaterial.RUBY, 9, -3.1F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final ToolItem RUBY_SHOVEL = new ShovelItem(
           ModToolMaterial.RUBY, 5.5F, -3F,  new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final ToolItem RUBY_HOE = new ModToolMaterial.CustomHoeItem(
           ModToolMaterial.RUBY, 1, -0F, new Item.Settings().group(ModItemGroup.Danny_davito));
   public static final Item RUBY_PLATING = new Item(
           new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.RARE));

   //Emerald Items

    public static final ToolItem EMERALD_SWORD = new SwordItem(
            ModToolMaterial.EMERALD, 7, -2.4F, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final ToolItem EMERALD_PICKAXE = new PickaxeItem(
            ModToolMaterial.EMERALD, 5, -2.8F, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final ToolItem EMERALD_AXE = new AxeItem(
            ModToolMaterial.EMERALD, 9, -3.1F, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final ToolItem EMERALD_SHOVEL = new ShovelItem(
            ModToolMaterial.EMERALD, 5.5F, -3F, new Item.Settings().group(ModItemGroup.Danny_davito));
    public static final ToolItem EMERALD_HOE = new ModToolMaterial.CustomHoeItem(
            ModToolMaterial.EMERALD, 1, -0F, new Item.Settings().group(ModItemGroup.Danny_davito));


   //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(
            Modblocks.RUBY_BLOCK, new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.UNCOMMON));

    public static final BlockItem DEEPSLATE_RUBY_ORE = new BlockItem(
            Modblocks.DEEPSLATE_RUBY_ORE, new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.COMMON));

    public static final BlockItem PLATING_STATION = new BlockItem(
            Modblocks.PLATING_STATION, new FabricItemSettings().group(ModItemGroup.Danny_davito).rarity(Rarity.UNCOMMON).maxCount(1));








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
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_shovel"), EMERALD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "emerald_hoe"), EMERALD_HOE);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "plating_station"), PLATING_STATION);
        Registry.register(Registry.ITEM, new Identifier(WatchBlock.MOD_ID, "ruby_plating"), RUBY_PLATING);
    }
}