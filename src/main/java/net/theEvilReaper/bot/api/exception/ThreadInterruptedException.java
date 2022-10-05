package net.theevilreaper.bot.api.exception;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public class ThreadInterruptedException extends RuntimeException {

    public ThreadInterruptedException(String message) {
        super(message);
    }

    public ThreadInterruptedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThreadInterruptedException(Throwable cause) {
        super(cause);
    }
}
