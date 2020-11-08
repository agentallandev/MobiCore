package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.AxeItem;

public class BronzeAxe extends AxeItem {
    public BronzeAxe() {
        super(ItemTiers.BRONZE, 11, 3, new Properties().group(MobiCore.BRONZE));
    }
}
