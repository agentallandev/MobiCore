package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class SteelHelmet extends ArmorItem {
    public SteelHelmet() {
        super(ArmorMaterials.STEEL, EquipmentSlotType.HEAD, new Properties().group(MobiCore.STEEL));
    }
}
