package me.joekoei.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinListener implements Listener {

	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if(p.isOp()) {
			Bukkit.broadcastMessage(p + " Joined the server! (Crew)");
		} else {
			Bukkit.broadcastMessage(p + " Joined the server!");
		}
	}
	
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
		if(p.isOp()) {
			Bukkit.broadcastMessage(p + " Just disconnected (Crew");
		} else {
			Bukkit.broadcastMessage(p + " Just disconnected");
		}
	}
	
}
