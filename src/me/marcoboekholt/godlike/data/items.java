package me.marcoboekholt.godlike.data;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
		
	public void sword(Player p, String pname) {
		ItemStack swordi = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta swordmeta = swordi.getItemMeta();
		swordmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " sword");
		ArrayList<String> sl = new ArrayList<String>();
		sl.add(ChatColor.DARK_PURPLE + "Godlike sword");
		sl.add("");
		sl.add(ChatColor.YELLOW + "Soulbound");
		swordmeta.setLore(sl);
		swordi.setItemMeta(swordmeta);
		swordi.addEnchantment(Enchantment.KNOCKBACK, 2);
		swordi.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		swordi.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		PlayerInventory pl = p.getInventory();
		pl.addItem(swordi);
	}
	
	public void tools(Player p, String pname) {
		ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta pickmeta = pickaxe.getItemMeta();
		pickmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + "pickaxe");
		ArrayList<String> plo = new ArrayList<String>();
		plo.add(ChatColor.DARK_PURPLE + "Godlike pickaxe");
		plo.add("");
		plo.add(ChatColor.YELLOW + "Soulbound");
		pickmeta.setLore(plo);
		pickaxe.setItemMeta(pickmeta);
				
		
		
		
		
		PlayerInventory pl = p.getInventory();
		pl.addItem(pickaxe);
		
	}

}
