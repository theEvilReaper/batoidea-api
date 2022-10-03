package net.theevilreaper.bot.api;

import net.theevilreaper.bot.api.command.CommandManager;
import net.theevilreaper.bot.api.config.BotConfig;
import net.theevilreaper.bot.api.database.IRedisEventManager;
import net.theevilreaper.bot.api.interaction.AbstractInteractionFactory;
import net.theevilreaper.bot.api.interaction.BotInteraction;
import net.theevilreaper.bot.api.property.PropertyEventCall;
import net.theevilreaper.bot.api.provider.IChannelProvider;
import net.theevilreaper.bot.api.provider.IClientProvider;
import net.theevilreaper.bot.api.service.ServiceRegistry;
import net.theevilreaper.bot.api.user.IUserService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.logging.Logger;

/**
 *
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public interface IBot extends Connectable {

    /**
     * Gets if the bot is running.
     * @return true if the bot is running, false otherwise.
     */
    default boolean isRunning() {
        return getState() == BotState.RUNNING;
    }

    /**
     * Gets if the bot is stopping.
     * @return true if the bot is stopping, false otherwise
     */
    default boolean isStopping() {
        return getState() == BotState.STOPPING;
    }

    /**
     * Changes the current {@link BotState} to the given state.
     * @param botState The state to set
     */
    void setState(@NotNull BotState botState);

    /**
     * Returns the logger from the bot.
     * @return the underlying instance from the logger
     */
    @NotNull
    Logger getLogger();

    /**
     * Gets the state of the bot.
     * @return the current state.
     */
    @NotNull
    BotState getState();

    /**
     * Returns the id from the bot.
     * The id would be set if the bot has successfully connected to the given server
     * @return the generated id from the bot.
     */
    int getBotID();

    /**
     * Returns the given instance from the {@link IUserService}.
     * @return the underlying service
     */
    @NotNull
    IUserService getUserService();

    /**
     * Returns the given instance from the {@link IClientProvider}.
     * @return the underlying instance
     */
    @NotNull
    IClientProvider getClientProvider();

    /**
     * Returns the given instance from the {@link IChannelProvider}.
     * @return the underlying instance
     */
    @NotNull
    IChannelProvider getChannelProvider();

    /**
     * Returns the given instance from the {@link ServiceRegistry}.
     * @return the underlying instance
     */
    @NotNull
    ServiceRegistry getServiceRegistry();

    /**
     * Returns the given instance from the {@link BotInteraction}.
     * @return the underlying instance
     */
    @NotNull
    BotInteraction getBotInteraction();

    /**
     * Returns the given implementation of the {@link AbstractInteractionFactory}.
     * @return the given instance
     */
    @NotNull
    AbstractInteractionFactory getInteractionFactory();

    /**
     * Returns the implementation of the event manager for the redis events.
     * @return the given instance
     */
    @Nullable
    IRedisEventManager getEventManager();

    /**
     * Returns the implementation for the {@link PropertyEventCall}.
     * @return the given instance
     */
    @NotNull
    PropertyEventCall getPropertyEventCall();

    /**
     * Returns the implementation from the {@link CommandManager}.
     * @return the given instance
     */
    @NotNull
    CommandManager getCommandManager();

    /**
     * Returns the given instance to the config for the {@link IBot}
     * @return the given {@link BotConfig} instance
     */
    @NotNull
    BotConfig getConfig();

    /**
     * Returns the uuid from the bot.
     * @return the given uuid
     */
    @NotNull
    UUID getUUID();
}
