package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class RoseGoldHoe extends HoeItem {
    public RoseGoldHoe() {
        super(ItemTiers.ROSEGOLD,  0f, new Properties().group(MobiCore.ROSEGOLD));
    }
}
