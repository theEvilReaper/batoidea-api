package net.theevilreaper.bot.api.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The interface defines method that can be used to set values in a config.
 * @author theEvilReaper
 * @since 1.0.0
 * @version 1.0.0
 */

public interface IConfig {

    /**
     * Sets a string into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    void setString(@NotNull String key, @NotNull String value);

    /**
     * Sets an integer into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    void setInt(@NotNull String key, int value);

    /**
     * Sets a double into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    void setDouble(@NotNull String key, double value);

    /**
     * Sets a long into a given file.
     * @param key The name of the key
     * @param value The value to set
     */

    void setLong(@NotNull String key, long value);

    /**
     * Set a string array into a given file.
     * @param key The name of the key
     * @param values The array to set
     */

    void setStringArray(@NotNull String key, String... values);

    /**
     * Get a string from the properties.
     * @param key The key to determine the string.
     * @return the fetched string
     */

    @Nullable
    String getString(@NotNull String key);

    /**
     * Get an int from the properties.
     * @param key The key to determine the string.
     * @return the fetched int
     */

    int getInt(@NotNull String key);

    /**
     * Get a double from the properties.
     * @param key The key to determine the string.
     * @return the fetched double
     */

    double getDouble(@NotNull String key);

    /**
     * Get a long from the properties.
     * @param key The key to determine the string.
     * @return the fetched double
     */

    long getLong(@NotNull String key);

    /**
     * Get a string array from the properties.
     * @param key The key to determine the array
     * @return the fetched array
     */

    String[] getArray(@NotNull String key);
}
