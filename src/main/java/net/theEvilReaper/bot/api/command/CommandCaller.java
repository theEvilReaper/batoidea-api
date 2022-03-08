package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.command.result.CommandResult;
import net.theEvilReaper.bot.api.util.Conditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 */
public interface CommandCaller {

    /**
     * Register a new {@link Command} into the underlying data structure.
     * @param command The {@link Command} to register
     */
    void register(@NotNull Command command);

    /**
     * Unregister a given {@link Command} from the underlying structure
     * @param command The {@link Command} to unregister
     */
    void unregister(@NotNull Command command);

    /**
     * The method tries to unregister a {@link Command} by the name of the command.
     * The execution will be stopped if there is no command for the name
     * @param command The command name as string
     */
    default void unregister(@NotNull String command) {
        Conditions.checkForEmpty(command);

        var fetchedCommand = getCommand(command);

        if (fetchedCommand == null) return;

        unregister(command);
    }

    /**
     * Executes a command with the given input.
     * @param sender The {@link ConsoleSender} of the command
     * @param command The {@link Command} itself
     * @param args The arguments for the command (Can be null).
     * @return The {@link CommandResult} from the execution
     */
    CommandResult executeCommand(@NotNull CommandSender sender, @NotNull String command, @Nullable String... args);

    /**
     * Try to receive a {@link Command} by the given name as string.
     * When there is now valid command the return value is null,
     * @param commandName The name of the command
     * @return the determined {@link Command}
     */
    @Nullable
    Command getCommand(@NotNull String commandName);

    /**
     * Returns a {@link Set} which contains all current registered commands.
     * @return The {@link Set} which contains the commands
     */
    @NotNull
    Set<Command> getCommands();
}
