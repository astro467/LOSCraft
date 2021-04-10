package com.astro367.loscraft;

import com.astro367.loscraft.util.RegistryHandler;
import com.astro367.loscraft.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("los")
public class LOSCraft {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "los";

    public LOSCraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS .addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("LOSCraftTab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.CHORUSITE_INGOT.get());
        }
    };

    public static final ItemGroup BLOCKTAB = new ItemGroup("LOSCraftBlocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.CHORUSITE_ORE.get());
        }
    };
}
