package com.tainted.voxxic.core
import com.tainted.voxxic.common.screen.VoxxicMortarScreenHandler;
import com.tainted.voxxic.client.color.VOXBlockColors
import com.tainted.voxxic.client.render.VOXRenderLayer
import com.tainted.voxxic.core.registry.VOXBlocks
import com.tainted.voxxic.core.registry.VOXItems
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry
import net.minecraft.screen.ScreenHandlerType

@Suppress("UNUSED")
object Voxxic: ModInitializer {
    const val MOD_ID = "voxxic"
    var MORTAR_SCREEN_TYPE: ScreenHandlerType<VoxxicMortarScreenHandler>? = null;
    override fun onInitialize() {
        // Initialize Mod Components:
        MORTAR_SCREEN_TYPE = ScreenHandlerRegistry.registerSimple(Identifier(MOD_ID, "voxxic_mortar"), ::VoxxicMortarScreenHandler);
        VOXItems().register()
        VOXBlocks().register()
        VOXBlockColors().register()
        VOXRenderLayer().register()

        println("Voxxic has been initialized.")
    }
}