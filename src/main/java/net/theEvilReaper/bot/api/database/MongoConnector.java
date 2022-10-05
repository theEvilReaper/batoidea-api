package net.theevilreaper.bot.api.database;

import com.mongodb.client.MongoClient;
import net.theevilreaper.bot.api.Connectable;
import org.jetbrains.annotations.NotNull;

/**
 * The {@link MongoConnector} is an extension for the {@link Connectable} interface. The class adds the context
 * that the class will be used for the interaction with an MongoDB server.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface MongoConnector extends Connectable {

    /**
     * Returns the given connection from the MongoDB
     * @return the underlying instance to the {@link MongoClient}
     */

    @NotNull
    MongoClient getConnection();
}

