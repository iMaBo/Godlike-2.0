package me.marcoboekholt.godlike.commands;

import me.marcoboekholt.godlike.data.data;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		data dataobj = new data();
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.isOp() || p.hasPermission("Godlike.help")) {
				if (cmd.getName().equalsIgnoreCase("godlike")) {
					if (args.length == 0) {
						p.sendMessage(data.Help);
						p.sendMessage(data.Commands);
					} else if (args[0].equalsIgnoreCase("sword")) {
						dataobj.setItemName("sword");
						dataobj.printItemMessage();
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
