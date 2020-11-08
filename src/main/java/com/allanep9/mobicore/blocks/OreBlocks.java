package com.allanep9.mobicore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBlocks extends Block {
    public OreBlocks() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F));
    }
}