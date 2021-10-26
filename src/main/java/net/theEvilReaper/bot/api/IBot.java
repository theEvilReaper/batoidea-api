package net.theEvilReaper.bot.api;

import net.theEvilReaper.bot.api.command.CommandManager;
import net.theEvilReaper.bot.api.config.BotConfig;
import net.theEvilReaper.bot.api.database.IRedisEventManager;
import net.theEvilReaper.bot.api.interaction.AbstractInteractionFactory;
import net.theEvilReaper.bot.api.interaction.BotInteraction;
import net.theEvilReaper.bot.api.property.PropertyEventCall;
import net.theEvilReaper.bot.api.provider.IChannelProvider;
import net.theEvilReaper.bot.api.provider.IClientProvider;
import net.theEvilReaper.bot.api.service.ServiceRegistry;
import net.theEvilReaper.bot.api.user.IUserService;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

/**
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

    Logger getLogger();

    /**
     * Gets the state of the bot.
     * @return the current state.
     */
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

    IUserService getUserService();

    /**
     * Returns the given instance from the {@link IClientProvider}.
     * @return the underlying instance
     */

    IClientProvider getClientProvider();

    /**
     * Returns the given instance from the {@link IChannelProvider}.
     * @return the underlying instance
     */

    IChannelProvider getChannelProvider();

    /**
     * Returns the given instance from the {@link ServiceRegistry}.
     * @return the underlying instance
     */

    ServiceRegistry getServiceRegistry();

    /**
     * Returns the given instance from the {@link BotInteraction}.
     * @return the underlying instance
     */

    BotInteraction getBotInteraction();

    /**
     * Returns the given implementation of the {@link AbstractInteractionFactory}.
     * @return the given instance
     */

    AbstractInteractionFactory getInteractionFactory();

    /**
     * Returns the implementation of the event manager for the redis events.
     * @return the given instance
     */

    IRedisEventManager getEventManager();

    /**
     * Returns the implementation for the {@link PropertyEventCall}.
     * @return the given instance
     */

    PropertyEventCall getPropertyEventCall();

    /**
     * Returns the implementation from the {@link CommandManager}.
     * @return the given instance
     */

    CommandManager getCommandManager();

    /**
     * Returns the given instance to the config for the {@link IBot}
     * @return the given {@link BotConfig} instance
     */

    BotConfig getConfig();
}
