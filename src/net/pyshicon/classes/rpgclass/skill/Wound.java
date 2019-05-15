package net.pyshicon.classes.rpgclass.skill;

public class Wound {

    private String name = "Wound";
    private static String id = "wound";
    private int duration;
    private int chance;

    public Wound(int duration, int chance) {
        this.duration = duration;
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public static String getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public int getChance() {
        return chance;
    }
}
