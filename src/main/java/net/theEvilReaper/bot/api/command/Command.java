package net.theevilreaper.bot.api.command;

import net.theevilreaper.bot.api.command.condition.CommandCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The class represents the basic structure for the commands
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public abstract class Command implements CommandExecutor {

    private final String name;
    private final String[] aliases;

    private String usage;

    private CommandCondition condition;

    /**
     * Create a new instance from the {@link Command} with the given values.
     * @param name The name of the command
     * @param aliases The aliases for the command
     */

    public Command(@NotNull String name, @Nullable String... aliases) {
        this.name = name;
        this.aliases = aliases;
    }

    /**
     * Create a new instance from the {@link Command} with the given values.
     * @param name The name of the command
     */

    public Command(@NotNull String name) {
        this.name = name;
        this.aliases = null;
    }

    /**
     * Set a given {@link CommandCondition} to the command.
     * @param condition The {@link CommandCondition} to set
     */

    public void setCondition(@Nullable CommandCondition condition) {
        this.condition = condition;
    }

    /***
     * Sets the command usage.
     * @param usage the usage to set
     */

    public void setUsage(@NotNull String usage) {
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

    /**
     * Returns the name of the command.
     * @return the given name
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the given {@link CommandCondition} from the command.
     * The {@link CommandCondition} can be null
     * @return the given {@link CommandCondition}
     */

    @Nullable
    public CommandCondition getCondition() {
        return condition;
    }

    /**
     * Returns the given aliases from the command.
     * @return the given aliases as string array
     */

    @Nullable
    public String[] getAliases() {
        return aliases;
    }
}
