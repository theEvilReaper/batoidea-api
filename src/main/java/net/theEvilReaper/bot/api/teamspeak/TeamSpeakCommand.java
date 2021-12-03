package net.theEvilReaper.bot.api.teamspeak;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The enum contains some commands from teamspeak with its own sub arguments.
 * They can be used with the {@link TeamSpeakCommandBuilder} to build a {@link com.github.manevolent.ts3j.command.Command}
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public enum TeamSpeakCommand {

    EDIT_CHANNEL("channeledit", "cid", "channel_name");

    private final String name;
    private final String[] subArgs;

    /**
     * Creates a new object from the {@link TeamSpeakCommand}
     * @param name The name of the command
     * @param subArgs The given sub arguments
     */
    TeamSpeakCommand(@NotNull String name, @Nullable String... subArgs) {
        this.name = name;
        this.subArgs = subArgs;
    }

    /**
     * Return the name of the teamspeak command.
     * @return the given name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the sub arguments from the command as array.
     * @return the given sub arguments
     */
    public String[] getSubArgs() {
        return subArgs;
    }
}
