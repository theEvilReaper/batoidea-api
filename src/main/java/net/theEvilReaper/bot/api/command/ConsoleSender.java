package net.theevilreaper.bot.api.command;

import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

/**
 * The class represents the implementation for the {@link ConsoleSender}.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class ConsoleSender implements CommandSender {

    private static final Logger LOGGER = Logger.getLogger("BotLogger");

    /**
     * Send as message to the sender.
     * @param message the message to send
     */

    @Override
    public void sendMessage(@NotNull String message) {
        LOGGER.info(message);
    }

    /**
     * Returns the name from the sender.
     * @return the give name
     */
    @Override
    public String getName() {
        return "Console";
    }
}
