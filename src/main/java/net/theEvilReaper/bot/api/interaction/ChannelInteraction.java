package net.theevilreaper.bot.api.interaction;

import com.github.manevolent.ts3j.api.Permission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public interface ChannelInteraction extends Interaction {

    default void joinChannel(int channelID) {
        joinChannel(channelID, null);
    }

    void joinChannel(int channelID, @Nullable String password);

    void sendChannelMessage(int channelID, @NotNull String message);

    void addChannelPermission(int channelID, @NotNull Permission... permissions);

    void addChannelClientPermission(int channelID, int clientDatabaseID,  @NotNull Permission... permissions);

    void removeChannelClientPermission(int channelID, int clientDatabaseID, @NotNull Permission... permissions);
}
