package net.theEvilReaper.bot.api;

/**
 * The interface defines an object which can connect to a server / service.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Connectable {

    /**
     * Handles the logic when something connects.
     */
    void connect();

    /**
     * Handles the logic when something disconnect.
     */
    void disconnect();

    /**
     * Returns if the bot is connected.
     * @return True when the bot is connected otherwise false
     */
    boolean isConnected();
}
