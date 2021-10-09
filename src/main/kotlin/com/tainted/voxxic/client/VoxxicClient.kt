package com.tainted.voxxic.client

import com.tainted.voxxic.client.gui.screen.MortarScreen;
import com.tainted.voxxic.core.Voxxic
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry

object VoxxicClient : ClientModInitializer{
    override fun onInitializeClient() {
        ScreenRegistry.register(Voxxic.MORTAR_SCREEN_TYPE, ::MortarScreen);
        println("Voxxic client initialized");
    }
}