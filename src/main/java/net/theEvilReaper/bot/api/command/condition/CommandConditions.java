package net.theevilreaper.bot.api.command.condition;

import net.theevilreaper.bot.api.command.CommandSender;
import net.theevilreaper.bot.api.command.ConsoleSender;
import net.theevilreaper.bot.api.user.User;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public final class CommandConditions {

    private static final String ONLY_FOR_USER = "The command is only for users";
    private static final String ONLY_FOR_CONSOLE = "The command is only for the console";

    private CommandConditions() {}

    /**
     * Checks if the {@link CommandSender} is a user.
     * @param sender The {@link CommandSender} to check
     * @param message The message to send
     * @return True when the {@link CommandSender} is a user otherwise false
     */
    public static boolean isUser(@NotNull CommandSender sender, @Nullable String message) {
        if (!(sender instanceof User)) {
            sender.sendMessage(message == null ? ONLY_FOR_USER : message);
            return false;
        }
        return true;
    }

    /**
     * Checks if the {@link CommandSender} is the console.
     * @param sender The {@link CommandSender} to check
     * @param message The message to send
     * @return True when the {@link CommandSender} is the console otherwise false
     */
    public static boolean forConsoleOnly(@NotNull CommandSender sender, @Nullable String message) {
        if (!(sender instanceof ConsoleSender)) {
            sender.sendMessage(message == null ? ONLY_FOR_CONSOLE : message);
            return false;
        }
        return true;
    }
}
