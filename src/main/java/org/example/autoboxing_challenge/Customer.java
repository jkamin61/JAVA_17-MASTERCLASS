package org.example.autoboxing_challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
