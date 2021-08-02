package net.theEvilReaper.bot.api.database;

import org.redisson.api.RBlockingQueue;
import org.redisson.api.RBucket;
import org.redisson.api.RKeys;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RQueue;
import org.redisson.api.RSet;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface RedisProcessor<K, V> {

    /**
     * Get an {@link RMap} from redis.
     * @param key The key to determine the right value
     * @return The fetched {@link RMap}
     */

    RMap<K, V> getMap(String key);

    /**
     * Returns all {@link RKeys} from the given context.
     * @return the fetched {@link RKeys}.
     */

    RKeys getKeys();

    /**
     * Get an {@link RList} from redis. The {@link RList} includes an list from V values.
     * @param key The key to determine the right value
     * @return The fetched {@link RList}
     */

    RList<V> getList(String key);

    /**
     * Get an {@link RSet} from redis. The {@link RSet} includes an set from V values.
     * @param key The key to determine the right value
     * @return The fetched {@link RSet}
     */

    RSet<V> getSet(String key);

    /**
     * Get an {@link RBucket} from redis. The {@link RBucket} includes the V value.
     * @param key The key to determine the right value
     * @return The fetched value
     */

    RQueue<V> getQueue(String key);

    /**
     * Get an {@link RBlockingQueue} from redis. The {@link RBlockingQueue} includes the V value.
     * @param key The key to determine the right value
     * @return The fetched value
     */

    RBlockingQueue<V> getBlockingQueue(String key);

    /**
     * Get an {@link RBucket} from redis. The {@link RBucket} includes the V value.
     * @param key The key to determine the right value
     * @return The fetched value
     */

    RBucket<V> getBucket(String key);
}