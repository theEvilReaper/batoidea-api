package net.theevilreaper.bot.api;

import net.theevilreaper.bot.api.util.Conditions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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