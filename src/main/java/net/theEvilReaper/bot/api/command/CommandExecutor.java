package net.theEvilReaper.bot.api.command;

import com.github.manevolent.ts3j.api.Client;
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
     * The method holds the logic for each command implementation of the bot.
     * @param executor The client who executed the command
     * @param command The command itself
     * @param args The arguments from the command
     */
    @Deprecated
    void onCommand(@NotNull Client executor, @NotNull String command, @Nullable String... args);

    /**
     * Executes the command callback once the syntax has been called.
     *
     * @param sender  the sender of the command
     * @param command The name of the command
     * @param args Arguments from the command
     */

    void apply(@NotNull CommandSender sender, @NotNull String command, @Nullable String... args);
}