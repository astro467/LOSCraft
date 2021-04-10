package com.astro367.loscraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class RoseQuartzOre extends OreBlock {
    public RoseQuartzOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4, 20)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktoch) {
        return (int) (Math.random() * 15);
    }
}
