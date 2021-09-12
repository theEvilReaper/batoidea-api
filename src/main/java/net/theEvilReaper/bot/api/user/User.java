package net.theEvilReaper.bot.api.user;

import com.github.manevolent.ts3j.api.Client;

import java.util.Locale;

public interface User {

    /**
     * Sets the current channel for the user.
     * @param channelID The new channel id
     */

    void setCurrentChannel(int channelID);

    /**
     * Set the group id from the user.
     * @param groupID The id to set
     */

    void setGroups(int... groupID);

    /**
     * Change the verified status. Standard value is false
     * @param verified If the player is verified as boolean
     */
    
    void setVerified(boolean verified);

    /**
     * Returns the current channel from the user.
     * @return the current channel as id
     */

    int getChannelID();

    /**
     * Returns the group id from the user.
     * @return the group id from the user
     */

    int[] getGroups();

    /**
     * Returns if the user is verified.
     * @return true when verified otherwise false
     */

    boolean isVerified();

    /**
     * Returns the language from the user as {@link Locale}.
     * @return the underlying locale
     */

    Locale getLocale();

    /**
     * Returns the {@link Client} from the user.
     * @return the given client
     */

    Client getClient();
}
