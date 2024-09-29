package org.example.polymorphism_challenge;

import java.text.DecimalFormat;

public class ElectricCar extends Car {
    private double averageKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double averageKmPerCharge, int batterSize) {
        super(description);
        this.averageKmPerCharge = averageKmPerCharge;
        this.batterySize = batterSize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Vehicle Battery size: %dkwH\n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine running");
    }

    @Override
    public void drive() {
        super.drive();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Average kilometers to be driven per battery charge: %s\n", df.format(averageKmPerCharge));
    }
}
