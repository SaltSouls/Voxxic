package com.tainted.voxxic.core.registry

import com.tainted.voxxic.core.registry.registryHelpers.BlockRegistryHelper
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Material
import net.minecraft.item.ItemGroup
import net.minecraft.sound.BlockSoundGroup

//TODO Add Blocks
class VOXBlocks {
    val MORTAR_AND_PESTLE: BlockRegistryHelper = BlockRegistryHelper("mortar_and_pestle", FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f, 2.5f), FabricItemSettings().group(ItemGroup.DECORATIONS)).RegisterBlock()
}