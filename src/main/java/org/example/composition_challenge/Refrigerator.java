package org.example.composition_challenge;

public class Refrigerator extends Appliance{
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void orderFood() {
        System.out.println("Ordering food..");
        setHasWorkToDo(true);
    }
}
