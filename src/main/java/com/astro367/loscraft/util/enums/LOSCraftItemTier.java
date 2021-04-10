package com.astro367.loscraft.util.enums;

import com.astro367.loscraft.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum LOSCraftItemTier implements IItemTier {

    ROSE_QUARTZ(3, 3000, 7.8f, 0, 30, () -> {
        return Ingredient.fromItems(RegistryHandler.ROSE_QUARTZ.get());
    }),

    CHORUSITE(5, 5000, 12.5f, 0, 35, () -> {
        return Ingredient.fromItems(RegistryHandler.CHORUSITE_INGOT.get());
    });

    private final int harvestlevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    LOSCraftItemTier(int harvestlevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestlevel = harvestlevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this. attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestlevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
