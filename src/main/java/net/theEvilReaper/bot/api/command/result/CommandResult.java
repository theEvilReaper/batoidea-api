package net.theevilreaper.bot.api.command.result;

import net.theevilreaper.bot.api.command.Command;
import net.theevilreaper.bot.api.util.Conditions;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Objects;

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

    @Contract("_, _, _, _ -> new")
    public static @NotNull CommandResult of(@NotNull String input, @NotNull Command command, @NotNull CommandResult.ResultType type, @Nullable String... args) {
        Conditions.checkForEmpty(input);
        return new CommandResult(input, command, type, args);
    }

    /**
     * Creates a new {@link CommandResult} which should be used when unknown command should be called.
     * @param input The current input from the user / console
     * @return the created {@link CommandResult}
     */

    @Contract("_ -> new")
    public static @NotNull CommandResult ofUnknown(@NotNull String input) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandResult that = (CommandResult) o;
        return input.equals(that.input) && Objects.equals(command, that.command) && type == that.type && Arrays.equals(args, that.args);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(input, command, type);
        result = 31 * result + Arrays.hashCode(args);
        return result;
    }

    /**
     * Defines which available ResultTypes which can be returned by a command.
     * @author theEvilReaper
     * @version 1.0.0
     * @since  1.0.0
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

