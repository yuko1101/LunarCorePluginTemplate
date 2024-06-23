package com.example.exampleplugin;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(
    label = "example",
    aliases = {"ex"},
    permission = "player.example",
//    requireTarget = true,
    desc = "/example. This is an example command."
)
class ExampleCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs commandArgs) {
        commandArgs.getSender().sendMessage("Hello, world!");
    }
}
