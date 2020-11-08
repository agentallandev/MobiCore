package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.*;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ItemTiers.OBSIDIAN, 9, 4.0f, new Properties().group(MobiCore.OBSIDIAN));
    }
}