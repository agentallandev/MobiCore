package com.allanep9.mobicore.items;


import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class CopperLeggings extends ArmorItem {
    public CopperLeggings() {
        super(ArmorMaterials.COPPER, EquipmentSlotType.LEGS, new Properties().group(MobiCore.COPPER));
    }
}
