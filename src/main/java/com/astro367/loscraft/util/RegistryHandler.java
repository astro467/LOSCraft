package com.astro367.loscraft.util;

import com.astro367.loscraft.LOSCraft;
import com.astro367.loscraft.blocks.*;
import com.astro367.loscraft.items.ItemBase;
import com.astro367.loscraft.util.enums.LOSCraftItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LOSCraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LOSCraft.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz", ItemBase::new);
    public static final RegistryObject<Item> ROSE_QUARTZ_SHARD = ITEMS.register("rose_quartz_shard", ItemBase::new);
    public static final RegistryObject<Item> CHORUSITE_INGOT = ITEMS.register("chorusite_ingot", ItemBase::new);
    public static final RegistryObject<Item> LIME_CHORUSITE_DUST = ITEMS.register("lime_chorusite_dust", ItemBase::new);
    public static final RegistryObject<Item> CYAN_CHORUSITE_DUST = ITEMS.register("cyan_chorusite_dust", ItemBase::new);
    public static final RegistryObject<Item> ROASTED_COFFEE_BEANS = ITEMS.register("roasted_coffee_beans", ItemBase::new);
    public static final RegistryObject<Item> RAW_COFFEE_BEANS = ITEMS.register("raw_coffee_beans", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> ROSE_QUARTZ_SWORD = ITEMS.register("rose_quartz_sword", () -> new SwordItem(LOSCraftItemTier.ROSE_QUARTZ, 6, -2.4f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<PickaxeItem> ROSE_QUARTZ_PICKAXE = ITEMS.register("rose_quartz_pickaxe", () -> new PickaxeItem(LOSCraftItemTier.ROSE_QUARTZ, 4, -2.8f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<ShovelItem> ROSE_QUARTZ_SHOVEL = ITEMS.register("rose_quartz_shovel", () -> new ShovelItem(LOSCraftItemTier.ROSE_QUARTZ, 4.5f, -3.0f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<AxeItem> ROSE_QUARTZ_AXE = ITEMS.register("rose_quartz_axe", () -> new AxeItem(LOSCraftItemTier.ROSE_QUARTZ, 8.0f, -2.9f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<HoeItem> ROSE_QUARTZ_HOE = ITEMS.register("rose_quartz_hoe", () -> new HoeItem(LOSCraftItemTier.ROSE_QUARTZ, 0, 0.0f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<SwordItem> CHORUSITE_SWORD = ITEMS.register("chorusite_sword", () -> new SwordItem(LOSCraftItemTier.CHORUSITE, 9, -2.4f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<PickaxeItem> CHORUSITE_PICKAXE = ITEMS.register("chorusite_pickaxe", () -> new PickaxeItem(LOSCraftItemTier.CHORUSITE, 7, -2.8f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<ShovelItem> CHORUSITE_SHOVEL = ITEMS.register("chorusite_shovel", () -> new ShovelItem(LOSCraftItemTier.CHORUSITE, 7.5f, -3.0f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<AxeItem> CHORUSITE_AXE = ITEMS.register("chorusite_axe", () -> new AxeItem(LOSCraftItemTier.CHORUSITE, 11, -2.9f, new Item.Properties().group(LOSCraft.TAB)));
    public static final RegistryObject<HoeItem> CHORUSITE_HOE = ITEMS.register("chorusite_hoe", () -> new HoeItem(LOSCraftItemTier.CHORUSITE, 1, -0.0f, new Item.Properties().group(LOSCraft.TAB)));


    //Blocks
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = BLOCKS.register("rose_quartz_block", RoseQuartzBlock::new);
    public static final RegistryObject<Block> CHORUSITE_BLOCK = BLOCKS.register("chorusite_block", ChorusiteBlock::new);
    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = BLOCKS.register("rose_quartz_ore", RoseQuartzOre::new);
    public static final RegistryObject<Block> CHORUSITE_ORE = BLOCKS.register("chorusite_ore", ChorusiteOre::new);
    public static final RegistryObject<Block> CHERRY_BLOSSOM_LOG = BLOCKS.register("cherry_blossom_log", CherryBlossomLog::new);
    public static final RegistryObject<Block> CHERRY_BLOSSOM_PLANKS = BLOCKS.register("cherry_blossom_planks", CherryBlossomPlanks::new);

    //Block items
    public static final RegistryObject<Item> ROSE_QUARTZ_BLOCK_ITEM = ITEMS.register("rose_quartz_block", () -> new BlockItemBase(ROSE_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> CHORUSITE_BLOCK_ITEM = ITEMS.register("chorusite_block", () -> new BlockItemBase(CHORUSITE_BLOCK.get()));
    public static final RegistryObject<Item> ROSE_QUARTZ_ORE_ITEM = ITEMS.register("rose_quartz_ore", () -> new BlockItemBase(ROSE_QUARTZ_ORE.get()));
    public static final RegistryObject<Item> CHORUSITE_ORE_ITEM = ITEMS.register("chorusite_ore", () -> new BlockItemBase(CHORUSITE_ORE.get()));
    public static final RegistryObject<Item> CHERRY_BLOSSOM_LOG_ITEM = ITEMS.register("cherry_blossom_log", () -> new BlockItemBase(CHERRY_BLOSSOM_LOG.get()));
    public static final RegistryObject<Item> CHERRY_BLOSSOM_PLANKS_ITEM = ITEMS.register("cherry_blossom_planks", () -> new BlockItemBase(CHERRY_BLOSSOM_PLANKS.get()));
}
