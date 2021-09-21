package net.theEvilReaper.bot.api.database.events;

import net.theEvilReaper.bot.api.database.REvent;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class RRankChangeEvent extends REvent {

    private UUID uuid;
    private int oldRank;
    private int newRank;

    public RRankChangeEvent() { }

    public RRankChangeEvent(UUID uuid, int oldRank, int newRank) {
        this.uuid = uuid;
        this.oldRank = oldRank;
        this.newRank = newRank;
    }

    /**
     * Returns the uuid which gains the new rank.
     * @return the underlying uuid
     */

    public UUID getUuid() {
        return uuid;
    }

    public int getNewRank() {
        return newRank;
    }

    public int getOldRank() {
        return oldRank;
    }

    @Override
    @NotNull
    public String getTopic() {
        return EVENT_KEY + "player:rank";
    }
}
