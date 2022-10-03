package net.theevilreaper.bot.api.command;

import org.jetbrains.annotations.NotNull;

/**
 * Represents something which can send commands to the server.
 *
 * The api has two main implementations for that. One is the {@link net.theEvilReaper.bot.api.user.User}
 * and the other implementation is the {@link ConsoleSender}.
 *
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface CommandSender {

    /**
     * Sends a raw string message.
     *
     * @param message the message to send
     */
    void sendMessage(@NotNull String message);

    /**
     * Sends multiple raw string messages.
     * The message will be ignored when the array has a length from zero.
     *
     * @param messages the messages to send
     */
    default void sendMessage(@NotNull String... messages) {
        if (messages.length == 0) return;

        for (int i = 0; i < messages.length; i++) {
            sendMessage(messages[i]);
        }
    }

    /**
     * Returns the name of the {@link CommandSender}.
     * @return the given name
     */
    String getName();
}
