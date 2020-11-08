package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class GoldChainChestplate extends ArmorItem {
    public GoldChainChestplate() {
        super(ArmorMaterials.GOLD_CHAIN, EquipmentSlotType.CHEST, new Properties().group(MobiCore.GOLD_CHAIN));
    }
}
