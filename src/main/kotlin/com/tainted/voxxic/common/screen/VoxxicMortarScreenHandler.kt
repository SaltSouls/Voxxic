package com.tainted.voxxic.common.screen

import com.tainted.voxxic.core.Voxxic
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot

class VoxxicMortarScreenHandler(syncId: Int, inventory: PlayerInventory) : ScreenHandler(Voxxic.MORTAR_SCREEN_TYPE, syncId) {

    val mortarSegment: Inventory = SimpleInventory(4);

    override fun canUse(player: PlayerEntity): Boolean {
        return mortarSegment.canPlayerUse(player);
    }

    init {
        var m: Int;
        var l: Int;
        // Recipe Output
        addSlot(object : Slot(mortarSegment, 3, 132, 38) {
            override fun canInsert(stack: ItemStack?): Boolean {
                return false
            }
        })

        // Recipe Inputs
        m = 0
        while (m < 3) {
            addSlot(Slot(mortarSegment,  m, 25 + m * 20, 38))
            m++
        }

        //Player inventory
        m = 0
        while (m < 3) {
            l = 0
            while (l < 9) {
                addSlot(Slot(inventory, l + m * 9 + 9, 8 + l * 18, 83 + m * 18))
                ++l
            }
            ++m
        }
        // Player Hotbar
        m = 0
        while (m < 9) {
            addSlot(Slot(inventory, m, 8 + m * 18, 141))
            ++m
        }
    }
}