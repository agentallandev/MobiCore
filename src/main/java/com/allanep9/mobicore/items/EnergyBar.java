package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class EnergyBar extends Item {
    public EnergyBar() {
        super(new Item.Properties().group(MobiCore.CORE).food(new Food.Builder().saturation(20).hunger(20).setAlwaysEdible().fastToEat().build()));
    }
}