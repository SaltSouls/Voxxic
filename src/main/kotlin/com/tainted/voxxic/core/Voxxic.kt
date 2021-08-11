package com.tainted.voxxic.core
import com.tainted.voxxic.core.registry.VOXBlocks
import com.tainted.voxxic.core.registry.VOXItems
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Voxxic: ModInitializer {
    private const val MOD_ID = "voxxic"
    override fun onInitialize() {

        // Initialize Mod Components:
        VOXItems()
        VOXBlocks()

        println("Voxxic has been initialized.");
    }
}