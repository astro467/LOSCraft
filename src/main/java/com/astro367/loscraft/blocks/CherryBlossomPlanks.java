package com.astro367.loscraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CherryBlossomPlanks extends Block {

    public CherryBlossomPlanks() {
        super(AbstractBlock.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f, 10.0f)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
        );
    }
}
