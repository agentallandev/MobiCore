package com.allanep9.mobicore.world.gen;

import com.allanep9.mobicore.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = "mobicore", bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomOreGen {
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //Nether Generation
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                genOre(biome, 12, 5, 5, 80, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ALUMINUM_ORE.get().getDefaultState(), 4);
                genOre(biome, 12, 5, 5, 80, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.COPPER_ORE.get().getDefaultState(), 4);
                genOre(biome, 12, 5, 5, 80, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.NICKEL_ORE.get().getDefaultState(), 4);
                genOre(biome, 12, 5, 5, 80, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.TIN_ORE.get().getDefaultState(), 4);

            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}