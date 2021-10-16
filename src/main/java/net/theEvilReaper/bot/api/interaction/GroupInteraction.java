package net.theEvilReaper.bot.api.interaction;

import com.github.manevolent.ts3j.api.Client;
import net.theEvilReaper.bot.api.user.User;
import org.jetbrains.annotations.NotNull;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface GroupInteraction extends Interaction {

    void addServerGroup(@NotNull Client client, int groupId);

    void removeServerGroup(@NotNull Client client, int groupId);

    @Deprecated
    default boolean hasGroup(@NotNull Client client, int groupId) {
        boolean isIn = false;

        if (client.getServerGroups().length != 0) {
            for (int i = 0; i < client.getServerGroups().length && !isIn; i++) {
                if (client.getServerGroups()[i] == groupId)
                    isIn = true;
            }
        }
        return isIn;
    }

    @Deprecated
    default boolean hasGroup(@NotNull User user, int groupID) {
        var groups = user.getGroups();

        if (groups.length == 0) {
            return false;
        }


        if (groups.length == 1) {
            return groups[0] == groupID;
        }

        boolean hasGroup = false;

        for (int i = 0; i < groups.length && !hasGroup; i++) {
            if (groups[i] == groupID) {
                hasGroup = true;
            }
        }

        return hasGroup;
    }
}
