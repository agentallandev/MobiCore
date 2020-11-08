package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.ShovelItem;

public class RoseGoldShovel extends ShovelItem {
    public RoseGoldShovel() {
        super(ItemTiers.ROSEGOLD, 7.5f, 3, new Properties().group(MobiCore.ROSEGOLD));
    }
}
