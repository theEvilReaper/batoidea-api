package net.theEvilReaper.bot.api.command;

import org.jetbrains.annotations.NotNull;

import static net.theEvilReaper.bot.api.util.Strings.EMPTY_ARRAY;
import static net.theEvilReaper.bot.api.util.Strings.SPLIT_PATTERN;

/**
 * The interface includes a method where a developer can implement a way,
 * how the input should be parsed to execute a command.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface CommandParser {

    /**
     * The method parse the given input to execute a command.
     * @param commandManager The instance from a {@link CommandSender}
     * @param sender The instance from a {@link CommandSender}
     * @param input The input from the user or console line
     */

    default void parse(@NotNull CommandManager commandManager, @NotNull CommandSender sender, @NotNull String input) {
        var split = SPLIT_PATTERN.split(input);

        if (split.length == 0) return;

        String command = split[0];
        String[] arguments = split.length == 1 ? EMPTY_ARRAY : new String[split.length - 1];

        if (arguments.length > 1) {
            System.arraycopy(split, 1, arguments, 0, split.length - 1);
        }

        commandManager.executeCommand(sender, command, arguments);
    }
}
