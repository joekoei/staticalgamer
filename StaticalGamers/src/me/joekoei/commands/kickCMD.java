package me.joekoei.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class kickCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("kick")); {
			if(!sender.isOp()) {
				sender.sendMessage("Je bent geen staff vies kind!");
			} else {
				sender.sendMessage("Nog niet af!");
			}
		}
		return false;
	}

}
