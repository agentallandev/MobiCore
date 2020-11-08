package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.ShovelItem;

public class TinShovel extends ShovelItem {
    public TinShovel() {
        super(ItemTiers.TIN, 7.5f, 3, new Properties().group(MobiCore.TIN));
    }
}
