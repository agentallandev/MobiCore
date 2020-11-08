package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class SteelAxe extends AxeItem {
    public SteelAxe() {
        super(ItemTiers.STEEL, 11, 3, new Properties().group(MobiCore.STEEL));
    }
}
