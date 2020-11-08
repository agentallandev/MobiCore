package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class GoldChainHelmet extends ArmorItem {
    public GoldChainHelmet() {
        super(ArmorMaterials.GOLD_CHAIN, EquipmentSlotType.HEAD, new Properties().group(MobiCore.GOLD_CHAIN));
    }
}
