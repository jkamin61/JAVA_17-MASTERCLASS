package org.example.polymorphism_challenge;

import java.text.DecimalFormat;

public class HybridCar extends Car {
    private double averageKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double averageKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.averageKmPerLitre = averageKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        double fuelUsedWhileStarting = Math.random();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Fuel used for this operation: %sL. Vehicle Battery size: %d\n", df.format(fuelUsedWhileStarting), batterySize);
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("All %d cylinders working.\n",cylinders);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("Average kilometers to be driven per litre consumption: %f\n", averageKmPerLitre);
    }
}
