package net.theEvilReaper.bot.api.event.client;

import com.github.manevolent.ts3j.api.Client;
import net.theEvilReaper.bot.api.event.trait.ClientEvent;
import org.jetbrains.annotations.NotNull;

public record ClientQuitEvent(@NotNull Client client) implements ClientEvent {

    @NotNull
    @Override
    public Client getClient() {
        return client;
    }
}
