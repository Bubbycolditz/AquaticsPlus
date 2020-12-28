package com.bubbycolditz.aquaticsplus.registry;

import com.bubbycolditz.aquaticsplus.AquaticsPlus;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));
    public static final Item CARBON_CHUNK = new Item(new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));

    // Blocks
    public static final BlockItem CARBON_BLOCK = new BlockItem(ModBlocks.CARBON_BLOCK, new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));
    public static final BlockItem CARBON_ORE = new BlockItem(ModBlocks.CARBON_ORE, new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));
    public static final BlockItem STEEL_BLOCK = new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));

    public static void registerItems() {

        // Items
        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "carbon_chunk"), CARBON_CHUNK);

        // Blocks
        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "carbon_block"), CARBON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "carbon_ore"), CARBON_ORE);
        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "steel_block"), STEEL_BLOCK);

    }
}
