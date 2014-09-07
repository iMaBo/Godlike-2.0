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
		pickmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " pickaxe");
		ArrayList<String> plo = new ArrayList<String>();
		plo.add(ChatColor.DARK_PURPLE + "Godlike pickaxe");
		plo.add("");
		plo.add(ChatColor.YELLOW + "Soulbound");
		pickmeta.setLore(plo);
		pickaxe.setItemMeta(pickmeta);
		pickaxe.addEnchantment(Enchantment.DIG_SPEED, 5);
		pickaxe.addEnchantment(Enchantment.SILK_TOUCH, 1);
		pickaxe.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		pickaxe.addEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta axemeta = axe.getItemMeta();
		axemeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " axe");
		ArrayList<String> xlo = new ArrayList<String>();
		xlo.add(ChatColor.DARK_PURPLE + "Godlike axe");
		xlo.add("");
		xlo.add(ChatColor.YELLOW + "Soulbound");
		axemeta.setLore(xlo);
		axe.setItemMeta(axemeta);
		axe.addEnchantment(Enchantment.DIG_SPEED, 5);
		axe.addEnchantment(Enchantment.SILK_TOUCH, 1);
		axe.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		axe.addEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack spade = new ItemStack(Material.DIAMOND_SPADE, 1);
		ItemMeta spademeta = spade.getItemMeta();
		spademeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " shovel");
		ArrayList<String> slo = new ArrayList<String>();
		slo.add(ChatColor.DARK_PURPLE + "Godlike spade");
		slo.add("");
		slo.add(ChatColor.YELLOW + "Soulbound");
		spademeta.setLore(slo);
		spade.setItemMeta(spademeta);
		spade.addEnchantment(Enchantment.DIG_SPEED, 5);
		spade.addEnchantment(Enchantment.SILK_TOUCH, 1);
		spade.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		spade.addEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack hoe = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta hoemeta = hoe.getItemMeta();
		hoemeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " hoe");
		ArrayList<String> hlo = new ArrayList<String>();
		hlo.add(ChatColor.DARK_PURPLE + "Godlike hoe");
		hlo.add("");
		hlo.add(ChatColor.YELLOW + "Soulbound");
		hoemeta.setLore(hlo);
		hoe.setItemMeta(hoemeta);
		hoe.addEnchantment(Enchantment.DURABILITY, 3);
		
		PlayerInventory pl = p.getInventory();
		pl.addItem(pickaxe);
		pl.addItem(axe);
		pl.addItem(spade);
		pl.addItem(hoe);
	}
	
	public void bow (Player p, String pname) {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta bowmeta = bow.getItemMeta();
		bowmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " bow");
		ArrayList<String> blo = new ArrayList<String>();
		blo.add(ChatColor.DARK_PURPLE + "Godlike bow");
		blo.add("");
		blo.add(ChatColor.YELLOW + "Soulbound");
		bowmeta.setLore(blo);
		bow.setItemMeta(bowmeta);
		bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
		bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
		bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
		bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
		bow.addEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack arrow = new ItemStack(Material.ARROW, 1);
		ItemMeta arrowmeta = arrow.getItemMeta();
		arrowmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " arrow");
		ArrayList<String> alo = new ArrayList<String>();
		alo.add(ChatColor.DARK_PURPLE + "Godlike arrow");
		alo.add("");
		alo.add(ChatColor.YELLOW + "Soulbound");
		arrowmeta.setLore(alo);
		arrow.setItemMeta(arrowmeta);
		
		PlayerInventory pl = p.getInventory();
		pl.addItem(bow);
		pl.setItem(9, arrow);
	}

}
