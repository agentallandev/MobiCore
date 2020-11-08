package com.allanep9.mobicore.items;


import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class TinLeggings extends ArmorItem {
    public TinLeggings() {
        super(ArmorMaterials.TIN, EquipmentSlotType.LEGS, new Properties().group(MobiCore.TIN));
    }
}
