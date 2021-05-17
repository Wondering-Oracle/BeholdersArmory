package com.silicateseer.beholdersarmory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersArmory implements ModInitializer {
	
	public static final String MODID = "beholdersarmory";
	
	public static final ArmorItem PRISMARINE_HELMET = (ArmorItem) register((String)"prismarine_helmet", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
	public static final ArmorItem PRISMARINE_CHESTPLATE = (ArmorItem) register((String)"prismarine_chestplate", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem PRISMARINE_LEGGINGS = (ArmorItem) register((String)"prismarine_leggings", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem PRISMARINE_BOOTS = (ArmorItem) register((String)"prismarine_boots", (Item)(new ArmorItem(BAArmorMaterials.PRISMARINE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
	
    public static final ArmorItem QUARTZ_HELMET = (ArmorItem) register((String)"quartz_helmet", (Item)(new ArmorItem(BAArmorMaterials.QUARTZ, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
	public static final ArmorItem QUARTZ_CHESTPLATE = (ArmorItem) register((String)"quartz_chestplate", (Item)(new ArmorItem(BAArmorMaterials.QUARTZ, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem QUARTZ_LEGGINGS = (ArmorItem) register((String)"quartz_leggings", (Item)(new ArmorItem(BAArmorMaterials.QUARTZ, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem QUARTZ_BOOTS = (ArmorItem) register((String)"quartz_boots", (Item)(new ArmorItem(BAArmorMaterials.QUARTZ, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
	
    public static final SwordItem QUARTZ_SWORD = (SwordItem) register((String)"quartz_sword", (Item)(new SwordItem(BAToolMaterials.QUARTZ, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ShovelItem QUARTZ_SHOVEL = (ShovelItem) register((String)"quartz_shovel", (Item)(new ShovelItem(BAToolMaterials.QUARTZ, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
    public static final PickaxeItem QUARTZ_PICKAXE = (PickaxeItem) register((String)"quartz_pickaxe", (Item)(new BAPickaxeItem(BAToolMaterials.QUARTZ, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
    public static final AxeItem QUARTZ_AXE = (AxeItem) register((String)"quartz_axe", (Item)(new BAAxeItem(BAToolMaterials.QUARTZ, 6.0F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
    public static final HoeItem QUARTZ_HOE = (HoeItem) register((String)"quartz_hoe", (Item)(new BAHoeItem(BAToolMaterials.QUARTZ, 0, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
    
    public static final ArmorItem EMERALD_HELMET = (ArmorItem) register((String)"emerald_helmet", (Item)(new ArmorItem(BAArmorMaterials.EMERALD, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
	public static final ArmorItem EMERALD_CHESTPLATE = (ArmorItem) register((String)"emerald_chestplate", (Item)(new ArmorItem(BAArmorMaterials.EMERALD, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem EMERALD_LEGGINGS = (ArmorItem) register((String)"emerald_leggings", (Item)(new ArmorItem(BAArmorMaterials.EMERALD, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem EMERALD_BOOTS = (ArmorItem) register((String)"emerald_boots", (Item)(new ArmorItem(BAArmorMaterials.EMERALD, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
	
    public static final Item SILVER_INGOT = register("silver_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final ArmorItem SILVER_HELMET = (ArmorItem) register((String)"silver_helmet", (Item)(new ArmorItem(BAArmorMaterials.SILVER, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
	public static final ArmorItem SILVER_CHESTPLATE = (ArmorItem) register((String)"silver_chestplate", (Item)(new ArmorItem(BAArmorMaterials.SILVER, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem SILVER_LEGGINGS = (ArmorItem) register((String)"silver_leggings", (Item)(new ArmorItem(BAArmorMaterials.SILVER, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem SILVER_BOOTS = (ArmorItem) register((String)"silver_boots", (Item)(new ArmorItem(BAArmorMaterials.SILVER, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
	
    public static final Item STEEL_INGOT = register("steel_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final ArmorItem STEEL_HELMET = (ArmorItem) register((String)"steel_helmet", (Item)(new ArmorItem(BAArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
	public static final ArmorItem STEEL_CHESTPLATE = (ArmorItem) register((String)"steel_chestplate", (Item)(new ArmorItem(BAArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem STEEL_LEGGINGS = (ArmorItem) register((String)"steel_leggings", (Item)(new ArmorItem(BAArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
    public static final ArmorItem STEEL_BOOTS = (ArmorItem) register((String)"steel_boots", (Item)(new ArmorItem(BAArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
	
    public static final Item MITHRIL_INGOT = register("mithril_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ADAMANTINE_INGOT = register("adamantine_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    
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
