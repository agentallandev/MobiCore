package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class RoseGoldHelmet extends ArmorItem {
    public RoseGoldHelmet() {
        super(ArmorMaterials.ROSEGOLD, EquipmentSlotType.HEAD, new Properties().group(MobiCore.ROSEGOLD));
    }
}
