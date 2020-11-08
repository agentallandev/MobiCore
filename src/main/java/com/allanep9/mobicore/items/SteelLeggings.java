package com.allanep9.mobicore.items;


import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class SteelLeggings extends ArmorItem {
    public SteelLeggings() {
        super(ArmorMaterials.STEEL, EquipmentSlotType.LEGS, new Properties().group(MobiCore.STEEL));
    }
}
