package net.theEvilReaper.bot.api.command;

import com.github.manevolent.ts3j.api.Client;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Logger;

/**
 * Holds only a method to execute the implementation of an command.
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

    void onCommand(@NotNull Client executor, @NotNull String command, @Nullable String... args);
}