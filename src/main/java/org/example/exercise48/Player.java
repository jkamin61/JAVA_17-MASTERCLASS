package org.example.exercise48;

import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }


    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(
                this.getName(),
                String.valueOf(this.getHitPoints()),
                String.valueOf(this.getStrength()),
                this.getWeapon()
        );
    }

    @Override
    public void read(List<String> reads) {
        if ( reads == null || reads.size() == 0) {
            return;
        }
        this.setName(reads.get(0));
        this.setHitPoints(Integer.parseInt(reads.get(1)));
        this.setStrength(Integer.parseInt(reads.get(2)));
        this.setWeapon(reads.get(3));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{name='" + this.getName() + "', hitPoints=" + this.getHitPoints() + ", strength=" + this.getStrength()+", weapon='"+this.getWeapon() + "'}";
    }
}
