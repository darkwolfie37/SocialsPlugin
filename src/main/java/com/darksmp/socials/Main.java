package com.darksmp.socials;

import com.darksmp.socials.commands.CommandSocials;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        // Plugin startup logic
        saveDefaultConfig();
        new CommandSocials(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
