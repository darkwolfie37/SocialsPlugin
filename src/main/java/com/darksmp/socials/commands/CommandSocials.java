package com.darksmp.socials.commands;

import com.darksmp.socials.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSocials implements CommandExecutor {
    private Main plugin;
     public CommandSocials(Main plugin){
         this.plugin = plugin;
         plugin.getCommand("socials").setExecutor(this);
     }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
         if (!(sender instanceof Player)){
             sender.sendMessage("Player Only Command!");
             return true;
         } else {
             Player p = (Player) sender;
             if (p.hasPermission("socials.use")){
                 p.sendMessage(plugin.getConfig().getString("Socials"));
                 return  true;
             } else {
                 p.sendMessage(plugin.getConfig().getString("Error"));

             }
         }
        return false;
    }
}
