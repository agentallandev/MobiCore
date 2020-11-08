package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class BrassHoe extends HoeItem {
    public BrassHoe() {
        super(ItemTiers.BRASS,  0f, new Properties().group(MobiCore.BRASS));
    }
}
