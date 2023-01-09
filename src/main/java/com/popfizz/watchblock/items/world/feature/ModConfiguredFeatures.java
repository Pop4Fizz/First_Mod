package com.popfizz.watchblock.items.world.feature;

import com.popfizz.watchblock.WatchBlock;
import com.popfizz.watchblock.registry.Modblocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_RUBY_ORES = List.of(
        OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, Modblocks.DEEPSLATE_RUBY_ORE.getDefaultState())
);

public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_RUBY_ORE =
        ConfiguredFeatures.register("deepslate_ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DEEPSLATE_RUBY_ORES, 14, 0.40f));

    public static void registerConfiguredFeatures() {
        WatchBlock.LOGGER.debug("Registering the ModConfiguredFeatures for " + WatchBlock.MOD_ID);
    }
}
