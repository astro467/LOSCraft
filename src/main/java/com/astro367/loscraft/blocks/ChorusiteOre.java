package com.astro367.loscraft.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class ChorusiteOre extends OreBlock {

    public ChorusiteOre() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(10, 100)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktuch) {
        return (int) (Math.random()* 45);
    }
}
