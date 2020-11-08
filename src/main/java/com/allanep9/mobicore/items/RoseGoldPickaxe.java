package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.PickaxeItem;

public class RoseGoldPickaxe extends PickaxeItem {
    public RoseGoldPickaxe() {
        super(ItemTiers.ROSEGOLD, 8, 3.2f, new Properties().group(MobiCore.ROSEGOLD));
    }
}
