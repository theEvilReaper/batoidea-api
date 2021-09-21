package net.theEvilReaper.bot.api.config;

import org.jetbrains.annotations.NotNull;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface BotConfig extends IConfig {

    long DEFAULT_TIMEOUT = 5_000L;

    default void setName(@NotNull String name) {
        this.setString("name", name);
    }

    default void setDescription(@NotNull String description) {
        this.setString("description", description);
    }

    default void setServer(@NotNull String server) {
        this.setString("server", server);
    }

    default void setPassword(@NotNull String password) {
        this.setString("password", password);
    }

    default void setSecurityLevel(int securityLevel) {
        this.setInt("securityLevel", securityLevel);
    }

    default void setConnectionTimeout(long connectionTimeout) {
        this.setLong("connectionTimeOut", connectionTimeout);
    }

    default void setDefaultChannel(int defaultChannel) {
        this.setInt("defaultChannel", defaultChannel);
    }

    default String getName() {
        var string = this.getString("name");
        return null == string ? "Bot" : string;
    }

    default String getDescription() {
        return this.getString("description");
    }

    default String getServer() {
        return this.getString("server");
    }

    default String getPassword() {
        return this.getString("password");
    }

    default int getSecurityLevel() {
        return this.getInt("securityLevel");
    }

    default long getConnectionTimeout() {
        var timeout = this.getLong("connectionTimeOut");
        return 0 == timeout ? DEFAULT_TIMEOUT : timeout;
    }

    default int getDefaultChannel() {
        return this.getInt("defaultChannel");
    }
}