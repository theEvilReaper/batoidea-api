package net.theEvilReaper.bot.api.event.trait;

import net.theEvilReaper.bot.api.event.Event;

/**
 * The class represents the base for any events which deals with the bot itself
 * @author theEvilReaper
 * @since 1.0.0
 * @version 1.0.0
 */
public interface BotEvent extends Event {

    /**
     * Returns the id from the bot which is involved in the event.
     * @return the given id
     */
    int getID();
}
