package net.theEvilReaper.bot.api.database.events;

import net.theEvilReaper.bot.api.database.REvent;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * The event will be fired when a player receives a rank update.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public class RRankChangeEvent extends REvent {

    private UUID uuid;
    private int oldRank;
    private int newRank;

    /**
     * Empty constructor for the event structure.
     */
    public RRankChangeEvent() { }

    /**
     * Creates a new instance from the {@link RRankChangeEvent}.
     * @param uuid The uuid who got the rank change
     * @param oldRank The old rank as integer
     * @param newRank The new rank as integer
     */
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

    /**
     * Returns the new rank from the entity.
     * @return the new rank as integer
     */
    public int getNewRank() {
        return newRank;
    }

    /**
     * Returns the old rank from the entity.
     * @return the old rank as integer
     */
    public int getOldRank() {
        return oldRank;
    }

    /**
     * Returns the topic from the {@link RRankChangeEvent}.
     * @return the given topic as {@link String}
     */
    @Override
    @NotNull
    public String getTopic() {
        return EVENT_KEY + "player:rank";
    }
}
