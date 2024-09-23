package org.example.composition_challenge;

public class DishWasher extends Appliance{
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes() {
        System.out.println("Doing dishes..");
        setHasWorkToDo(true);
    }
}
