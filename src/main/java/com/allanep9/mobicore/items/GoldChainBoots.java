package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class GoldChainBoots extends ArmorItem {
    public GoldChainBoots() {
        super(ArmorMaterials.GOLD_CHAIN, EquipmentSlotType.FEET, new Properties().group(MobiCore.GOLD_CHAIN));
    }
}
