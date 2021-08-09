package com.custom.test20210809.tick;

import com.custom.test20210809.BotRunner;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.custom.test20210809.RunBotRunnerKeyEvent.bot;

public class TickEvent {
    @SubscribeEvent
    public void onClientTick(net.minecraftforge.event.TickEvent.ClientTickEvent event) {
        boolean botShouldRun = BotRunner.shouldRun();
        KeyBinding.setKeyBindState(Minecraft.getInstance().gameSettings.keyBindings[2].getKey(), botShouldRun);
    }
}
