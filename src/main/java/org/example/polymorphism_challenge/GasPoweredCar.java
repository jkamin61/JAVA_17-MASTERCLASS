package org.example.polymorphism_challenge;

import java.text.DecimalFormat;

public class GasPoweredCar extends Car {
    private double averageKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double averageKmPerLitre, int cylinders) {
        super(description);
        this.averageKmPerLitre = averageKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        double fuelUsedWhileStarting = Math.random();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Fuel used for this operation: %sL\n", df.format(fuelUsedWhileStarting));
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("All %d cylinders working.\n",cylinders);
    }

    @Override
    public void drive() {
        super.drive();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Average kilometers to be driven per litre consumption: %s\n",df.format(averageKmPerLitre));
    }
}
