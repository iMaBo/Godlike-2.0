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
		swordmeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " sword");
		ArrayList<String> sl = new ArrayList<String>();
		sl.add(ChatColor.DARK_PURPLE + "Godlike sword");
		sl.add("");
		sl.add(ChatColor.GOLD + "Soulbound");
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
		pickmeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " pickaxe");
		ArrayList<String> plo = new ArrayList<String>();
		plo.add(ChatColor.DARK_PURPLE + "Godlike pickaxe");
		plo.add("");
		plo.add(ChatColor.GOLD + "Soulbound");
		pickmeta.setLore(plo);
		pickaxe.setItemMeta(pickmeta);
		pickaxe.addEnchantment(Enchantment.DIG_SPEED, 5);
		pickaxe.addEnchantment(Enchantment.SILK_TOUCH, 1);
		pickaxe.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		pickaxe.addEnchantment(Enchantment.DURABILITY, 3);

		ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta axemeta = axe.getItemMeta();
		axemeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " axe");
		ArrayList<String> xlo = new ArrayList<String>();
		xlo.add(ChatColor.DARK_PURPLE + "Godlike axe");
		xlo.add("");
		xlo.add(ChatColor.GOLD + "Soulbound");
		axemeta.setLore(xlo);
		axe.setItemMeta(axemeta);
		axe.addEnchantment(Enchantment.DIG_SPEED, 5);
		axe.addEnchantment(Enchantment.SILK_TOUCH, 1);
		axe.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		axe.addEnchantment(Enchantment.DURABILITY, 3);

		ItemStack spade = new ItemStack(Material.DIAMOND_SPADE, 1);
		ItemMeta spademeta = spade.getItemMeta();
		spademeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " shovel");
		ArrayList<String> slo = new ArrayList<String>();
		slo.add(ChatColor.DARK_PURPLE + "Godlike spade");
		slo.add("");
		slo.add(ChatColor.GOLD + "Soulbound");
		spademeta.setLore(slo);
		spade.setItemMeta(spademeta);
		spade.addEnchantment(Enchantment.DIG_SPEED, 5);
		spade.addEnchantment(Enchantment.SILK_TOUCH, 1);
		spade.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		spade.addEnchantment(Enchantment.DURABILITY, 3);

		ItemStack hoe = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta hoemeta = hoe.getItemMeta();
		hoemeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " hoe");
		ArrayList<String> hlo = new ArrayList<String>();
		hlo.add(ChatColor.DARK_PURPLE + "Godlike hoe");
		hlo.add("");
		hlo.add(ChatColor.GOLD + "Soulbound");
		hoemeta.setLore(hlo);
		hoe.setItemMeta(hoemeta);
		hoe.addEnchantment(Enchantment.DURABILITY, 3);

		PlayerInventory pl = p.getInventory();
		pl.addItem(pickaxe);
		pl.addItem(axe);
		pl.addItem(spade);
		pl.addItem(hoe);
	}

	public void bow(Player p, String pname) {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta bowmeta = bow.getItemMeta();
		bowmeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " bow");
		ArrayList<String> blo = new ArrayList<String>();
		blo.add(ChatColor.DARK_PURPLE + "Godlike bow");
		blo.add("");
		blo.add(ChatColor.GOLD + "Soulbound");
		bowmeta.setLore(blo);
		bow.setItemMeta(bowmeta);
		bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
		bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
		bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
		bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
		bow.addEnchantment(Enchantment.DURABILITY, 3);

		ItemStack arrow = new ItemStack(Material.ARROW, 1);
		ItemMeta arrowmeta = arrow.getItemMeta();
		arrowmeta.setDisplayName(ChatColor.GREEN + pname + "`s"
				+ ChatColor.DARK_GRAY + " arrow");
		ArrayList<String> alo = new ArrayList<String>();
		alo.add(ChatColor.DARK_PURPLE + "Godlike arrow");
		alo.add("");
		alo.add(ChatColor.GOLD + "Soulbound");
		arrowmeta.setLore(alo);
		arrow.setItemMeta(arrowmeta);

		PlayerInventory pl = p.getInventory();
		pl.addItem(bow);
		pl.setItem(9, arrow);
	}

	public void armor(Player p, String pname) {
		ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta helmetmeta = helmet.getItemMeta();
		helmetmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " helmet");
		ArrayList<String> hlo = new ArrayList<String>();
		hlo.add(ChatColor.DARK_PURPLE + "Godlike helmet");
		hlo.add("");
		hlo.add(ChatColor.GOLD + "Soulbound");
		helmetmeta.setLore(hlo);
		helmet.setItemMeta(helmetmeta);
		helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		helmet.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		helmet.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
		helmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
		helmet.addEnchantment(Enchantment.THORNS, 3);
		helmet.addEnchantment(Enchantment.OXYGEN, 3);
		helmet.addEnchantment(Enchantment.WATER_WORKER, 1);
		
		ItemStack body = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta bodymeta = body.getItemMeta();
		bodymeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " chestplate");
		ArrayList<String> blo = new ArrayList<String>();
		blo.add(ChatColor.DARK_PURPLE + "Godlike chestplate");
		blo.add("");
		blo.add(ChatColor.GOLD + "Soulbound");
		bodymeta.setLore(blo);
		body.setItemMeta(bodymeta);
		body.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		body.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		body.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
		body.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
		body.addEnchantment(Enchantment.THORNS, 3);
		
		ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		ItemMeta legsmeta = legs.getItemMeta();
		legsmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " leggings");
		ArrayList<String> llo = new ArrayList<String>();
		llo.add(ChatColor.DARK_PURPLE + "Godlike leggings");
		llo.add("");
		llo.add(ChatColor.GOLD + "Soulbound");
		legsmeta.setLore(llo);
		legs.setItemMeta(legsmeta);
		legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		legs.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		legs.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
		legs.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
		legs.addEnchantment(Enchantment.THORNS, 3);
		
		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
		ItemMeta bootsmeta = boots.getItemMeta();
		bootsmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " boots");
		ArrayList<String> blo1 = new ArrayList<String>();
		blo1.add(ChatColor.DARK_PURPLE + "Godlike boots");
		blo1.add("");
		blo1.add(ChatColor.GOLD + "Soulbound");
		bootsmeta.setLore(blo1);
		boots.setItemMeta(bootsmeta);
		boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		boots.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		boots.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
		boots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
		boots.addEnchantment(Enchantment.THORNS, 3);
		
		PlayerInventory pl = p.getInventory();
		pl.addItem(helmet);
		pl.addItem(body);
		pl.addItem(legs);
		pl.addItem(boots);
	}

	public void fishing(Player p, String pname) {
		ItemStack fishingrod = new ItemStack(Material.FISHING_ROD, 1);
		ItemMeta fishingrodmeta = fishingrod.getItemMeta();
		fishingrodmeta.setDisplayName(ChatColor.GREEN + pname + "`s" + ChatColor.DARK_GRAY + " fishing rod");
		ArrayList<String> frlo = new ArrayList<String>();
		frlo.add(ChatColor.DARK_PURPLE + "Godlike fishing rod");
		frlo.add("");
		frlo.add(ChatColor.GOLD + "Soulbound");
		fishingrodmeta.setLore(frlo);
		fishingrod.setItemMeta(fishingrodmeta);
		fishingrod.addEnchantment(Enchantment.DURABILITY, 3);
		fishingrod.addEnchantment(Enchantment.LUCK, 3);
		fishingrod.addEnchantment(Enchantment.LURE, 3);
		
		PlayerInventory pl = p.getInventory();
		pl.addItem(fishingrod);	
	}
	
}
