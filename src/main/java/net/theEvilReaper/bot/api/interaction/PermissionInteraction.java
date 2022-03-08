package net.theEvilReaper.bot.api.interaction;

import com.github.manevolent.ts3j.api.Permission;
import org.jetbrains.annotations.Nullable;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
//TODO: Add method for the permission handling with the channel or own class?
public interface PermissionInteraction extends Interaction {

    /**
     * Add a new single permission or an array with permission to the given client.
     * @param clientDatabaseID The client id from the {@link com.github.manevolent.ts3j.api.Client}
     * @param permissions The permission(s) to add
     */
    void addPermission(int clientDatabaseID, @Nullable Permission... permissions);

    /**
     * Add a new single permission or an array with permission to the given client.
     * @param clientDatabaseID The client id from the {@link com.github.manevolent.ts3j.api.Client}
     * @param permissions The permission(s) to add
     */
    void removePermission(int clientDatabaseID, @Nullable Permission... permissions);
}
