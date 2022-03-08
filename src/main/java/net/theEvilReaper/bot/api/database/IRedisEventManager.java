package net.theEvilReaper.bot.api.database;

import org.jetbrains.annotations.NotNull;
import org.redisson.api.RFuture;

import java.util.function.Consumer;

/**
 * The interface defines the most important methods used in the redis event system.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public interface IRedisEventManager {

    /**
     * Register a listener to the event system.
     * @param eventType The class which must extends from {@link REvent}
     * @param consumer The consumer which provides the logic what happens when the event is called
     * @param <T> The class must extends from {@link REvent}
     */
    <T extends REvent> void registerListener(Class<T> eventType, Consumer<T> consumer);

    /**
     * Unregisters a listener from the event system.
     * @param consumer The consumer to unregister
     */
    void unregisterListener(Consumer<? extends REvent> consumer);

    /**
     * The methods call any type of {@link REvent}.
     * @param event The event to fire
     * @return Returns the number of clients that have received the event
     */
    long callEvent(@NotNull REvent event);

    /**
     * The methods call any type of {@link REvent} asynchronous.
     * @param event The event to fire
     * @return an {@link RFuture} which contains a number how many clients received the event
     */
    RFuture<Long> callAsync(@NotNull REvent event);
}
