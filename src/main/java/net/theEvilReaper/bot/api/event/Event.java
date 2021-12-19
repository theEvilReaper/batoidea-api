package net.theEvilReaper.bot.api.event;

public interface Event {

    default String getName() {
        return this.getClass().getSimpleName();
    }
}
