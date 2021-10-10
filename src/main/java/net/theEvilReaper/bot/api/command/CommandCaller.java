package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.command.result.CommandResult;
import org.jetbrains.annotations.NotNull;

public interface CommandCaller {

    void register(@NotNull Command command);

    void unregister(@NotNull Command command);

    CommandResult executeCommand(@NotNull ConsoleSender sender, @NotNull String command, @NotNull String... args);

    Command getCommand(@NotNull String commandName);
}
