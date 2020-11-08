package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class SteelChestplate extends ArmorItem {
    public SteelChestplate() {
        super(ArmorMaterials.STEEL, EquipmentSlotType.CHEST, new Properties().group(MobiCore.STEEL));
    }
}
