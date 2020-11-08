package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class ObsidianChestplate extends ArmorItem {
    public ObsidianChestplate() {
        super(ArmorMaterials.OBSIDIAN, EquipmentSlotType.CHEST, new Item.Properties().group(MobiCore.OBSIDIAN));
    }
}
