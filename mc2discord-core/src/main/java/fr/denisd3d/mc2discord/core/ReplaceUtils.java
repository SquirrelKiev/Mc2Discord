package fr.denisd3d.mc2discord.core;

import fr.denisd3d.mc2discord.core.config.Replacements;

import java.util.List;
import java.util.Objects;

public class ReplaceUtils {
    public static String doTheReplacements(String message, List<Replacements.Replacement> replacements) {
        String replacedMessage = message;

        for (Replacements.Replacement replacement : replacements) {
            if (Objects.equals(replacement.replaceWhat, "") && Objects.equals(replacement.replaceWith, ""))
                continue;

            replacedMessage = replacedMessage.replaceAll(replacement.replaceWhat, replacement.replaceWith);
        }

        return replacedMessage;
    }
}
