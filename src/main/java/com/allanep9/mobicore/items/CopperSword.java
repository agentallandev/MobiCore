package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.SwordItem;

public class CopperSword extends SwordItem {
    public CopperSword() {
        super(ItemTiers.COPPER, 9, 4.0f, new Properties().group(MobiCore.COPPER));
    }
}