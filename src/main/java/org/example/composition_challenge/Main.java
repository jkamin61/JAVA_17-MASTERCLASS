package org.example.composition_challenge;

public class Main {
    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);
        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getIceBox().orderFood();

        smartKitchen.setKitchenState(false,false,false);
        smartKitchen.doKitchenWork();
    }
}
