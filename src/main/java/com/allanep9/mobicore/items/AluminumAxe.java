package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class AluminumAxe extends AxeItem {
    public AluminumAxe() {
        super(ItemTiers.ALUMINUM, 11, 3, new Item.Properties().group(MobiCore.ALUMINUM));
    }
}
