package net.theEvilReaper.bot.api.event;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface EventCallback<T extends Event> {

    void run(@NotNull T event);
}
