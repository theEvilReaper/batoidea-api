package net.theEvilReaper.bot.api.service;

import java.beans.PropertyChangeListener;

/**
 * @author theEvilReaper
 * @version 1.0.1
 * @since 1.0.0
 **/

public interface IService extends PropertyChangeListener {

    /**
     * Change use state of the service.
     * @param canUse The new state
     */

    void setCanUse(boolean canUse);

    /**
     * Returns if the service can be used.
     * @return the underlying boolean value
     */

    boolean canUse();

    /**
     * Returns the name of the service.
     * @return the given name
     */

    String getName();
}
