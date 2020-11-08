package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ItemTiers.OBSIDIAN, 8, 3.2f, new Item.Properties().group(MobiCore.OBSIDIAN));
    }
}
