package com.tainted.voxxic.core.registry

import com.tainted.voxxic.common.block.BrewingPotBlock
import com.tainted.voxxic.common.block.BurnerBlock
import com.tainted.voxxic.common.block.MortarAndPestleBlock
import com.tainted.voxxic.core.registry.registryHelpers.BlockRegistryHelper
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.BlockState
import net.minecraft.block.MapColor
import net.minecraft.block.Material
import net.minecraft.item.ItemGroup
import net.minecraft.state.property.Properties
import java.util.function.ToIntFunction

//TODO Add Blocks
class VOXBlocks {

    private fun createLightLevelFromBlockState(lightLevel: Int): ToIntFunction<BlockState> {
        return ToIntFunction { blockState: BlockState -> if (blockState.get(Properties.LIT) as Boolean) lightLevel else 0 }
    }

    val HELPER = BlockRegistryHelper()
    val MORTAR_AND_PESTLE = HELPER.registerBlock("mortar_and_pestle", MortarAndPestleBlock(FabricBlockSettings.of(Material.STONE, MapColor.DIRT_BROWN).strength(0.5F)), FabricItemSettings().group(ItemGroup.DECORATIONS))
    val BREWING_POT = HELPER.registerBlock("brewing_pot", BrewingPotBlock(FabricBlockSettings.of(Material.METAL, MapColor.STONE_GRAY).strength(1.5F).nonOpaque()), FabricItemSettings().group(ItemGroup.DECORATIONS))
    val BURNER = HELPER.registerBlock("burner", BurnerBlock(FabricBlockSettings.of(Material.STONE, MapColor.RED).requiresTool().strength(3.5F).luminance(createLightLevelFromBlockState(13))), FabricItemSettings().group(ItemGroup.DECORATIONS))

}