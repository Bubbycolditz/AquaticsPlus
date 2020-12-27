package com.bubbycolditz.aquaticsplus.registry;

import com.bubbycolditz.aquaticsplus.AquaticsPlus;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));
    public static final Item CARBON_CHUNK = new Item(new Item.Settings().group(AquaticsPlus.AQUA_MATERIALS));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(AquaticsPlus.MOD_ID, "carbon_chunk"), CARBON_CHUNK);

    }
}
