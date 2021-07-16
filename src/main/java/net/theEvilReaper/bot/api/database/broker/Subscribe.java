package net.theEvilReaper.bot.api.database.broker;

import java.util.function.Consumer;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface Subscribe {

    void subscribe(Consumer<byte[]> consumer);
}
