package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class NickelBoots extends ArmorItem {
    public NickelBoots() {
        super(ArmorMaterials.NICKEL, EquipmentSlotType.FEET, new Properties().group(MobiCore.NICKEL));
    }
}
