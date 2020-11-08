package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class TinChestplate extends ArmorItem {
    public TinChestplate() {
        super(ArmorMaterials.TIN, EquipmentSlotType.CHEST, new Properties().group(MobiCore.TIN));
    }
}
