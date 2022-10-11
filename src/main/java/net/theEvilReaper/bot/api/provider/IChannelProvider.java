package net.theevilreaper.bot.api.provider;

import com.github.manevolent.ts3j.api.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public interface IChannelProvider {

    void add(@NotNull Channel channel);

    void removeChannel(int channelID);

    default void removeChannel(@NotNull Channel channel) {
        this.removeChannel(channel.getId());
    }

    /**
     * Returns the channel based on the given id
     * @param channelId the id from the channel
     * @return The fetched channel. It can be null
     */
    @Nullable
    Channel getChannelById(int channelId);

    /**
     * Returns the underlying map which contains all {@link Channel}.
     * @return the underlying map
     */
    @NotNull
    Map<Integer, Channel> getChannels();
}
