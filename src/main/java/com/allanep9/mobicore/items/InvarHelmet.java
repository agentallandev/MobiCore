package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class InvarHelmet extends ArmorItem {
    public InvarHelmet() {
        super(ArmorMaterials.INVAR, EquipmentSlotType.HEAD, new Properties().group(MobiCore.INVAR));
    }
}
