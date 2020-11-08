package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class BronzeChestplate extends ArmorItem {
    public BronzeChestplate() {
        super(ArmorMaterials.BRONZE, EquipmentSlotType.CHEST, new Properties().group(MobiCore.BRONZE));
    }
}
