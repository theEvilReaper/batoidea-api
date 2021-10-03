package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.interaction.AbstractInteractionFactory;
import net.theEvilReaper.bot.api.interaction.InteractionType;
import net.theEvilReaper.bot.api.interaction.UserInteraction;
import org.jetbrains.annotations.Nullable;

/**
 * The class represents the basic structure for the commands
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public abstract class Command implements CommandExecutor {

    protected UserInteraction userInteraction;
    private String usage;

    /**
     * Creates a new instance from the {@link Command}.
     * @param factory the {@link AbstractInteractionFactory} to get the {@link UserInteraction}
     */

    public Command(AbstractInteractionFactory factory) {
        this.userInteraction = factory.getInteraction(InteractionType.CLIENT, UserInteraction.class);
    }

    /***
     * Sets the command usage.
     * @param usage the usage to set
     */

    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * Returns the given usage for the command.
     * @return the underlying usage. It can be null
     */

    @Nullable
    public String getUsage() {
        return usage;
    }
}
