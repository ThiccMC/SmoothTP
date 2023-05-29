package com.thiccmc.ayumu.smoothtp.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SmoothWorldCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
        if (args.length != 1) {
            return false;
        }

        String worldName = args[0];
        World world = Bukkit.getWorld(worldName);

        if (world == null) {
            sender.sendMessage("The specified world does not exist.");
            return true;
        }

        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Perform the teleportation
            player.teleportWithoutRespawn(world.getSpawnLocation());
            player.sendMessage("Teleported to world: " + world.getName());
        } else {
            sender.sendMessage("This command can only be executed by a player.");
        }

        return true;
    }
}
