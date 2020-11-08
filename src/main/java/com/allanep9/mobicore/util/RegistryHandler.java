package com.allanep9.mobicore.util;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.blocks.OreBlocks;
import com.allanep9.mobicore.items.*;
import com.allanep9.mobicore.blocks.BlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item>  ITEMS  = new DeferredRegister(ForgeRegistries.ITEMS , "mobicore");
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister(ForgeRegistries.BLOCKS, "mobicore");


    public static void init() {
        ITEMS .register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items
    public static final RegistryObject<Item> TOOLROD = ITEMS.register("tool_rod", ItemBaseMaterials::new);
    public static final RegistryObject<Item> TINKERING_HAMMER = ITEMS.register("tinkering_hammer", ItemBaseCombat::new);
    public static final RegistryObject<Item> ENERGY_BAR = ITEMS.register("energy_bar", EnergyBar::new);


    //Gold Chain
    public static final RegistryObject<Item> GOLD_CHAIN = ITEMS.register("gold_chain", GoldChain::new);
    public static final RegistryObject<Item> GOLD_CHAIN_HELMET = ITEMS.register("gold_chain_helmet", GoldChainHelmet::new);
    public static final RegistryObject<Item> GOLD_CHAIN_CHESTPLATE = ITEMS.register("gold_chain_chestplate", GoldChainChestplate::new);
    public static final RegistryObject<Item> GOLD_CHAIN_LEGGINGS = ITEMS.register("gold_chain_leggings", GoldChainLeggings::new);
    public static final RegistryObject<Item> GOLD_CHAIN_BOOTS = ITEMS.register("gold_chain_boots", GoldChainBoots::new);



    //Obsidian
    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", ObsidianAxe::new);
    public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", ObsidianHoe::new);
    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", ObsidianShovel::new);
    public static final RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", ObsidianSword::new);
    public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", ObsidianHelmet::new);
    public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", ObsidianChestplate::new);
    public static final RegistryObject<ArmorItem> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",ObsidianLeggings::new);
    public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", ObsidianBoots::new);
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", IngotItem::new);

    //Dusts
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", DustItem::new);
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", DustItem::new);
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", DustItem::new);
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", DustItem::new);
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", DustItem::new);
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", DustItem::new);
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", DustItem::new);
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust", DustItem::new);
    public static final RegistryObject<Item> ROSE_GOLD_DUST = ITEMS.register("rose_gold_dust", DustItem::new);
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", DustItem::new);
    public static final RegistryObject<Item> INVAR_DUST = ITEMS.register("invar_dust", DustItem::new);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", IngotItem::new);
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", IngotItem::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", IngotItem::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", IngotItem::new);
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", IngotItem::new);
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", IngotItem::new);
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", IngotItem::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", IngotItem::new);
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", IngotItem::new);

    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", OreBlocks::new);
    public static final RegistryObject<Item>  COPPER_OREI = ITEMS.register("copper_ore",()-> new BlockItemBase(COPPER_ORE.get(), MobiCore.ORES));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", OreBlocks::new);
    public static final RegistryObject<Item>  TIN_OREI = ITEMS.register("tin_ore",()-> new BlockItemBase(TIN_ORE.get(), MobiCore.ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", OreBlocks::new);
    public static final RegistryObject<Item>  ALUMINUM_OREI = ITEMS.register("aluminum_ore",()-> new BlockItemBase(ALUMINUM_ORE.get(), MobiCore.ORES));
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", OreBlocks::new);
    public static final RegistryObject<Item>  NICKEL_OREI = ITEMS.register("nickel_ore",()-> new BlockItemBase(NICKEL_ORE.get(), MobiCore.ORES));

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> BRASS_BLOCK = BLOCKS.register("brass_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_ore_block", OreBlocks::new);
    public static final RegistryObject<Block> INVAR_BLOCK = BLOCKS.register("invar_ore_block", OreBlocks::new);
    public static final RegistryObject<Item> STEEL_BLOCKI = ITEMS.register("steel_ore_block",()-> new BlockItemBase(STEEL_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> BRONZE_BLOCKI = ITEMS.register("bronze_ore_block",()-> new BlockItemBase(BRONZE_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> COPPER_BLOCKI = ITEMS.register("copper_ore_block",()-> new BlockItemBase(COPPER_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> TIN_BLOCKI = ITEMS.register("tin_ore_block",()-> new BlockItemBase(TIN_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> ALUMINUM_BLOCKI = ITEMS.register("aluminum_ore_block",()-> new BlockItemBase(ALUMINUM_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> BRASS_BLOCKI = ITEMS.register("brass_ore_block",()-> new BlockItemBase(BRASS_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> ROSE_GOLD_BLOCKI = ITEMS.register("rose_gold_ore_block",()-> new BlockItemBase(ROSE_GOLD_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> NICKEL_BLOCKI = ITEMS.register("nickel_ore_block",()-> new BlockItemBase(NICKEL_BLOCK.get(), MobiCore.BLOCKS));
    public static final RegistryObject<Item> INVAR_BLOCKI = ITEMS.register("invar_ore_block",()-> new BlockItemBase(INVAR_BLOCK.get(), MobiCore.BLOCKS));

    public static final RegistryObject<AxeItem> ALUMINUM_AXE = ITEMS.register("aluminum_axe", AluminumAxe::new);
    public static final RegistryObject<HoeItem> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", AluminumHoe::new);
    public static final RegistryObject<PickaxeItem> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", AluminumPickaxe::new);
    public static final RegistryObject<ShovelItem> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", AluminumShovel::new);
    public static final RegistryObject<SwordItem> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", AluminumSword::new);
    public static final RegistryObject<ArmorItem> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", AluminumHelmet::new);
    public static final RegistryObject<ArmorItem> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", AluminumChestplate::new);
    public static final RegistryObject<ArmorItem> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",AluminumLeggings::new);
    public static final RegistryObject<ArmorItem> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", AluminumBoots::new);

    public static final RegistryObject<AxeItem> BRASS_AXE = ITEMS.register("brass_axe", BrassAxe::new);
    public static final RegistryObject<HoeItem> BRASS_HOE = ITEMS.register("brass_hoe", BrassHoe::new);
    public static final RegistryObject<PickaxeItem> BRASS_PICKAXE = ITEMS.register("brass_pickaxe", BrassPickaxe::new);
    public static final RegistryObject<ShovelItem> BRASS_SHOVEL = ITEMS.register("brass_shovel", BrassShovel::new);
    public static final RegistryObject<SwordItem> BRASS_SWORD = ITEMS.register("brass_sword", BrassSword::new);
    public static final RegistryObject<ArmorItem> BRASS_HELMET = ITEMS.register("brass_helmet", BrassHelmet::new);
    public static final RegistryObject<ArmorItem> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate", BrassChestplate::new);
    public static final RegistryObject<ArmorItem> BRASS_LEGGINGS = ITEMS.register("brass_leggings", BrassLeggings::new);
    public static final RegistryObject<ArmorItem> BRASS_BOOTS = ITEMS.register("brass_boots", BrassBoots::new);

    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", BronzeAxe::new);
    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", BronzeHoe::new);
    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", BronzePickaxe::new);
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", BronzeShovel::new);
    public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", BronzeSword::new);
    public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", BronzeHelmet::new);
    public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", BronzeChestplate::new);
    public static final RegistryObject<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", BronzeLeggings::new);
    public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", BronzeBoots::new);

    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", CopperAxe::new);
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", CopperHoe::new);
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", CopperPickaxe::new);
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", CopperShovel::new);
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", CopperSword::new);
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", CopperHelmet::new);
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", CopperChestplate::new);
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", CopperLeggings::new);
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", CopperBoots::new);

    public static final RegistryObject<AxeItem> INVAR_AXE = ITEMS.register("invar_axe", InvarAxe::new);
    public static final RegistryObject<HoeItem> INVAR_HOE = ITEMS.register("invar_hoe", InvarHoe::new);
    public static final RegistryObject<PickaxeItem> INVAR_PICKAXE = ITEMS.register("invar_pickaxe", InvarPickaxe::new);
    public static final RegistryObject<ShovelItem> INVAR_SHOVEL = ITEMS.register("invar_shovel", InvarShovel::new);
    public static final RegistryObject<SwordItem> INVAR_SWORD = ITEMS.register("invar_sword", InvarSword::new);
    public static final RegistryObject<ArmorItem> INVAR_HELMET = ITEMS.register("invar_helmet", InvarHelmet::new);
    public static final RegistryObject<ArmorItem> INVAR_CHESTPLATE = ITEMS.register("invar_chestplate", InvarChestplate::new);
    public static final RegistryObject<ArmorItem> INVAR_LEGGINGS = ITEMS.register("invar_leggings", InvarLeggings::new);
    public static final RegistryObject<ArmorItem> INVAR_BOOTS = ITEMS.register("invar_boots", InvarBoots::new);

    public static final RegistryObject<AxeItem> NICKEL_AXE = ITEMS.register("nickel_axe", NickelAxe::new);
    public static final RegistryObject<HoeItem> NICKEL_HOE = ITEMS.register("nickel_hoe", NickelHoe::new);
    public static final RegistryObject<PickaxeItem> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe", NickelPickaxe::new);
    public static final RegistryObject<ShovelItem> NICKEL_SHOVEL = ITEMS.register("nickel_shovel", NickelShovel::new);
    public static final RegistryObject<SwordItem> NICKEL_SWORD = ITEMS.register("nickel_sword", NickelSword::new);
    public static final RegistryObject<ArmorItem> NICKEL_HELMET = ITEMS.register("nickel_helmet", NickelHelmet::new);
    public static final RegistryObject<ArmorItem> NICKEL_CHESTPLATE = ITEMS.register("nickel_chestplate", NickelChestplate::new);
    public static final RegistryObject<ArmorItem> NICKEL_LEGGINGS = ITEMS.register("nickel_leggings", NickelLeggings::new);
    public static final RegistryObject<ArmorItem> NICKEL_BOOTS = ITEMS.register("nickel_boots", NickelBoots::new);

    public static final RegistryObject<AxeItem> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe", RoseGoldAxe::new);
    public static final RegistryObject<HoeItem> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe", RoseGoldHoe::new);
    public static final RegistryObject<PickaxeItem> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe", RoseGoldPickaxe::new);
    public static final RegistryObject<ShovelItem> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel", RoseGoldShovel::new);
    public static final RegistryObject<SwordItem> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword", RoseGoldSword::new);
    public static final RegistryObject<ArmorItem> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet", RoseGoldHelmet::new);
    public static final RegistryObject<ArmorItem> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate", RoseGoldChestplate::new);
    public static final RegistryObject<ArmorItem> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings", RoseGoldLeggings::new);
    public static final RegistryObject<ArmorItem> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots", RoseGoldBoots::new);

    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", SteelAxe::new);
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", SteelHoe::new);
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", SteelPickaxe::new);
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", SteelShovel::new);
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", SteelSword::new);
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", SteelHelmet::new);
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", SteelChestplate::new);
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", SteelLeggings::new);
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", SteelBoots::new);

    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", TinAxe::new);
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", TinHoe::new);
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", TinPickaxe::new);
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", TinShovel::new);
    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", TinSword::new);
    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet", TinHelmet::new);
    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", TinChestplate::new);
    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings", TinLeggings::new);
    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots", TinBoots::new);

    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", ClothItem::new);
}
