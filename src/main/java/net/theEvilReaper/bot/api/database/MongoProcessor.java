package net.theEvilReaper.bot.api.database;

import dev.morphia.Datastore;
import net.theEvilReaper.bot.api.database.model.MongoModel;
import org.bson.BsonDocument;

/**
 * The interface defines some method to interact with an MongoDB server instance.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public interface MongoProcessor<T extends MongoModel> {

    /**
     * Inserts a new object from T into the database.
     * @param model The model to add
     */
    void insert(T model);

    /**
     * Deletes a given {@link org.bson.Document} from the database
     * @param model The {@link BsonDocument} to remove
     */
    void delete(T model);

    /**
     * Updates a given {@link org.bson.conversions.Bson} in the database.
     * @param model The document to update
     */
    void update(T model);

    /**
     * Returns a {@link Datastore} which allows to create some queries
     * @return The working {@link Datastore}
     */
    Datastore getDatastore();
}
