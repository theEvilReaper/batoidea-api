package net.theEvilReaper.bot.api.database.events;

import net.theEvilReaper.bot.api.database.REvent;
import org.jetbrains.annotations.NotNull;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class RTReamSpeakVerifyEvent extends REvent {

    private long clientID;

    public RTReamSpeakVerifyEvent() { }

    public RTReamSpeakVerifyEvent(long clientID) {
        this.clientID = clientID;
    }

    public long getClientID() {
        return clientID;
    }

    @Override
    public @NotNull String getTopic() {
        return EVENT_KEY + "ts:verify";
    }
}
