package net.theEvilReaper.bot.api.command;

import net.theEvilReaper.bot.api.command.condition.CommandCondition;
import net.theEvilReaper.bot.api.interaction.AbstractInteractionFactory;
import net.theEvilReaper.bot.api.interaction.InteractionType;
import net.theEvilReaper.bot.api.interaction.UserInteraction;
import net.theEvilReaper.bot.api.util.Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The class represents the basic structure for the commands
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public abstract class Command implements CommandExecutor {

    protected UserInteraction userInteraction;

    private final String name;
    private final String[] names;
    private final String[] aliases;

    private String usage;
    private CommandCondition condition;

    /**
     * Creates a new instance from the {@link Command}.
     * @param factory the {@link AbstractInteractionFactory} to get the {@link UserInteraction}
     */

    public Command(@NotNull AbstractInteractionFactory factory, @NotNull String name, @Nullable String... aliases) {
        this.userInteraction = factory.getInteraction(InteractionType.CLIENT, UserInteraction.class);
        this.name = name;
        this.aliases = aliases;
        this.names = Stream.concat(Arrays.stream(aliases), Stream.of(name)).toArray(String[]::new);
    }

    public Command(@NotNull String name, @Nullable String... aliases) {
        this.name = name;
        this.aliases = aliases;
        this.names = Stream.concat(Arrays.stream(aliases), Stream.of(name)).toArray(String[]::new);
    }

    public Command(@NotNull String name) {
        this(name, Strings.EMPTY_ARRAY);
    }

    public void setCondition(@Nullable CommandCondition condition) {
        this.condition = condition;
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

    public String getName() {
        return name;
    }

    @Nullable
    public CommandCondition getCondition() {
        return condition;
    }

    @Nullable
    public String[] getAliases() {
        return aliases;
    }

    public String[] getNames() {
        return names;
    }
}
