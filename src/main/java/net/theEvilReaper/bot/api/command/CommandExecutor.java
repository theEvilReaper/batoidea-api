package net.theEvilReaper.bot.api.command;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Holds only a method to execute the implementation of a command.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface CommandExecutor {

    /**
     * Executes the command callback once the syntax has been called.
     *
     * @param sender  the sender of the command
     * @param command The name of the command
     * @param args Arguments from the command
     */

    void apply(@NotNull CommandSender sender, @NotNull String command, @Nullable String... args);
}