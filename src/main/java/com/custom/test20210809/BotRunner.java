package com.custom.test20210809;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class BotRunner {
    public static long startTime = 0;
    private static final long RUNNINGTIME = 5000;
    public static void resetTimer(){
        startTime = System.currentTimeMillis();
    }

    public static boolean shouldRun() {
        if(startTime == 0){ return false;}
        else return System.currentTimeMillis() - startTime < RUNNINGTIME;
    }
}
