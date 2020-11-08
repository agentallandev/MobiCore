package com.allanep9.mobicore.items;


import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class NickelLeggings extends ArmorItem {
    public NickelLeggings() {
        super(ArmorMaterials.NICKEL, EquipmentSlotType.LEGS, new Properties().group(MobiCore.NICKEL));
    }
}
