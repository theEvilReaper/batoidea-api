package net.theEvilReaper.bot.api.observer;

import org.jetbrains.annotations.NotNull;

import java.beans.PropertyChangeListener;
import java.util.List;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface PropertyChange {

    /**
     * Add a {@link PropertyChangeListener}.
     * @param listener The listener to add
     */

    void addListener(@NotNull PropertyChangeListener listener);

    /**
     * Remove a {@link PropertyChangeListener}.
     * @param listener The listener to remove
     */

    void removeListener(@NotNull PropertyChangeListener listener);

    /**
     * Get a list which contains all current active {@link PropertyChangeListener}
     * @return a list which contains the listener
     */

    List<PropertyChangeListener> getListeners();
}
