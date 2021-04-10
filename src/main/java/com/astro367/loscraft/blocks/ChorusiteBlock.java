package com.astro367.loscraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ChorusiteBlock extends Block {
    public ChorusiteBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(45.0f, 5000.0f)
                .sound(SoundType.METAL)
                .harvestLevel(4)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)


        );

    }
}
