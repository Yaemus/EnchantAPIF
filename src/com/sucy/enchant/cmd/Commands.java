package com.sucy.enchant.cmd;

import com.rit.sucy.commands.CommandManager;
import com.rit.sucy.commands.ConfigurableCommand;
import com.rit.sucy.commands.SenderType;
import com.sucy.enchant.EnchantmentAPI;

/**
 * EnchantmentAPI © 2017
 * com.sucy.enchant.cmd.Commands
 */
public class Commands {

    public static void init(final EnchantmentAPI plugin) {
        final ConfigurableCommand root = new ConfigurableCommand(plugin, "enapi", SenderType.ANYONE);
        root.addSubCommands(
                new ConfigurableCommand(
                        plugin,
                        "add",
                        SenderType.PLAYER_ONLY,
                        new CmdAdd(),
                        "Enchants an item held on your main hand",
                        "<enchant> <level>",
                        "EnchantmentAPI.admin"),
                new ConfigurableCommand(
                        plugin,
                        "reload",
                        SenderType.ANYONE,
                        new CmdReload(),
                        "Reloads the plugin",
                        "",
                        "EnchantmentAPI.admin"),
                new ConfigurableCommand(
                        plugin,
                        "graph",
                        SenderType.ANYONE,
                        new CmdGraph(),
                        "Graphs probabilities",
                        "<mat> <enchant>",
                        "EnchantmentAPI.admin"),
                new ConfigurableCommand(
                        plugin,
                        "book",
                        SenderType.PLAYER_ONLY,
                        new CmdBook(),
                        "Give a book with detailed info about the available enchants",
                        "",
                        "EnchantmentAPI.admin")
        );
        CommandManager.registerCommand(root);
    }
}
