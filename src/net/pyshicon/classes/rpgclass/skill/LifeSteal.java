package net.pyshicon.classes.rpgclass.skill;

public class LifeSteal {

    private String name = "Life Steal";
    private static String id = "life_steal";
    private int steal_rate;
    private int chance;

    public LifeSteal(int steal_rate, int chance) {
        this.steal_rate = steal_rate;
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public static String getId() {
        return id;
    }

    public int getStealRate() {
        return steal_rate;
    }

    public int getChance() {
        return chance;
    }
}
