package org.example.polymorphism_challenge;

public class Main {
    public static void main(String[] args) {
        Car toyota = new GasPoweredCar("Toyota Corolla 2012", 12.0, 4);
        toyota.startEngine();
        toyota.drive();

        Car tesla = new ElectricCar("Tesla S 2023", 600.0, 100);
        tesla.startEngine();
        tesla.drive();

        Car honda = new HybridCar("Honda CRV 2018", 30.0, 1, 4);
        honda.startEngine();
        honda.drive();
    }
}
