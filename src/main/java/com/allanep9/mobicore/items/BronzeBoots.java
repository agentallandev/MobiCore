package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class BronzeBoots extends ArmorItem {
    public BronzeBoots() {
        super(ArmorMaterials.BRONZE, EquipmentSlotType.FEET, new Properties().group(MobiCore.BRONZE));
    }
}
