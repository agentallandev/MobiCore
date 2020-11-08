package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class AluminumPickaxe extends PickaxeItem {
    public AluminumPickaxe() {
        super(ItemTiers.ALUMINUM, 8, 3.2f, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
