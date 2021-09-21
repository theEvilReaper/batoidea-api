package net.theEvilReaper.bot.api.config;

import net.theEvilReaper.bot.api.util.Conditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.Properties;

/**
 * @author theEvilReaper
 * @since 1.0.0
 * @version 1.0.0
 */

public abstract class Config implements IConfig {

    protected Properties properties;

    /**
     * Loads the {@link Properties}.
     */

    public abstract void load();

    /**
     * Saves the {@link Properties}.
     */

    public abstract void save();

    @Override
    public void setString(@NotNull String key, @NotNull String value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, value);
    }

    @Override
    public void setInt(@NotNull String key, int value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, String.valueOf(value));
    }

    @Override
    public void setDouble(@NotNull String key, double value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, String.valueOf(value));
    }

    @Override
    public void setLong(@NotNull String key, long value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, String.valueOf(value));
    }

    @Override
    @Nullable
    public String getString(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return properties.getProperty(key);
    }

    @Override
    public int getInt(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return Integer.parseInt(properties.getProperty(key));
    }

    @Override
    public double getDouble(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return Double.parseDouble(properties.getProperty(key));
    }

    @Override
    public long getLong(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return Long.parseLong(properties.getProperty(key));
    }
}