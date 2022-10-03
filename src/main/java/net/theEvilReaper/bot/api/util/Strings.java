package net.theevilreaper.bot.api.util;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

/**
 * The class contains some constants for the work with strings.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public final class Strings {

    /**
     * Global constant for an empty array.
     */
    public static final String[] EMPTY_ARRAY = new String[0];

    /**
     * Global constant for a string that contains only a space.
     */
    public static final String SPACE = " ";

    public static final Pattern SPACE_PATTERN = Pattern.compile(SPACE);

    private static final Pattern DOMAIN_PATTERN =
            Pattern.compile("(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]");

    private static final Pattern IPV4_PATTERN =
            Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");

    private Strings() {}

    /**
     * Checks if a given string is a valid domain.
     * @param domain The string to check
     * @return True when the string is a valid domain otherwise false
     */
    public static boolean isDomain(@NotNull String domain) {
        var matches = DOMAIN_PATTERN.matcher(domain);
        return matches.matches();
    }

    /**
     * Checks if a given string is a valid ip address.
     * The method ignores the broadcast ip
     * @param address The address to check
     * @return True when the ip is valid otherwise false
     */
    public static boolean isIpV4Address(@NotNull String address) {
        return IPV4_PATTERN.matcher(address).matches();
    }
}