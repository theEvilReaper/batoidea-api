package net.theEvilReaper.bot.api.interaction;

import com.github.manevolent.ts3j.api.Channel;
import org.jetbrains.annotations.NotNull;

/**
 * Has all method that can use the bot
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface BotInteraction extends Interaction {

    /**
     * Sends a message to the channel where the bot is located.
     * @param message the message to send
     */

    void sendChannelMessage(@NotNull String message);

    /**
     * Pokes a client with a given message.
     * @param clientID The id from the client
     * @param message The message to send
     */

    void poke(int clientID, @NotNull String message);

    /**
     * Enter the channel by the {@link Channel} object.
     * @param targetChannel The channel to join
     */

    default void joinChannel(@NotNull Channel targetChannel) {
        joinChannel(targetChannel.getId());
    }

    /**
     * Enter the channel by the given ID.
     * @param channelId the id from the channel
     */

    void joinChannel(int channelId);
}
