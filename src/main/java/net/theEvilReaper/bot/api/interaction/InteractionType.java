package net.theEvilReaper.bot.api.interaction;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public enum InteractionType {

    CLIENT((byte)0),
    GROUP((byte)1),
    SERVER((byte)2),
    CHANNEL((byte)3);

    //Reduces the defensive copies of the array when calls the values[] method
    private static final InteractionType[] VALUES = values();

    private final byte id;

    InteractionType(byte id) {
        this.id = id;
    }

    /**
     * Returns the id from the {@link InteractionType}.
     * @return  the given id
     */

    public int getId() {
        return id;
    }

    public static InteractionType[] getValues() {
        return VALUES;
    }
}
