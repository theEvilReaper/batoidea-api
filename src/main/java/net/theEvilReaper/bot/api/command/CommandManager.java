package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.util.Conditions;
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
     * @param command The {@link Command} to ungregister
     */

    void unregister(@NotNull Command command);

    /**
     * Unregister a {@link Command} by the name.
     * The method make a lookup to underlying map where all command are registerd.
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
     * Change set current used prefix for the command
     * @param prefix The new prefix to set
     */

    void setCommandPrefix(@NotNull String prefix);

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
     * @param command The name from the command as {@link String}
     * @param args The Arguments for the command as {@link String} array
     * @return True when the command can be executed otherwise false
     * //TODO: Do we need as `CommandResult`to indicate what happen when the command fails to execute?
     */

    boolean executeCommand(@NotNull ConsoleSender sender, @NotNull String command, @NotNull String... args);

    /**
     * Gets the callback executed once an unknown command is run.
     * @return the unknown command callback, null if not any
     */

    @Nullable
    CommandCallback getUnknownCommandCallback();

    /**
     * Returns the {@link Command} object that matches with the given commandName
     * The result can be null when there is no command for the name.
     * @param commandName The name from the Command as string
     * @return The fetched {@link Command} class.
     */

    @Nullable
    Command getCommand(@NotNull String commandName);

    /**
     * Gets the {@link ConsoleSender} (which is used as a {@link CommandSender}).
     * @return the {@link ConsoleSender}
     */

    @NotNull
    ConsoleSender getConsoleSender();
}
