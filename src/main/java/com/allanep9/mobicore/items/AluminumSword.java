package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.*;

public class AluminumSword extends SwordItem {
    public AluminumSword() {
        super(ItemTiers.ALUMINUM, 9, 4.0f, new Properties().group(MobiCore.ALUMINUM));
    }
}