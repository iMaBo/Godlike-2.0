package me.marcoboekholt.godlike.data;

import org.bukkit.ChatColor;

public class data {

	public static String Help = ChatColor.GOLD + "=" + ChatColor.GRAY
			+ "=" + ChatColor.GOLD + "=" + ChatColor.GRAY + "="
			+ ChatColor.GOLD + " Godlike V2.0 " + ChatColor.GRAY + "="
			+ ChatColor.GOLD + "=" + ChatColor.GRAY + "=" + ChatColor.GOLD
			+ "=";
	
	public static String Commands = ChatColor.GOLD + "/godlike <sword|tools|bow|armor|fishing>";
	
	public static String noPlayer = ChatColor.RED + "You must be a player to do this.";
	
	public static String noPermissions = ChatColor.RED + "You do not have the permission to use this command.";	
	
	
	private String itemname;
	public void setItemName(String name) {
		itemname=name;
	}
	
	public String getItemName() {
		String messageItem = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "X" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + " You`ve got a " + itemname.toLowerCase();
		return messageItem;
	}
	
	private String Toolsname;
	public void setToolsName(String name) {
		Toolsname=name;
	}
	
	public String getToolsName() {
		String messageItem = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "X" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + " You`ve got some " + Toolsname.toLowerCase();
		return messageItem;
	}
	
}
