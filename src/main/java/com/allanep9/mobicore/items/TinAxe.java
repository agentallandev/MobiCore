package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class TinAxe extends AxeItem {
    public TinAxe() {
        super(ItemTiers.TIN, 11, 3, new Properties().group(MobiCore.TIN));
    }
}
