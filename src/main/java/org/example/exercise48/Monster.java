package org.example.exercise48;

import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        return List.of(
                this.getName(),
                String.valueOf(this.getHitPoints()),
                String.valueOf(this.getStrength())
        );
    }

    @Override
    public void read(List<String> reads) {
        if (reads == null || reads.size() == 0) {
            return;
        }
        this.name = reads.get(0);
        this.hitPoints = Integer.parseInt(reads.get(1));
        this.strength = Integer.parseInt(reads.get(2));
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + "'" + name + "'," + '\'' +
                ", hitPoints=" + hitPoints + "," +
                ", strength=" + strength +
                '}';
    }
}
