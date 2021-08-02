package net.theEvilReaper.bot.api.database;

import com.mongodb.client.MongoCollection;
import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * The interface defines some method to interact with an MongoDB server instance.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface MongoProcessor<T> {

    /**
     * Inserts a new object from T into the database.
     * @param model The model to add
     */

    void insert(T model);

    /**
     * Deletes a given {@link org.bson.Document} from the database
     * @param document The {@link BsonDocument} to remove
     */

    void delete(BsonDocument document);

    /**
     * Updates a given {@link org.bson.Document} in the database.
     * @param filter A filter which can be applied on the update
     * @param update The document to update
     */

    void update(BsonDocument filter, BsonDocument update);

    /**
     * Get an T referenz from the database.
     * @param filter The filter that can be applied on the query
     * @return the fetched result. That is an type from T
     */

    T get(@NotNull Bson filter);

    /**
     * Gets an collection which includes entries from T
     * @param name The name from the collection
     * @return The fetched {@link MongoCollection}
     */

    MongoCollection<T> getCollection(@NotNull String name);

    /**
     * Returns a {@link List} which T objects.
     * @param filter The filter that must be applied.
     * @return The fetched {@link List}
     */

    List<T> getList(@NotNull Bson filter);
}
