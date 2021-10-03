package net.theEvilReaper.bot.api.config;

import org.jetbrains.annotations.NotNull;

/**
 * The interface defines method that will be used for the config that uses a bot instance.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface BotConfig extends IConfig {

    long DEFAULT_TIMEOUT = 5_000L;

    /**
     * Sets a new name for the bot.
     * @param name The name to set
     */

    default void setName(@NotNull String name) {
        this.setString("name", name);
    }

    /**
     * Set's a new description for the bot.
     * @param description The description to set
     */

    default void setDescription(@NotNull String description) {
        this.setString("description", description);
    }

    /**
     * Set's the server where the bot should connect.
     * @param server The server as string
     */

    default void setServer(@NotNull String server) {
        this.setString("server", server);
    }

    /**
     * Set's a new password that the bot uses to connect.
     * @param password The password to set
     */

    default void setPassword(@NotNull String password) {
        this.setString("password", password);
    }

    /**
     * Set's the security level.
     * @param securityLevel The security level to set
     */

    default void setSecurityLevel(int securityLevel) {
        this.setInt("securityLevel", securityLevel);
    }

    /**
     * Set's a connection timeout for the bot.
     * @param connectionTimeout The timeout to set
     */

    default void setConnectionTimeout(long connectionTimeout) {
        this.setLong("connectionTimeOut", connectionTimeout);
    }

    /**
     * Set a new default channel for the bot.
     * @param defaultChannel The channel as int to set
     */

    default void setDefaultChannel(int defaultChannel) {
        this.setInt("defaultChannel", defaultChannel);
    }

    /**
     * Returns the name from the bot.
     * @return the name
     */

    default String getName() {
        var string = this.getString("name");
        return null == string ? "Bot" : string;
    }

    /**
     * Returns the description for the bot.
     * @return the description
     */

    default String getDescription() {
        return this.getString("description");
    }

    /**
     * Returns the server where the bot should connect to.
     * @return the server as string
     */

    default String getServer() {
        return this.getString("server");
    }

    /**
     * Returns the password for the teamspeak server.
     * It can be empty when the server has no password set.
     * @return the password
     */

    default String getPassword() {
        return this.getString("password");
    }

    /**
     * Returns the current security level from the teamspeak server.
     * @return the security level as int
     */

    default int getSecurityLevel() {
        return this.getInt("securityLevel");
    }

    /**
     * Returns the connection timeout.
     * When the timeout is null the bot use a default timeout.
     * The default value is 5000L.
     * @return the given timeout as long
     */

    default long getConnectionTimeout() {
        var timeout = this.getLong("connectionTimeOut");
        return 0 == timeout ? DEFAULT_TIMEOUT : timeout;
    }

    /**
     * Returns the channel into which the bot should join
     * @return the channel as int
     */

    default int getDefaultChannel() {
        return this.getInt("defaultChannel");
    }
}