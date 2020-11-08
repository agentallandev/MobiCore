package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class BrassAxe extends AxeItem {
    public BrassAxe() {
        super(ItemTiers.BRASS, 11, 3, new Properties().group(MobiCore.BRASS));
    }
}
