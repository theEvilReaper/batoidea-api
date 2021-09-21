package net.theEvilReaper.bot.api.database.events;

import net.theEvilReaper.bot.api.database.REvent;
import org.jetbrains.annotations.NotNull;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class RTeamSpeakSupportEvent extends REvent {

    @Override
    public @NotNull String getTopic() {
        return EVENT_KEY + "ts:support";
    }
}
