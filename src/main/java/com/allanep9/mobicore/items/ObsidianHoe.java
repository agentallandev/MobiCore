package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class ObsidianHoe extends HoeItem {
    public ObsidianHoe() {
        super(ItemTiers.OBSIDIAN,  0f, new Item.Properties().group(MobiCore.OBSIDIAN));
    }
}
