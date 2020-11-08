package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AluminumBoots extends ArmorItem {
    public AluminumBoots() {
        super(ArmorMaterials.ALUMINUM, EquipmentSlotType.FEET, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
