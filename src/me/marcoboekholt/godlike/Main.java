package me.marcoboekholt.godlike;

import java.util.ArrayList;
import java.util.List;

import me.marcoboekholt.godlike.commands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

//Waiting on the topic of bukkit what people want
//url: http://forums.bukkit.org/threads/godlike.309970/
//please leave your comment and let me know what you want
//Author: Marco Boekholt
//Plugin name: Godlike

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getCommand("godlike").setExecutor(new commands());
		
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(this, this);
		getServer().getLogger().info("Godlike 2.0 has been enabled.");
	}
	
	public void onDisable() {
		getServer().getLogger().info("Godlike has been disabled.");
	}
	
	@EventHandler
	public void SoulBoundDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		if (e.getItemDrop().getItemStack().getItemMeta().getLore().contains(ChatColor.GOLD + "Soulbound")) {
			e.getItemDrop().remove();
			p.sendMessage(ChatColor.DARK_GRAY + "You have dropped a Soulbounded item!");
			Location loc = p.getLocation();
			p.playSound(loc, Sound.BLAZE_HIT, 1, 0);
		}
	}
			
	@EventHandler
	public void SoulBoundDeath(PlayerDeathEvent e) {
		List<ItemStack> drops = e.getDrops();
		Object newArrayList = ((ArrayList<ItemStack>) drops).clone();
		List<ItemStack> dropsnew = (List<ItemStack>) newArrayList;
		 for (ItemStack item : dropsnew) {
			 if (!item.getItemMeta().hasLore()) { return; }
			 if (item.getItemMeta().getLore().contains(ChatColor.GOLD + "Soulbound")) {
				 drops.remove(item);
			 }
		 }
	}

}
