package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class ObsidianHelmet extends ArmorItem {
    public ObsidianHelmet() {
        super(ArmorMaterials.OBSIDIAN, EquipmentSlotType.HEAD, new Item.Properties().group(MobiCore.OBSIDIAN));
    }
}
