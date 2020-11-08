package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class ObsidianShovel extends ShovelItem {
    public ObsidianShovel() {
        super(ItemTiers.OBSIDIAN, 7.5f, 3, new Item.Properties().group(MobiCore.OBSIDIAN));
    }
}
