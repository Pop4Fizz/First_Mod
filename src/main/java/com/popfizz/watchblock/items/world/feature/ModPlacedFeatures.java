package com.popfizz.watchblock.items.world.feature;

import com.popfizz.watchblock.items.world.feature.ModConfiguredFeatures;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED = PlacedFeatures.register("deepslate_ruby_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_RUBY_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));


    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier hieghtModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), hieghtModifier);
    }
}


