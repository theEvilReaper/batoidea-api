package net.theEvilReaper.bot.api.command.result;

import net.theEvilReaper.bot.api.command.Command;
import net.theEvilReaper.bot.api.util.Conditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

/**
 * The {@link CommandResult} represents the return value of each command that should be executed.
 * The result includes some additional information which shows what goes wrong.
 * The class is in some cases not perfect, but it's better to have something than only a boolean value
 * @since 1.0.0
 * @version 1.0.0
 */

public record CommandResult(@NotNull String input, @Nullable Command command, @NotNull CommandResult.ResultType type, @Nullable String... args) {

    /**
     * Method to create a new instance from the {@link CommandResult}.
     * @param input The current input from the user / console
     * @param command The command that is / was executed
     * @param type The {@link ResultType} for
     * @return the created {@link CommandResult}
     */

    public static CommandResult of(@NotNull String input, @NotNull Command command, @NotNull CommandResult.ResultType type, @Nullable String... args) {
        Conditions.checkForEmpty(input);
        return new CommandResult(input, command, type, args);
    }

    /**
     * Creates a new {@link CommandResult} which should be used when unknown command should be called.
     * @param input The current input from the user / console
     * @return the created {@link CommandResult}
     */

    public static CommandResult ofUnknown(@NotNull String input) {
        Conditions.checkForEmpty(input);
        return new CommandResult(input, null, ResultType.UNKNOWN);
    }

    /**
     * Overrides the implementation of toString().
     * @return A string which represents the class with all given values
     */

    @Override
    public String toString() {
        return "CommandResult{" +
                "input='" + input + '\'' +
                ", command=" + command +
                ", type=" + type.name() +
                ", args=" + (args == null || args.length == 0 ? "null" : Arrays.toString(args)) +
                '}';
    }

    /**
     * //TODO: DOC here
     */

    public enum ResultType {

        /**
         * Command is not registered, it is also the default result type.
         */
        UNKNOWN,

        /**
         * Command and syntax successfully found.
         */
        SUCCESS,

        /**
         *
         */
        SYNTAX
    }
}

