package net.theEvilReaper.bot.api;

import net.theEvilReaper.bot.api.util.Conditions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since
 **/

class ConditionsTest {

    @Test
    void testForEmpty() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Conditions.checkForEmpty(" ");
        });
    }

}