package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.PickaxeItem;

public class CopperPickaxe extends PickaxeItem {
    public CopperPickaxe() {
        super(ItemTiers.COPPER, 8, 3.2f, new Properties().group(MobiCore.COPPER));
    }
}
