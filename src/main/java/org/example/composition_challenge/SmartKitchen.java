package org.example.composition_challenge;

public class SmartKitchen extends Appliance {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean brewingState, boolean dishwashingState, boolean refrigeratingState) {
        this.brewMaster.setHasWorkToDo(brewingState);
        this.dishWasher.setHasWorkToDo(dishwashingState);
        this.iceBox.setHasWorkToDo(refrigeratingState);
        System.out.println("Changing the state of appliances..\n Coffee Maker: " + (this.brewMaster.hasWorkToDo() ? "Working" : "In idle"));
        System.out.println("Changing the state of appliances..\n Dish Washer: " + (this.dishWasher.hasWorkToDo() ? "Working" : "In idle"));
        System.out.println("Changing the state of appliances..\n Refrigerator: " + (this.iceBox.hasWorkToDo() ? "Working" : "In idle"));
    }

    public void doKitchenWork() {
        System.out.println("Setting up appliances..");
        this.brewMaster.brewCoffee();
        this.dishWasher.doDishes();
        this.iceBox.orderFood();
    }
}
