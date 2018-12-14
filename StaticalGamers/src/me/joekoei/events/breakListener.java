package me.joekoei.events;

import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;

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
	
	public void onBreak(BlockBreakEvent event) {
		Block b = event.getBlock();
		World w = event.getBlock().getWorld();
		Player p = event.getPlayer();
		
		if(!p.isOp()) {
			
		} else {
			Bukkit.broadcastMessage("Block: " + b + " World: " + w + "Player:" + p);
		}
	}
}
