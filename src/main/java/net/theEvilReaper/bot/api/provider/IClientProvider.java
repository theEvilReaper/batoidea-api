package net.theEvilReaper.bot.api.provider;

import com.github.manevolent.ts3j.api.Client;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
//TODO: Rethink...
public interface IClientProvider {

    void add(@NotNull Client client);

    void remove(int clientID);

    default void remove(@NotNull Client client) {
        this.remove(client.getId());
    }

    int getSize();

    @Deprecated
    Client recognizeClient(@NotNull Client client);

    Client getClientById(int clientId);

    Client getClientByUniqueIdentifier(@NotNull String identifier);

    Map<Integer, Client> getClients();

}