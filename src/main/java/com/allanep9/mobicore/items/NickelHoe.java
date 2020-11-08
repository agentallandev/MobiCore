package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.HoeItem;

public class NickelHoe extends HoeItem {
    public NickelHoe() {
        super(ItemTiers.NICKEL,  0f, new Properties().group(MobiCore.NICKEL));
    }
}
