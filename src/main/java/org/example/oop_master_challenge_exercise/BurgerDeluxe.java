package org.example.oop_master_challenge_exercise;

public class BurgerDeluxe extends Burger {
    private boolean premiumCheese;
    private boolean premiumBacon;
    private boolean premiumMeat;

    public BurgerDeluxe(String type, Size size, double price, boolean premiumCheese, boolean premiumBacon, boolean premiumMeat) {
        super(type, size, price);
        this.premiumCheese = premiumCheese;
        this.premiumBacon = premiumBacon;
        this.premiumMeat = premiumMeat;
    }

    public BurgerDeluxe() {
        super();
        super.type = "Wagyu Burger";
        super.size = Size.EXTRA;
        super.price = 10.99;
        this.premiumCheese = true;
        this.premiumBacon = true;
        this.premiumMeat = true;
    }

    public boolean isPremiumCheese() {
        return premiumCheese;
    }

    public boolean isPremiumBacon() {
        return premiumBacon;
    }

    public boolean isPremiumMeat() {
        return premiumMeat;
    }
}
