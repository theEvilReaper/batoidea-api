package net.theEvilReaper.bot.api.observer;

import org.jetbrains.annotations.NotNull;

import java.beans.PropertyChangeListener;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface PropertyChange {

    void addChangeListener(@NotNull PropertyChangeListener listener);

    void removeChangeListener(@NotNull PropertyChangeListener listener);
}
