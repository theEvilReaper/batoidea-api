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

    void addChangeListener(@NotNull PropertyChangeListener listener);

    /**
     * Remove a {@link PropertyChangeListener}.
     * @param listener The listener to remove
     */

    void removeChangeListener(@NotNull PropertyChangeListener listener);

}