package net.pyshicon.classes.rpgclass.skill;

public class InvisibleSneak {

    private String name = "Invisible Sneak";
    private static String id = "invisible_sneak";
    private int cooldown;

    public InvisibleSneak(int cooldown) {
        this.cooldown = cooldown;
    }

    public String getName() {
        return name;
    }

    public static String getId() {
        return id;
    }

    public int getCooldown() {
        return cooldown;
    }
}
