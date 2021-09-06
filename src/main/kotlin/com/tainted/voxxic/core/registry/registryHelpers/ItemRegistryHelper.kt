package com.tainted.voxxic.core.registry.registryHelpers

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ItemRegistryHelper() {

    fun <T : Item> registerItem(id: String, item: T): T {Registry.register(Registry.ITEM, Identifier("voxxic", id), item);
        return item
    }
    fun registerItem(id: String, itemSettings: FabricItemSettings): Item {val item = Item(itemSettings)
        Registry.register(Registry.ITEM, Identifier("voxxic", id), item)
        return item
    }
}