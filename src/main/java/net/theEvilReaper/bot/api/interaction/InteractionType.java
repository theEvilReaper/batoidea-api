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

    private static final InteractionType[] VALUES = values();
    private final byte id;

    InteractionType(byte id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static InteractionType[] getValues() {
        return VALUES;
    }
}
