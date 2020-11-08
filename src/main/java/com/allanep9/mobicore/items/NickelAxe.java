package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class NickelAxe extends AxeItem {
    public NickelAxe() {
        super(ItemTiers.NICKEL, 11, 3, new Properties().group(MobiCore.NICKEL));
    }
}
