/*
 *  ReActions, Minecraft bukkit plugin
 *  (c)2017, fromgate, fromgate@gmail.com
 *  http://dev.bukkit.org/server-mods/reactions/
 *
 *  This file is part of ReActions.
 *
 *  ReActions is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  ReActions is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with ReActions.  If not, see <http://www.gnorg/licenses/>.
 *
 */


package me.fromgate.ravariables;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.fromgate.reactions.util.Variables;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.regex.Pattern;

public class RaVariables extends PlaceholderExpansion {

    private final static Pattern VARP = Pattern.compile("(?i)varp?:\\S+");
    private final static String EMPTY = new String();



    public String getIdentifier() {
        return "reactions";
    }

    @Override
    public boolean canRegister() {
        return Bukkit.getPluginManager().getPlugin("ReActions") != null;
    }

    public String getPlugin() {
        return "ReActions";
    }

    public String getAuthor() {
        return "fromgate";
    }

    public String getVersion() {
        return "0.0.1";
    }

    @Override
    public String onPlaceholderRequest(Player player, String s) {
        if (VARP.matcher(s).find()) {
            String placeholder = "%" + s + "%";
            String result = Variables.replacePlaceholders(player, placeholder);
            if (!placeholder.equals(result)) {
                return result;
            }
        }
        return EMPTY;
    }
}
