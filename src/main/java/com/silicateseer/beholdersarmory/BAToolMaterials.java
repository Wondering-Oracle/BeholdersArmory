package com.silicateseer.beholdersarmory;

import java.util.function.Supplier;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum BAToolMaterials implements ToolMaterial {
	QUARTZ(2, 150, 6.0F, 2.0F, 16, () -> {
		return Ingredient.ofItems(Items.QUARTZ);
	}),
	EMERALD(3, 1000, 8.0F, 3.0F, 18, () -> {
		return Ingredient.ofItems(Items.EMERALD);
	}),
	SILVER(2, 100, 10.0F, 1.0F, 18, () -> {
		return Ingredient.ofItems(BeholdersArmory.SILVER_INGOT);
	}),
	STEEL(2, 750, 6.0F, 3.0F, 14, () -> {
		return Ingredient.ofItems(BeholdersArmory.STEEL_INGOT);
	});

		private final int miningLevel;
		private final int itemDurability;
		private final float miningSpeed;
		private final float attackDamage;
		private final int enchantability;
		private final Lazy<Ingredient> repairIngredient;
		
		private BAToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
			this.miningLevel = miningLevel;
			this.itemDurability = itemDurability;
			this.miningSpeed = miningSpeed;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
		}

		public int getDurability() {
			return this.itemDurability;
		}

		public float getMiningSpeedMultiplier() {
			return this.miningSpeed;
		}

		public float getAttackDamage() {
			return this.attackDamage;
		}

		public int getMiningLevel() {
			return this.miningLevel;
		}

		public int getEnchantability() {
			return this.enchantability;
		}

		public Ingredient getRepairIngredient() {
			return (Ingredient)this.repairIngredient.get();
		}
}