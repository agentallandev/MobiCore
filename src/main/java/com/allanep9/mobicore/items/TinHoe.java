package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class TinHoe extends HoeItem {
    public TinHoe() {
        super(ItemTiers.TIN,  0f, new Properties().group(MobiCore.TIN));
    }
}
