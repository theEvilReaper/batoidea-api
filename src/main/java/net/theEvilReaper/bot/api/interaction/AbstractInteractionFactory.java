package net.theevilreaper.bot.api.interaction;

import org.jetbrains.annotations.NotNull;

/**
 * The {@link AbstractInteractionFactory} defines a method which returns an implementation of an
 * {@link Interaction} class which is based on the given values.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public abstract class AbstractInteractionFactory {

    /**
     * Get a specific implementation of the {@link Interaction} from the factory.
     * @param type The type which implementation should be determined
     * @param clazzType The implementation class from the {@link Interaction}
     * @param <T> The value must extend from the {@link Interaction}.
     * @return The determined {@link Interaction} implementation.
     */

    public abstract <T extends Interaction> T getInteraction(@NotNull InteractionType type, Class<T> clazzType);
}
