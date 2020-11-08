package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ItemTiers;
import net.minecraft.item.PickaxeItem;

public class NickelPickaxe extends PickaxeItem {
    public NickelPickaxe() {
        super(ItemTiers.NICKEL, 8, 3.2f, new Properties().group(MobiCore.NICKEL));
    }
}
