package com.tainted.voxxic.core.registry.registryHelpers

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class BlockRegistryHelper(){

    fun <T : Block> registerBlock(id: String, block: T, itemSettings: FabricItemSettings? = null): T {Registry.register(Registry.BLOCK, Identifier("voxxic", id), block);
        when {itemSettings != null -> Registry.register(Registry.ITEM, Identifier("voxxic", id), BlockItem(block, itemSettings));}
        return block;
    }
    fun registerBlock(id: String, blockSettings: FabricBlockSettings, itemSettings: FabricItemSettings? = null): Block {val block = Block(blockSettings)
        Registry.register(Registry.BLOCK, Identifier("voxxic", id), block);
        when {itemSettings != null -> Registry.register(Registry.ITEM, Identifier("voxxic", id), BlockItem(block, itemSettings));}
        return block;
    }
}