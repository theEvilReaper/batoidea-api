package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.command.result.CommandResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public interface CommandCaller {

    void register(@NotNull Command command);

    void unregister(@NotNull Command command);

    CommandResult executeCommand(@NotNull CommandSender sender, @NotNull String command, @Nullable String... args);

    Command getCommand(@NotNull String commandName);

    @NotNull
    Set<Command> getCommands();
}
