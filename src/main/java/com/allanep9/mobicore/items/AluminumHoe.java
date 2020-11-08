package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class AluminumHoe extends HoeItem {
    public AluminumHoe() {
        super(ItemTiers.ALUMINUM,  0f, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
