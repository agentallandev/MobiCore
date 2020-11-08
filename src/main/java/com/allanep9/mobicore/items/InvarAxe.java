package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class InvarAxe extends AxeItem {
    public InvarAxe() {
        super(ItemTiers.INVAR, 11, 3, new Properties().group(MobiCore.INVAR));
    }
}
