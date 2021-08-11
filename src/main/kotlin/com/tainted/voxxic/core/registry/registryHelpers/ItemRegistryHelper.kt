package com.tainted.voxxic.core.registry.registryHelpers

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

//TODO Improve Item Registry
class ItemRegistryHelper(private val path: String, itemSettings: FabricItemSettings) : Item(itemSettings) {

    private val item: Item = Item(itemSettings)
    fun RegisterItem(): ItemRegistryHelper {
        Registry.register(Registry.ITEM, Identifier("voxxic", this.path), this.item)
        return this;
    }
}