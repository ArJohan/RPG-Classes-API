package net.pyshicon.classes.rpgclass;

import org.bukkit.entity.Player;

import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Set;

public class RPGClassManager {

    public static void addClass(RPGClass rpgClass) {}

    public static void removeClass(RPGClass rpgClass) {}

    public static RPGClass getClass(String id) {
        return null;
    }

    public static ArrayList<RPGClass> getClasses() {
        return null;
    }

    public static boolean hasClass() {
        return false;
    }

    public static void writeClass(RPGClass rpgClass) {}

    public static void saveClasses() {}

    public static void loadClasses() {}

    public static Set<String> getIds() {
        return null;
    }

    public static RPGClass getPlayerClass(Player player) {
        return null;
    }

    public static String getPlayerStorageClass(Player player) {
        return null;
    }

    public static void setPlayerClass(Player player, RPGClass rpgClass) { }

    public static void removePlayerClass(Player player) {}

    public static void savePlayerClass(Player player) {}

    public static void loadPlayerClass(Player player) { }

    public static void savePlayersClass() {}

    public static void loadPlayersClass() {}

    public static double calculateDamageFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateDefenseFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateWalkspeedFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateEvasionChanceFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateBlockFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateBlockChanceFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateCriticalFormula(Player player) throws ScriptException {
        return 0;
    }

    public static double calculateCriticalChanceFormula(Player player) throws ScriptException {
        return 0;
    }

    public static void setupConfig() {}
}
