package com.bubbycolditz.aquaticsplus;

import com.bubbycolditz.aquaticsplus.registry.ModBlocks;
import com.bubbycolditz.aquaticsplus.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class AquaticsPlus implements ModInitializer {

    public static final String MOD_ID = "aquaplus";

    public static final ItemGroup AQUA_MATERIALS = FabricItemGroupBuilder.build(new Identifier("aquaplus", "materials"), () -> new ItemStack(ModItems.STEEL_INGOT));

    private static final ConfiguredFeature<?, ?> ORE_CARBON_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.CARBON_ORE.getDefaultState(),
                    3)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(2); // number of veins per chunk

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        RegistryKey<ConfiguredFeature<?, ?>> oreCarbonOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("aquaplus", "ore_carbon_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarbonOverworld.getValue(), ORE_CARBON_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarbonOverworld);
    }
}