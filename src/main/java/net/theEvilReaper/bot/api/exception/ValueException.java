package net.theEvilReaper.bot.api.exception;

/**
 * The exception is used when there is a value in the context that is not allowed.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public class ValueException extends Exception {

    private final String object;

    /**
     * Creates a new instance from the {@link ValueException} with the given parameters.
     * @param object The object that is involved
     * @param message The message for the exception
     */
    public ValueException(String object, String message) {
        super(message);
        this.object = object;
    }

    /**
     * Returns the object that is involved in the exception.
     * @return the involved object
     */
    public String getObject() {
        return object;
    }
}