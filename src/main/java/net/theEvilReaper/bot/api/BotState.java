package net.theevilreaper.bot.api;

/**
 * The enum contains all relevant states from the bot.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public enum BotState {

    STARTING,
    CONNECTING,
    RECONNECTING,
    RUNNING,
    STOPPING,
    SCHEDULED_STOPPING,
    STOPPED
}