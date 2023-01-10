package com.popfizz.watchblock.registry;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.block.PlatingStationBlock;
import com.popfizz.watchblock.items.custom.ModItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Modblocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MapColor.RED)
            .requiresTool()
            .strength(5.0f, 6.0f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block DEEPSLATE_RUBY_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MapColor.BLACK)
            .requiresTool()
            .strength(4.0f, 6.0f)
            .sounds(BlockSoundGroup.DEEPSLATE));

public static final Block PLATING_STATION = registerBlock("plating_station",
        new PlatingStationBlock(FabricBlockSettings
                .of(Material.STONE, MapColor.GRAY)
                .strength(4f).requiresTool()
                .nonOpaque()));

private static Block registerBlock(String name, Block block) {
    return Registry.register(Registry.BLOCK, new Identifier(WatchBlock.MOD_ID, name), block);
}

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(WatchBlock.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(WatchBlock.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
    }

}
