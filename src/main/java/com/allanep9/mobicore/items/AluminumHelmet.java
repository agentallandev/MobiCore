package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AluminumHelmet extends ArmorItem {
    public AluminumHelmet() {
        super(ArmorMaterials.ALUMINUM, EquipmentSlotType.HEAD, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
