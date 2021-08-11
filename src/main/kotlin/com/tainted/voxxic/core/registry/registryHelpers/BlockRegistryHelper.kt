package com.tainted.voxxic.core.registry.registryHelpers

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

//TODO Improve Block Registry
class BlockRegistryHelper(private val path: String, blockSettings: FabricBlockSettings, private val itemSettings: FabricItemSettings? = null) : Block(blockSettings) {

    private val block: Block = Block(blockSettings)
    fun RegisterBlock(): BlockRegistryHelper {
        Registry.register(Registry.BLOCK, Identifier("voxxic", this.path), this.block)
        when {
            itemSettings != null -> Registry.register(Registry.ITEM, Identifier("voxxic", this.path), BlockItem(this.block, itemSettings))
        }
        return this;
    }
}