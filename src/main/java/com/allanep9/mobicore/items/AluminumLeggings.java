package com.allanep9.mobicore.items;


import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AluminumLeggings extends ArmorItem {
    public AluminumLeggings() {
        super(ArmorMaterials.ALUMINUM, EquipmentSlotType.LEGS, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
