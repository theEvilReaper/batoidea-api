package net.theEvilReaper.bot.api.util;

import com.github.manevolent.ts3j.api.TextMessageTargetMode;
import org.jetbrains.annotations.NotNull;

import java.util.Properties;

/**
 *
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

public class Conditions {

    /**
     * Checks if a given string is empty.
     * @param string The string to check
     */

    public static void checkForEmpty(@NotNull String string) {
        if (string.trim().isEmpty()) {
            throw new IllegalArgumentException("The message can not be empty");
        }
    }

    /**
     * Checks if a given {@link Properties} file is null.
     * @param properties The file to check
     */

    public static void checkPropertiesState(Properties properties) {
        if (properties == null) {
            throw new IllegalStateException("The properties file is null. Can not set / get values");
        }
    }

    /**
     * Checks if a given {@link TextMessageTargetMode} is for the privat channel.
     * @param messageTargetMode The {@link TextMessageTargetMode} input to check
     * @return True if the mode equals the privat channel otherwise false
     */

    public static boolean isPrivatChannel(TextMessageTargetMode messageTargetMode) {
        return messageTargetMode == TextMessageTargetMode.CLIENT;
    }
}
