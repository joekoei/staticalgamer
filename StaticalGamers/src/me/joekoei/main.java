package me.joekoei;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.*;

import me.joekoei.events.*;
import me.joekoei.commands.*;

public class main extends JavaPlugin {

	public void onEnable() {
		events();
		commands();
		System.out.println("------------------");
		System.out.println("StaticalGamer v0.1");
		System.out.println("------------------");
	}
	
	public void onDisable() {
		System.out.println("Domme poe");
	}
	
	public void events() {
		Bukkit.getServer().getPluginManager().registerEvents(new joinListener(), this);

	}
	
	public void commands() {
        this.getCommand("kick").setExecutor((CommandExecutor)new kickCMD());
	}
}
