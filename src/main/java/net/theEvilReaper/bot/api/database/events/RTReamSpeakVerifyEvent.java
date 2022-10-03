package net.theevilreaper.bot.api.database.events;

import net.theevilreaper.bot.api.database.REvent;
import org.jetbrains.annotations.NotNull;

/**
 * The event is fired when a user has been verified on Teamspeak
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class RTReamSpeakVerifyEvent extends REvent {

    private long clientID;

    /**
     * Empty constructor for the event structure.
     */

    public RTReamSpeakVerifyEvent() { }

    /**
     * Creates a new instance from the {@link RTReamSpeakVerifyEvent}.
     * @param clientID The client id from the teamspeak client
     */

    public RTReamSpeakVerifyEvent(long clientID) {
        this.clientID = clientID;
    }

    /**
     * Returns the database ID of the user who has verified himself.
     * Note: The database ID is the teamspeak client id.
     * @return The client database id
     */

    public long getClientID() {
        return clientID;
    }

    /**
     * Returns the topic from the {@link RRankChangeEvent}.
     * @return the given topic as {@link String}
     */

    @Override
    @NotNull
    public String getTopic() {
        return EVENT_KEY + "ts:verify";
    }
}
