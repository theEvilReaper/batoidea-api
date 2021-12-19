package net.theEvilReaper.bot.api.event.trait;

import com.github.manevolent.ts3j.api.Client;
import net.theEvilReaper.bot.api.event.Event;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the base class for any event which deals with a client
 * @author theEvilReaper
 * @since 1.0.0
 * @version 1.0.0
 */
public interface ClientEvent extends Event {

    /**
     * Returns the given client which is involved in the event.
     * @return the client
     */
    @NotNull
    Client getClient();
}
