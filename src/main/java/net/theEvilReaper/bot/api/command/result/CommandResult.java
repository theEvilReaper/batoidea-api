package net.theEvilReaper.bot.api.command.result;

import net.theEvilReaper.bot.api.command.Command;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record CommandResult(@NotNull String input, @Nullable Command command, @NotNull CommandResult.ResultType type) {

    public static CommandResult of(@NotNull String input, @NotNull Command command, @NotNull CommandResult.ResultType type) {
        return new CommandResult(input, command, type);
    }

    public static CommandResult ofUnknown(@NotNull String input) {
        return new CommandResult(input, null, ResultType.UNKNOWN);
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

