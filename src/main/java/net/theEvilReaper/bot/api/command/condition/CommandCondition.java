package net.theEvilReaper.bot.api.command.condition;

import net.theEvilReaper.bot.api.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

@FunctionalInterface
public interface CommandCondition {

    boolean canUse(@NotNull CommandSender sender, @Nullable String command);
}
