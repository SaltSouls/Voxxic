package com.tainted.voxxic.core.registry

import com.tainted.voxxic.core.registry.registryHelpers.ItemRegistryHelper
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.util.Rarity

//TODO Add Items
class VOXItems {
    val CHARCOAL_DUST: ItemRegistryHelper = ItemRegistryHelper("charcoal_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val COAL_DUST: ItemRegistryHelper = ItemRegistryHelper("coal_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val IRON_DUST: ItemRegistryHelper = ItemRegistryHelper("iron_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val COPPER_DUST: ItemRegistryHelper = ItemRegistryHelper("copper_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val GOLD_DUST: ItemRegistryHelper = ItemRegistryHelper("gold_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val LAPIS_DUST: ItemRegistryHelper = ItemRegistryHelper("lapis_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val AMETHYST_DUST: ItemRegistryHelper = ItemRegistryHelper("amethyst_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val DIAMOND_DUST: ItemRegistryHelper = ItemRegistryHelper("diamond_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val EMERALD_DUST: ItemRegistryHelper = ItemRegistryHelper("emerald_dust", FabricItemSettings().group(ItemGroup.MATERIALS)).RegisterItem()
    val ARCANE_DUST: ItemRegistryHelper = ItemRegistryHelper("arcane_dust", FabricItemSettings().rarity(Rarity.UNCOMMON).group(ItemGroup.MATERIALS)).RegisterItem()
}