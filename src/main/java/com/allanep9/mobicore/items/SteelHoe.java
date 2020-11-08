package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class SteelHoe extends HoeItem {
    public SteelHoe() {
        super(ItemTiers.STEEL,  0f, new Properties().group(MobiCore.STEEL));
    }
}
