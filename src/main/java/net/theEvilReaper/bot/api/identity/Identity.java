package net.theEvilReaper.bot.api.identity;

import com.github.manevolent.ts3j.identity.LocalIdentity;
import org.jetbrains.annotations.NotNull;

/**
 * Contains the methods needed to load or change an identity (TS) of a bot.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public interface Identity {

    /**
     * Sets / overwrites the underlying {@link LocalIdentity}.
     * @param identity the identity to set
     */
    void setLocalIdentity(@NotNull LocalIdentity identity);

    /**
     * Returns the {@link LocalIdentity} of the bot.
     * @return the created / given {@link LocalIdentity}
     */
    LocalIdentity getIdentity();
}
