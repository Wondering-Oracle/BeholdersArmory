package com.silicateseer.beholdersarmory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersArmory implements ModInitializer {
	
	public static final String MODID = "beholdersarmory";
	
	public static final ArmorItem PRISMARINE_HELMET = (ArmorItem) register((String)"prismarine_helmet", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
	public static final ArmorItem PRISMARINE_CHESTPLATE = (ArmorItem) register((String)"prismarine_chestplate", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem PRISMARINE_LEGGINGS = (ArmorItem) register((String)"prismarine_leggings", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem PRISMARINE_BOOTS = (ArmorItem) register((String)"prismarine_boots", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	}
	
	public static Block register(String name, Block block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
		BlockItem item = new BlockItem(block, new Item.Settings().group(tab));
		register(name, item);
		return block;
	}
	
	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
		return item;
	}
}
