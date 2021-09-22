package net.theEvilReaper.bot.api.database.events;

import net.theEvilReaper.bot.api.database.REvent;
import org.jetbrains.annotations.NotNull;

/**
 * The event will be fired when a user joins the support channel on the teamspeak server.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class RTeamSpeakSupportEvent extends REvent {

    /**
     * Returns the topic from the {@link RRankChangeEvent}.
     * @return the given topic as {@link String}
     */

    @Override
    @NotNull
    public String getTopic() {
        return EVENT_KEY + "ts:support";
    }
}
