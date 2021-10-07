package net.theEvilReaper.bot.api.command;

import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since
 **/

public class ConsoleSender implements CommandSender {

    private static final Logger LOGGER = Logger.getLogger("BotLogger");

    @Override
    public void sendMessage(@NotNull String message) {
        LOGGER.info(message);
    }

    @Override
    public boolean isConsole() {
        return true;
    }
}
