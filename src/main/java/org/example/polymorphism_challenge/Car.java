package org.example.polymorphism_challenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    protected void runEngine() {
        System.out.println("Engine running");
    }

    public void drive() {
        runEngine();
        System.out.printf("Driving %s\n", getClass().getSimpleName());
    }
}
