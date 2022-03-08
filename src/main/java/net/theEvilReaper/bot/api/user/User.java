package net.theEvilReaper.bot.api.user;

import com.github.manevolent.ts3j.api.Client;
import net.theEvilReaper.bot.api.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

/**
 * The {@link User} represents a user on the teamspeak server.
 * @author theEvilReaper
 * @since 1.0.0
 * @version 1.0.0
 */
public interface User extends CommandSender {

    /**
     * Refresh the underlying {@link Client} object.
     * @param client The object to update
     */
    void refresh(@NotNull Client client);

    /**
     * Set a new main group for the {@link User}.
     * @param groupID The id to set
     */
    void setMainGroup(int groupID);

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
     * Set's a locale to the user.
     * @param locale The locale to set
     */
    void setLocale(Locale locale);

    /**<
     * Returns the current channel from the user.
     * @return the current channel as id
     */
    int getChannelID();

    /**
     * Returns the main teamspeak group of the user.
     * @return the current main group as id
     */
    int getMainGroup();

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
     * Check if the main group id equals the given id.
     * @param groupID The id to check
     * @return True if the ids are equal otherwise false
     */
    default boolean hasMainGroup(int groupID) {
        return getMainGroup() == groupID;
    }

    /**
     * Checks if the user is in the given group.
     * @return the id from the group
     */
    default boolean hasGroup(int groupId) {
        boolean hasGroup = false;

        var groups = getGroups();

        for (int i = 0; i < groups.length && !hasGroup; i++) {
            if (groups[i] == groupId) {
                hasGroup = true;
            }
        }

        return hasGroup;
    }

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
