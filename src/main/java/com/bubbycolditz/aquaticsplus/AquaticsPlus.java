package com.bubbycolditz.aquaticsplus;

import com.bubbycolditz.aquaticsplus.registry.ModBlocks;
import com.bubbycolditz.aquaticsplus.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AquaticsPlus implements ModInitializer {

    public static final String MOD_ID = "aquaplus";

    public static final ItemGroup AQUA_MATERIALS = FabricItemGroupBuilder.build(new Identifier("aquaplus", "materials"), () -> new ItemStack(ModItems.STEEL_INGOT));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
