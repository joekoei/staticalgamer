package me.joekoei.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener {

	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if(p.isOp() ) {
			
		}
	}
	
}
