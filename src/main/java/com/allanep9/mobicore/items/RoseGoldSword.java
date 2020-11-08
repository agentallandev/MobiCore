package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.SwordItem;

public class RoseGoldSword extends SwordItem {
    public RoseGoldSword() {
        super(ItemTiers.ROSEGOLD, 9, 4.0f, new Properties().group(MobiCore.ROSEGOLD));
    }
}