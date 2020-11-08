package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class RoseGoldChestplate extends ArmorItem {
    public RoseGoldChestplate() {
        super(ArmorMaterials.ROSEGOLD, EquipmentSlotType.CHEST, new Properties().group(MobiCore.ROSEGOLD));
    }
}
