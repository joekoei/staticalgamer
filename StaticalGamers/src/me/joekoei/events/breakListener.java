package me.joekoei.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class breakListener implements Listener{

	public void OnBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		
		if(!p.isOp()) {
			e.setCancelled(true);
		} else {
			e.setCancelled(false);
	}}
	
	public void onPlace(BlockPlaceEvent event) {
		Player p = event.getPlayer();
		
		if(!p.isOp()) {
			event.setCancelled(true);
		} else {
			event.setCancelled(false);
		}
	}
}
