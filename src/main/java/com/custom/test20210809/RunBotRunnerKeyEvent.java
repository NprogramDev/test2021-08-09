package com.custom.test20210809;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class RunBotRunnerKeyEvent {
    public static KeyBinding bot = new KeyBinding("BOT", 24, "MOD");

    public static void register() {
        ClientRegistry.registerKeyBinding(bot);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (bot.isPressed()) {
            BotRunner.resetTimer();
        }
    }
}
