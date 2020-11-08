package com.allanep9.mobicore.items;


import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class InvarLeggings extends ArmorItem {
    public InvarLeggings() {
        super(ArmorMaterials.INVAR, EquipmentSlotType.LEGS, new Properties().group(MobiCore.INVAR));
    }
}
