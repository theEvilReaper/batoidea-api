package net.theEvilReaper.bot.api.database;

import net.theEvilReaper.bot.api.Connectable;
import org.jetbrains.annotations.NotNull;
import org.redisson.api.RedissonClient;

/**
 * The {@link RedisConnector} is an extension for the {@link Connectable} interface. The class adds the context
 * that the class will be used for the interaction with an redis server.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public interface RedisConnector extends Connectable {

    /**
     * Returns the valid instance to an {@link RedissonClient} instance.
     * @return the underlying instance
     */
    @NotNull
    RedissonClient getConnection();
}
