package com.bubbycolditz.aquaticsplus.registry;

import com.bubbycolditz.aquaticsplus.AquaticsPlus;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block CARBON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 30.0f)
            .sounds(BlockSoundGroup.METAL)
    );

    public static final Block CARBON_ORE = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0f, 15.0f)
            .sounds(BlockSoundGroup.METAL)
    );

    public static final Block SCOOBA_DIVING_LOOM = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(2.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 30.0f)
            .sounds(BlockSoundGroup.METAL)
    );

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(AquaticsPlus.MOD_ID, "carbon_block"), CARBON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AquaticsPlus.MOD_ID, "carbon_ore"), CARBON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AquaticsPlus.MOD_ID, "scooba_diving_loom"), SCOOBA_DIVING_LOOM);
        Registry.register(Registry.BLOCK, new Identifier(AquaticsPlus.MOD_ID, "steel_block"), STEEL_BLOCK);

    }
}