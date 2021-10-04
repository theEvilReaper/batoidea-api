package net.theEvilReaper.bot.api.property;

import org.jetbrains.annotations.NotNull;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since
 **/

public interface PropertyEventCall<T> {

    /**
     * Add a {@link PropertyChangeListener} to the instance.
     * @param listener The listener to add
     */

    void addListener(@NotNull PropertyChangeListener listener);

    void addListener(@NotNull String source, @NotNull PropertyChangeListener listener);

    void removeListener(@NotNull PropertyChangeListener listener);

    void call(@NotNull Object oldSource, @NotNull Object newSource);

    void call(@NotNull String propertyName,@NotNull Object oldSource, @NotNull Object newSource);

    void call(@NotNull PropertyChangeEvent event);

    boolean hasListener(@NotNull String source);

}
