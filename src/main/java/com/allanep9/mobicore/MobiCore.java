package com.allanep9.mobicore;

import com.allanep9.mobicore.util.RegistryHandler;
import com.allanep9.mobicore.world.gen.CustomOreGen;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mobicore")
@Mod.EventBusSubscriber(modid = "mobicore", bus = Mod.EventBusSubscriber.Bus.MOD)

public class MobiCore
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MobiCore() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();



        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("mobicore", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }


    public static final ItemGroup CORE = new ItemGroup("mobicore") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.TINKERING_HAMMER.get());
        }
    };

    public static final ItemGroup DUSTS = new ItemGroup("dusts") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.IRON_DUST.get());
        }
    };

    public static final ItemGroup ORES = new ItemGroup("ores") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.COPPER_ORE.get());
        }
    };

    public static final ItemGroup INGOTS = new ItemGroup("ingots") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.STEEL_INGOT.get());
        }
    };

    public static final ItemGroup BLOCKS = new ItemGroup("blocks") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.STEEL_BLOCK.get());
        }
    };

    public static final ItemGroup OBSIDIAN = new ItemGroup("obsidian") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() { return new ItemStack(RegistryHandler.OBSIDIAN_HELMET.get()); }
    };

    public static final ItemGroup GOLD_CHAIN = new ItemGroup("gold_chain") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.GOLD_CHAIN_HELMET.get());
        }
    };

    public static final ItemGroup ALUMINUM = new ItemGroup("aluminum") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ALUMINUM_HELMET.get());
        }
    };

    public static final ItemGroup COPPER = new ItemGroup("copper") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.COPPER_HELMET.get());
        }
    };

    public static final ItemGroup BRASS = new ItemGroup("brass") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BRASS_HELMET.get());
        }
    };

    public static final ItemGroup BRONZE = new ItemGroup("bronze") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BRONZE_HELMET.get());
        }
    };

    public static final ItemGroup INVAR = new ItemGroup("invar") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.INVAR_HELMET.get());
        }
    };

    public static final ItemGroup NICKEL = new ItemGroup("nickel") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.NICKEL_HELMET.get());
        }
    };

    public static final ItemGroup ROSEGOLD = new ItemGroup("rose_gold") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ROSE_GOLD_HELMET.get());
        }
    };

    public static final ItemGroup STEEL = new ItemGroup("steel") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.STEEL_HELMET.get());
        }
    };

    public static final ItemGroup TIN = new ItemGroup("tin") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.TIN_HELMET.get());
        }
    };


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
