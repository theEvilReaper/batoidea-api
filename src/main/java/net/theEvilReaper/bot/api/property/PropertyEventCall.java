package net.theEvilReaper.bot.api.property;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The class is a wrapper for the PropertyChange system from java which replaces the old observer pattern.
 * It manages an instance from the {@link java.beans.PropertyChangeSupport}.
 * The instance allows the dispatching of {@link PropertyChangeEvent} to the instance.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface PropertyEventCall<T> {

    /**
     * Add a {@link PropertyChangeListener} to the instance.
     * @param listener The listener to add
     */

    void addListener(@NotNull PropertyChangeListener listener);

    /**
     * Add a {@link PropertyChangeListener} to a given source
     * @param source The source where the listener should be register
     * @param listener The listener to register
     */

    void addListener(@NotNull String source, @NotNull PropertyChangeListener listener);

    /**
     * Removes a {@link PropertyChangeListener}.
     * @param listener The listner to remove
     */

    void removeListener(@NotNull PropertyChangeListener listener);

    /**
     * Calls a new {@link PropertyChangeEvent} with the given values.
     * The event will be fired to the main property
     * @param oldSource The old object
     * @param newSource The new object
     */

    void call(@NotNull Object oldSource, @NotNull Object newSource);

    /**
     * Calls a new {@link PropertyChangeEvent} with the given value,
     * @param propertyName The name of the property that was changed
     * @param oldSource The old object
     * @param newSource The new object
     */

    void call(@NotNull String propertyName, @NotNull Object oldSource, @NotNull Object newSource);

    /**
     * Call a new instance of an {@link PropertyChangeEvent}.
     * @param event The event to call
     */

    void call(@NotNull PropertyChangeEvent event);

    /**
     * Check if a given source has {@link PropertyChangeListener}.
     * @param source The source to check if the source has listener
     * @return True when the source has some {@link PropertyChangeListener} otherwise false
     */

    boolean hasListener(@NotNull String source);

    /**
     * Get all listener for a given source.
     * @param source The source to determine the listeners
     * @return All listeners that matches with the specified source.
     */

    @Nullable
    PropertyChangeListener[] getListeners(@NotNull String source);

    /**
     * Get all current registered {@link PropertyChangeListener}.
     * @return all registered listener
     */

    PropertyChangeListener[] getListeners();
}
