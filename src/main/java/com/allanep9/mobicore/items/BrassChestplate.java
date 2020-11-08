package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class BrassChestplate extends ArmorItem {
    public BrassChestplate() {
        super(ArmorMaterials.BRASS, EquipmentSlotType.CHEST, new Properties().group(MobiCore.BRASS));
    }
}
