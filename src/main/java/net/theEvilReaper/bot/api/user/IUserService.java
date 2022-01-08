package net.theEvilReaper.bot.api.user;

import net.theEvilReaper.bot.api.service.IService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

/**
 * The {@link IUserService} defines some methods that are used for the management of users.
 * @author theEvilReaper
 * @since 1.0.0
 * @version 1.0.0
 */
public interface IUserService<T extends User> extends IService {

    /**
     * Add a user to the service.
     * @param user The user to add
     */
    void add(@NotNull T user);

    /**
     * Remove a user to the service.
     * @param user The user to remove
     */
    default void remove(T user) {
        this.remove(user.getID());
    }

    void remove(int id);

    /**
     * Get a user with the given id.
     * @param clientID The id form the client to determine the {@link User}
     * @return the determined client. When no client found it returns a null reference
     */
    @Nullable
    User getUser(int clientID);

    /**
     * Get the {@link Map} with all current user.
     * @return the underlying instance
     */
    Map<Integer, T> getUser();
}