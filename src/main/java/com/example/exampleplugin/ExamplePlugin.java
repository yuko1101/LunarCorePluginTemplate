package com.example.exampleplugin;

import java.io.File;
import java.net.URLClassLoader;

import org.slf4j.Logger;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.plugin.Plugin;

@SuppressWarnings("unused")
public class ExamplePlugin extends Plugin {

    public ExamplePlugin(Identifier identifier, URLClassLoader classLoader, File dataFolder, Logger logger) {
        super(identifier, classLoader, dataFolder, logger);
    }

    public void onLoad() {

    }

    public void onEnable() {
        LunarCore.getCommandManager().registerCommand(new ExampleCommand());
    }

    public void onDisable() {
        LunarCore.getCommandManager().unregisterCommand(ExampleCommand.class.getAnnotation(Command.class).label());
    }

}
