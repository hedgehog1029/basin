package io.github.hedgehog1029.Basin.Lib.cmd;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CommandManager {
	private static final CommandManager MANAGER = new CommandManager();
	
	public static CommandManager getManager() {
		return MANAGER;
	}
	
	private ArrayList<ManagedCommand> commands = new ArrayList<ManagedCommand>();
	
	public void registerCommand(ManagedCommand c) {
		commands.add(c);
	}
	
	public void unregisterCommand(ManagedCommand c) {
		commands.remove(c);
	}
	
	public boolean runCommand(String identifer, CommandSender sender, Command cmd, String label, String[] args) {
		for (ManagedCommand c : this.commands) {
			if (c.getCommandIdentifier().equalsIgnoreCase(cmd.getName())) {
				return c.runCommand(sender, cmd, label, args);
			}
		}
		return true;
	}
}
