package com.tainted.voxxic.core
import com.tainted.voxxic.client.color.VOXBlockColors
import com.tainted.voxxic.client.render.VOXRenderLayer
import com.tainted.voxxic.core.registry.VOXBlocks
import com.tainted.voxxic.core.registry.VOXItems
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Voxxic: ModInitializer {
    const val MOD_ID = "voxxic"
    override fun onInitialize() {

        // Initialize Mod Components:
        VOXItems().register()
        VOXBlocks().register()
        VOXBlockColors().register()
        VOXRenderLayer().register()

        println("Voxxic has been initialized.")
    }
}