package io.github.hedgehog1029.Basin.Lib;

import io.github.hedgehog1029.Basin.Lib.cmd.CommandManager;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BasinLib extends JavaPlugin {
	public void onEnable() {
		Bukkit.getServer().broadcastMessage("[Basin] BasinLib loaded and enabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return CommandManager.getManager().runCommand(cmd.getName(), sender, cmd, label, args);
	}
}
