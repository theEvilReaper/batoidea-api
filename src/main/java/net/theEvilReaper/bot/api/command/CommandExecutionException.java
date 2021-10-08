package net.theEvilReaper.bot.api.command;

import org.jetbrains.annotations.NotNull;

/**
 * The exception will be thrown when an error occurred when executing commands.
 * @author theEvilReaper
 * @version 1.0.0
 * @author 1.0.0
 */

public class CommandExecutionException extends Exception {

    /**
     * Creates a new instance from the class.
     * @param message The message for the exception
     */

    public CommandExecutionException(@NotNull String message) {
        super(message);
    }

    /**
     * Creates a new instance from the class.
     * @param message The message for the exception
     * @param cause The cause to set
     */

    public CommandExecutionException(@NotNull String message, @NotNull Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new instance from the class.
     * @param cause The cause to set
     */

    public CommandExecutionException(@NotNull Throwable cause) {
        super(cause);
    }
}
