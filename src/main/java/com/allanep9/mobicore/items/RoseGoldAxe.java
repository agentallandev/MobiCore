package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class RoseGoldAxe extends AxeItem {
    public RoseGoldAxe() {
        super(ItemTiers.ROSEGOLD, 11, 3, new Properties().group(MobiCore.ROSEGOLD));
    }
}
