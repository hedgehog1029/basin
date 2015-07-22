package io.github.hedgehog1029.Basin.Lib.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface ManagedCommand {
	public abstract String getCommandIdentifier();
	public abstract boolean runCommand(CommandSender sender, Command cmd, String label, String[] args);
}
