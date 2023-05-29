package com.thiccmc.ayumu.smoothtp;

import com.thiccmc.ayumu.smoothtp.commands.SmoothWorldCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class SmoothTP extends JavaPlugin {

    public Logger log = Bukkit.getLogger();
    public Plugin plugin = this;

    @Override
    public void onEnable() {
        // Plugin startup logic
            log.info("TeleportWithoutRespawn is available.");
            log.info("Registering commands.");
            this.getCommand("smoothworld").setExecutor(new SmoothWorldCommand());
            log.info("SmoothTP has been enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log.info("SmoothTP has been disabled.");
    }
}
