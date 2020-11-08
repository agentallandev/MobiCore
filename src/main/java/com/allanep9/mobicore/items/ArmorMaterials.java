package com.allanep9.mobicore.items;

import java.util.function.Supplier;

import com.allanep9.mobicore.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

public enum ArmorMaterials implements IArmorMaterial {
    GOLD_CHAIN("mobicore:gold_chain", 30, new int[]{2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.5F, () -> {
        return Ingredient.fromItems(RegistryHandler.GOLD_CHAIN.get());
    }),
    OBSIDIAN("mobicore:obsidian", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.fromItems(Items.OBSIDIAN);
    }),
    ALUMINUM("mobicore:aluminum", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.ALUMINUM_INGOT.get());
    }),
    BRASS("mobicore:brass", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.BRASS_INGOT.get());
    }),
    BRONZE("mobicore:bronze", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.BRONZE_INGOT.get());
    }),
    COPPER("mobicore:copper", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_INGOT.get());
    }),
    INVAR("mobicore:invar", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.INVAR_INGOT.get());
    }),
    NICKEL("mobicore:nickel", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.NICKEL_INGOT.get());
    }),
    ROSEGOLD("mobicore:rose_gold", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.ROSE_GOLD_INGOT.get());
    }),
    STEEL("mobicore:steel", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_INGOT.get());
    }),
    TIN("mobicore:tin", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.TIN_INGOT.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    private ArmorMaterials(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

}