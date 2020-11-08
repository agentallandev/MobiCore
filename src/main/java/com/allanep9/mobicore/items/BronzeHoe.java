package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class BronzeHoe extends HoeItem {
    public BronzeHoe() {
        super(ItemTiers.BRONZE,  0f, new Properties().group(MobiCore.BRONZE));
    }
}
