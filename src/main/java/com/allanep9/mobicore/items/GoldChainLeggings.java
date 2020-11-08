package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class GoldChainLeggings extends ArmorItem {
    public GoldChainLeggings() {
        super(ArmorMaterials.GOLD_CHAIN, EquipmentSlotType.LEGS, new Properties().group(MobiCore.GOLD_CHAIN));
    }
}
