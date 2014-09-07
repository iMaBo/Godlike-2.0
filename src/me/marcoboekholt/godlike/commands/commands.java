package me.marcoboekholt.godlike.commands;

import me.marcoboekholt.godlike.data.data;
import me.marcoboekholt.godlike.data.items;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		data dataobj = new data();
		items itemobj = new items();
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.isOp() || p.hasPermission("Godlike.help")) {
				if (cmd.getName().equalsIgnoreCase("godlike")) {
					if (args.length == 0) {
						p.sendMessage(data.Help);
						p.sendMessage(data.Commands);
						return true;
					} else if (args[0].equalsIgnoreCase("sword")) {
						if (p.hasPermission("Godlike.sword")) {
							itemobj.sword(p, p.getName());
							dataobj.setItemName(args[0]);
							p.sendMessage(dataobj.getItemName());
						}
					} else if (args[0].equalsIgnoreCase("tools")) {
						if (p.hasPermission("Godlike.tools")) {
							itemobj.tools(p, p.getName());
							dataobj.setToolsName(args[0]);
							p.sendMessage(dataobj.getToolsName());
						}
					} else if (args[0].equalsIgnoreCase("bow")) {
						if (p.hasPermission("Godlike.bow")) {
							itemobj.bow(p, p.getName());
							dataobj.setItemName(args[0]);
							p.sendMessage(dataobj.getItemName()
									+ " with arrows");
						}
					} else if (args[0].equalsIgnoreCase("armor")) {
						if (p.hasPermission("Godlike.armor")) {
							itemobj.armor(p, p.getName());
							dataobj.setToolsName(args[0]);
							p.sendMessage(dataobj.getToolsName());
						}
					}
				}
			} else {
				sender.sendMessage(data.noPermissions);
			}
		} else {
			sender.sendMessage(data.noPlayer);
		}
		return false;
	}

}
