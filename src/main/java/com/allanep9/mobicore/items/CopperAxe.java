package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class CopperAxe extends AxeItem {
    public CopperAxe() {
        super(ItemTiers.COPPER, 11, 3, new Properties().group(MobiCore.COPPER));
    }
}
