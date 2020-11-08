package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class CopperHoe extends HoeItem {
    public CopperHoe() {
        super(ItemTiers.COPPER,  0f, new Properties().group(MobiCore.COPPER));
    }
}
