package net.theEvilReaper.bot.api.database;

import org.jetbrains.annotations.NotNull;

/**
 * The {@link REvent} is the base class for the event system in redis. An event should need a topic.
 * The topic is the identifier for the event.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public abstract class REvent {

    protected static final String EVENT_KEY = "bot:";

    /**
     * Returns the topic from the {@link REvent}.
     * @return the given topic
     */

    @NotNull
    public abstract String getTopic();
}
