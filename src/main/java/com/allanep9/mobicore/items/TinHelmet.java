package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class TinHelmet extends ArmorItem {
    public TinHelmet() {
        super(ArmorMaterials.TIN, EquipmentSlotType.HEAD, new Properties().group(MobiCore.TIN));
    }
}
