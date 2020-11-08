package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class InvarHoe extends HoeItem {
    public InvarHoe() {
        super(ItemTiers.INVAR,  0f, new Properties().group(MobiCore.INVAR));
    }
}
