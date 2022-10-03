package net.theevilreaper.bot.api.command.condition;

import  net.theevilreaper.bot.api.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

@FunctionalInterface
public interface CommandCondition {

    /**
     * Called when the sender needs to be checked.
     *
     * @param sender The sender of the command
     * @param command The command as string
     * @return True if the sender can use the command otherwise false
     */

    boolean canUse(@NotNull CommandSender sender, @Nullable String command);
}
