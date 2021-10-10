package net.theEvilReaper.bot.api.command.result;

import net.theEvilReaper.bot.api.command.Command;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record CommandResult(@NotNull String input, @Nullable Command command, @NotNull CommandResult.ResultType type) {

    /**
     * Method to create a new instance from the {@link CommandResult}.
     * @param input The current input from the user / console
     * @param command The command that is / was executed
     * @param type The {@link ResultType} for
     * @return the created {@link CommandResult}
     */

    public static CommandResult of(@NotNull String input, @NotNull Command command, @NotNull CommandResult.ResultType type) {
        return new CommandResult(input, command, type);
    }

    /**
     * Creates a new {@link CommandResult} which should be used when unknown command should be called.
     * @param input The current input from the user / console
     * @return the created {@link CommandResult}
     */

    public static CommandResult ofUnknown(@NotNull String input) {
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
                '}';
    }

    public enum ResultType {

        /**
         * Command is not registered, it is also the default result type.
         */
        UNKNOWN,

        /**
         * Command and syntax successfully found.
         */
        SUCCESS,


    }
}

