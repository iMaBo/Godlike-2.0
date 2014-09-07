package me.marcoboekholt.godlike;

import me.marcoboekholt.godlike.commands.commands;

import org.bukkit.plugin.java.JavaPlugin;

//Waiting on the topic of bukkit what people want
//url: http://forums.bukkit.org/threads/godlike.309970/
//please leave your comment and let me know what you want
//Author: Marco Boekholt
//Plugin name: Godlike

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getCommand("godlike").setExecutor(new commands());
		getServer().getLogger().info("Godlike 2.0 has been enabled.");
	}
	
	public void onDisable() {
		getServer().getLogger().info("Godlike has been disabled.");
	}

}
