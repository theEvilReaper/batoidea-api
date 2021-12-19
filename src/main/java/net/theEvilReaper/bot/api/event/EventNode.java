package net.theEvilReaper.bot.api.event;

import org.jetbrains.annotations.NotNull;

public interface EventNode<T extends Event> {

    void addListener();

    default void call(@NotNull T event) {

    }

    default void callCancellable(@NotNull T event, @NotNull Runnable successCallback) {
        call(event);
        if (!(event instanceof CancellableEvent) || !((CancellableEvent) event).isCancelled()) {
            successCallback.run();
        }
    }
}
