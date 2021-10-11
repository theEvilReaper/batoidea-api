package net.theEvilReaper.bot.api.service;

import net.theEvilReaper.bot.api.util.Conditions;
import org.jetbrains.annotations.NotNull;

import java.beans.PropertyChangeEvent;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public abstract class StaticService implements IService {

    private final String name;

    private boolean use;

    public StaticService(@NotNull String name) {
        Conditions.checkForEmpty(name);
        this.name = name;
    }

    public abstract void handlePropertyChange(@NotNull PropertyChangeEvent event);

    @Override
    public void setCanUse(boolean use) {
        this.use = use;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        handlePropertyChange(evt);
    }

    @Override
    public boolean canUse() {
        return use;
    }

    @Override
    public String getName() {
        return name;
    }
}
