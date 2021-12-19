package net.theEvilReaper.bot.api.event;

import org.jetbrains.annotations.NotNull;

public sealed class BotEventDispatcher extends {

    public static void callEvent(@NotNull Event event) {

    }

    public static void callCancellableEvent(@NotNull Event event, @NotNull Runnable runnable) {

    }

}
