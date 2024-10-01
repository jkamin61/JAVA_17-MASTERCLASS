package org.example.oop_master_challenge_exercise;

import java.util.ArrayList;

public class MealOrder {
    private Burger burger;
    private SideItem sideItem;
    private Drink drink;
    private static int orderId = 0;
    private int currentOrderId;
    private ArrayList<String> toppings = new ArrayList<String>();

    public MealOrder() {
        this.burger = new Burger("Cheeseburger", Size.REGULAR, 2.99);
        this.sideItem = new SideItem("Fries", Size.REGULAR, 0.99);
        this.drink = new Drink("Coke", Size.REGULAR, 1.50);
        this.currentOrderId = orderId++;
    }

    public MealOrder(Burger burger, SideItem sideItem, Drink drink) {
        this.burger = burger;
        this.sideItem = sideItem;
        this.drink = drink;
        this.currentOrderId = orderId++;
    }

    public void printOrderList() {
        System.out.printf("""
                List for order number: %d
                Burger: %s size: %s
                Side item: %s size: %s
                Drink: %s size: %s
                """, orderId, burger.getType(), burger.getSize(), sideItem.getType(), sideItem.getSize(), drink.getType(), drink.getSize());
    }

    public double getTotal() {
        return burger.getPrice() + sideItem.getPrice() + drink.getPrice();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "MealOrder{" +
                "burger=" + burger +
                ", sideItem=" + sideItem +
                ", drink=" + drink +
                '}';
    }
}
