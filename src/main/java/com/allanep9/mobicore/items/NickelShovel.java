package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.ShovelItem;

public class NickelShovel extends ShovelItem {
    public NickelShovel() {
        super(ItemTiers.NICKEL, 7.5f, 3, new Properties().group(MobiCore.NICKEL));
    }
}
