package me.joekoei.commands;

import org.bukkit.Bukkit;
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
				if(args.length < 1) {
					sender.sendMessage("Je hebt geen speler opgegeven..");
				}
				
				if(args.length == 1) {
					sender.sendMessage("Je hebt" + args[0] + "gekickt");
					Bukkit.dispatchCommand(sender, "kick " + args[0]);
				}
				
			}
		}
		return false;
	}

}
