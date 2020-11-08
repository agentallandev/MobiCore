package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class BrassBoots extends ArmorItem {
    public BrassBoots() {
        super(ArmorMaterials.BRASS, EquipmentSlotType.FEET, new Properties().group(MobiCore.BRASS));
    }
}
