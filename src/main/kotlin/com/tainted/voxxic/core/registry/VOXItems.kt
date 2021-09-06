package com.tainted.voxxic.core.registry

import com.tainted.voxxic.common.items.ArcaneDust
import com.tainted.voxxic.core.registry.registryHelpers.ItemRegistryHelper
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.util.Rarity

//TODO Add Items
class VOXItems {
    val HELPER = ItemRegistryHelper()
    val CHARCOAL_DUST = HELPER.registerItem("charcoal_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val COAL_DUST = HELPER.registerItem("coal_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val IRON_DUST = HELPER.registerItem("iron_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val COPPER_DUST = HELPER.registerItem("copper_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val GOLD_DUST = HELPER.registerItem("gold_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val LAPIS_DUST = HELPER.registerItem("lapis_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val AMETHYST_DUST = HELPER.registerItem("amethyst_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val DIAMOND_DUST = HELPER.registerItem("diamond_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val EMERALD_DUST = HELPER.registerItem("emerald_dust", FabricItemSettings().group(ItemGroup.MATERIALS))
    val ARCANE_DUST = HELPER.registerItem("arcane_dust", ArcaneDust(FabricItemSettings().rarity(Rarity.UNCOMMON).group(ItemGroup.MATERIALS)))
}