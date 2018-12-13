package me.joekoei;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

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
		
	}
	
	public void events() {
		Bukkit.getServer().getPluginManager().registerEvents(new joinListener(), this);

	}
	
	public void commands() {
		getCommand("crew").setExecutor(new staffCMD());
		getCommand("kick").setExecutor(new kickCMD());
	}
}
