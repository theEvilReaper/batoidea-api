package net.theEvilReaper.bot.api.config;

import net.theEvilReaper.bot.api.util.Conditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Properties;

/**
 * The class is the basic implementation of the {@link IConfig}.
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

    /**
     * Sets a string into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    @Override
    public void setString(@NotNull String key, @NotNull String value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, value);
    }

    /**
     * Sets an integer into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    @Override
    public void setInt(@NotNull String key, int value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, String.valueOf(value));
    }

    /**
     * Sets a double into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    @Override
    public void setDouble(@NotNull String key, double value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, String.valueOf(value));
    }

    /**
     * Sets a long into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    @Override
    public void setLong(@NotNull String key, long value) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        properties.setProperty(key, String.valueOf(value));
    }

    /**
     * Get a string from a given file.
     * @param key The key to determine the string.
     * @return the fetched string
     */

    @Override
    @Nullable
    public String getString(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return properties.getProperty(key);
    }

    /**
     * Get an int from a given file.
     * @param key The key to determine the string.
     * @return the fetched int
     */

    @Override
    public int getInt(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return Integer.parseInt(properties.getProperty(key));
    }

    /**
     * Get a double from a given file.
     * @param key The key to determine the string.
     * @return the fetched double
     */

    @Override
    public double getDouble(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return Double.parseDouble(properties.getProperty(key));
    }

    /**
     * Get a long from a given file.
     * @param key The key to determine the string.
     * @return the fetched double
     */

    @Override
    public long getLong(@NotNull String key) {
        Conditions.checkPropertiesState(properties);
        Conditions.checkForEmpty(key);
        return Long.parseLong(properties.getProperty(key));
    }
}