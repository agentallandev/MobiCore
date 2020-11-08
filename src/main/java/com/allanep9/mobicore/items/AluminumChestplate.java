package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AluminumChestplate extends ArmorItem {
    public AluminumChestplate() {
        super(ArmorMaterials.ALUMINUM, EquipmentSlotType.CHEST, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
