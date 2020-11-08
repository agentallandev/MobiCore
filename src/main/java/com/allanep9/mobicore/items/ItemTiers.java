package com.allanep9.mobicore.items;

import com.allanep9.mobicore.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ItemTiers implements IItemTier {
    OBSIDIAN(4,3000, 12.0F, 4.0F, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.OBSIDIAN_INGOT.get());
    }),
    ALUMINUM(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.ALUMINUM_INGOT.get());
    }),
    BRASS(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.BRASS_INGOT.get());
    }),
    BRONZE(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.BRONZE_INGOT.get());
    }),
    COPPER(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_INGOT.get());
    }),
    INVAR(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.INVAR_INGOT.get());
    }),
    NICKEL(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.NICKEL_INGOT.get());
    }),
    ROSEGOLD(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.ROSE_GOLD_INGOT.get());
    }),
    STEEL(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_INGOT.get());
    }),
    TIN(2,250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.TIN_INGOT.get());
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ItemTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}