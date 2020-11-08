package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.SwordItem;

public class InvarSword extends SwordItem {
    public InvarSword() {
        super(ItemTiers.INVAR, 9, 4.0f, new Properties().group(MobiCore.INVAR));
    }
}