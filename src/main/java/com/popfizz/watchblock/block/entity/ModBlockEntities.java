package com.popfizz.watchblock.block.entity;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.registry.Modblocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<PlatingStationBlockEntity> PLATING_STATION;

    public static void registerBlockEntities() {
        PLATING_STATION = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(WatchBlock.MOD_ID, "plating_station"),
                FabricBlockEntityTypeBuilder.create(PlatingStationBlockEntity::new,
                        Modblocks.PLATING_STATION).build(null));
    }
}
