package net.theevilreaper.bot.api.command;

import net.theevilreaper.bot.api.command.result.CommandResult;
import net.theevilreaper.bot.api.util.Conditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CommandManager {

    /**
     * Register a {@link Command}.
     * @param command The {@link Command} to register
     */
    void register(@NotNull Command command);

    /**
     * Unregister a {@link Command}.
     * @param command The {@link Command} to unregister
     */
    void unregister(@NotNull Command command);

    /**
     * Unregister a {@link Command} by the name.
     * The method make a lookup to underlying map where all command are registered.
     * When the result then nothing will happen
     * @param commandName The name from the command
     */
    default void unregister(@NotNull String commandName) {
        Conditions.checkForEmpty(commandName);
        var command = getCommand(commandName);
        if (command == null) return;
        this.unregister(command);
    }

    /**
     * Check if a command with the name is currently registered.
     * @param commandName The name of the command
     * @return True when a command is registered with the name otherwise false
     */

    boolean hasCommand(@NotNull String commandName);

    /**
     * Sets the callback executed once an unknown command is run.
     *
     * @param commandCallback the new unknown command callback,
     *                        setting it to null mean that nothing will be executed
     */
    void setUnknownCommandCallback(@NotNull CommandCallback commandCallback);

    /**
     * Executes a {@link Command} for a {@link CommandSender}
     * @param sender The {@link CommandSender} who execute the command
     * @param command The name from the {@link Command} as {@link String}
     * @param args The Arguments for the {@link Command} as {@link String} array
     * @return True when the command can be executed otherwise false
     */
    @NotNull
    CommandResult executeCommand(@NotNull CommandSender sender, @NotNull String command, @Nullable String... args);

    /**
     * Gets the callback executed once an unknown command is run.
     * @return the unknown command callback, null if not any
     */
    @Nullable
    CommandCallback getUnknownCommandCallback();

    /**
     * Returns the {@link Command} object that matches with the given commandName
     * The result can be null when there is no {@link Command} for the name.
     * @param commandName The name from the {@link Command} as string
     * @return The fetched {@link Command} class.
     */
    @Nullable
    Command getCommand(@NotNull String commandName);

    /**
     * Returns the current command prefix.
     * @return the given prefix
     */
    @NotNull
    String getCommandPrefix();
}
