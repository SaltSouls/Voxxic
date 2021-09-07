package com.tainted.voxxic.core.registry.registryHelpers

import com.tainted.voxxic.core.Voxxic.MOD_ID
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class BlockRegistryHelper() {
    private val modId = MOD_ID
    fun registerBlock(id: String, block: Block, itemSettings: FabricItemSettings? = null): Block {
        Registry.register(Registry.BLOCK, Identifier(modId, id), block)
        when {itemSettings != null -> Registry.register(Registry.ITEM, Identifier(modId, id), BlockItem(block, itemSettings))}
        return block;
    }
    fun registerBlock(id: String, blockSettings: FabricBlockSettings, itemSettings: FabricItemSettings? = null): Block {
        val block = Block(blockSettings)
        Registry.register(Registry.BLOCK, Identifier(modId, id), block)
        when {itemSettings != null -> Registry.register(Registry.ITEM, Identifier(modId, id), BlockItem(block, itemSettings))}
        return block;
    }
}