package me.joekoei.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class staffCMD implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if (cmd.getName().equalsIgnoreCase("crew")) {
			sender.sendMessage(ChatColor.GRAY + "-------(StaticalGamer)-------");
			sender.sendMessage(ChatColor.GOLD + "Te lui om dit te fixen nu");
			sender.sendMessage(ChatColor.GRAY + "-------(StaticalGamer)-------");
			}
		return false;
		
	}

}