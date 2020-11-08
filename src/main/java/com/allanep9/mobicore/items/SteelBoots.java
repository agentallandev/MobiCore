package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class SteelBoots extends ArmorItem {
    public SteelBoots() {
        super(ArmorMaterials.STEEL, EquipmentSlotType.FEET, new Properties().group(MobiCore.STEEL));
    }
}
