package me.marcoboekholt.godlike.data;

import org.bukkit.ChatColor;

public class data {

	public static String Help = ChatColor.GOLD + "=" + ChatColor.GRAY
			+ "=" + ChatColor.GOLD + "=" + ChatColor.GRAY + "="
			+ ChatColor.GOLD + " Godlike V2.0 " + ChatColor.GRAY + "="
			+ ChatColor.GOLD + "=" + ChatColor.GRAY + "=" + ChatColor.GOLD
			+ "=";
	
	public static String Commands = ChatColor.GOLD + "/godlike <sword|armor|tools|bow|fishing>";
	
	public static String noPlayer = ChatColor.RED + "You must be a player to do this.";
	
	public static String noPermissions = ChatColor.RED + "You do not have the permission to use this command.";
	
	private String itemname;
	public void setItemName(String name) {
		itemname = name;
	}
	
	public String getItemName() {
		return itemname;
	}
	
	public void printItemMessage() {
		String sendi = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "*" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + " You`ve got a " + itemname;
	}
}
