package net.theEvilReaper.bot.api.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

class StringsTest {

    /**
     * Test if a given string is a valid domain.
     */

    @Test
    void testForDomain() {
        assertTrue(Strings.isDomain("ts.example.com"));
    }

    /**
     * Checks if the given domain is invalid.
     */

    @Test
    void testForInvalidDomain() {
        assertFalse(Strings.isDomain("joinserverde"));
    }

    /**
     * Checks if a given ip is a valid IPv4 address.
     */

    @Test
    void testForIPv4Address() {
        assertTrue(Strings.isIpV4Address("120.120.123.233"));
    }

    /**
     * Checks if a given ip is an invalid IPv4 address.
     */

    @Test
    void testForInvalidIPv4Address() {
        assertFalse(Strings.isIpV4Address("120.120.123.300"));
    }
}