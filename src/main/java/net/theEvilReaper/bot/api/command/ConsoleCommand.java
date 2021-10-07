package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.console.Console;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

@Deprecated(forRemoval = true, since = "The command structure will be replaced in the future")
public abstract class ConsoleCommand {

    public abstract void execute(@NotNull Console console, @NotNull String command, @Nullable String... args);
}
