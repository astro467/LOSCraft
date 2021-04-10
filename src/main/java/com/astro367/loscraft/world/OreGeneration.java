package com.astro367.loscraft.world;

import com.astro367.loscraft.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {



    public static void generateOres(final BiomeLoadingEvent event) {
        if(event.getCategory().equals(Biome.Category.JUNGLE)) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ROSE_QUARTZ_ORE.get().defaultBlockState(), 8)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(0, 0, 25))).squared().count(5));
        }

        if(event.getCategory().equals(Biome.Category.THEEND)) {

            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), RegistryHandler.CHORUSITE_ORE.get().defaultBlockState(), 3)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(0, 0, 256))).squared().count(50));
        }
    }
}
