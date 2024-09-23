package org.example.composition_challenge;

public class CoffeeMaker extends Appliance{
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee() {
        System.out.println("Brewing coffee..");
        setHasWorkToDo(true);
    }
}
