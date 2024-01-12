package fr.denisd3d.mc2discord.core.config;

import com.electronwill.nightconfig.core.conversion.Path;

import java.util.ArrayList;
import java.util.List;

public class Replacements {
    @Path("ToDiscordReplacement")
    public List<Replacement> toDiscordReplacements = new ArrayList<>();

    @Path("FromDiscordReplacement")
    public List<Replacement> fromDiscordReplacements = new ArrayList<>();

    public static class Replacement {
        public String replaceWhat;
        public String replaceWith;

        public Replacement(String replaceWhat, String replaceWith){
            this.replaceWhat = replaceWhat;
            this.replaceWith = replaceWith;
        }

        public Replacement(){
        }
    }
}
