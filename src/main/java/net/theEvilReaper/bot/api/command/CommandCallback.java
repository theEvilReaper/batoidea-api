package net.theEvilReaper.bot.api.command;

import org.jetbrains.annotations.NotNull;

/**
 * Functional interface used by the {@link CommandManager}
 * to execute a callback if an unknown command is run.
 *
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 */
@FunctionalInterface
public interface CommandCallback {

    /**
     * Executed when a {@link CommandSender} run's an unknown command
     * @param commandSender The {@link CommandSender} who executed the command
     * @param command The command as string
     */
    void apply(@NotNull CommandSender commandSender, @NotNull String command);
}
