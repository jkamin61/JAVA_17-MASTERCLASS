package org.example.autoboxing_challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer %s was not found", customerName);
        return null;
    }

    public void addCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.printf("Customer %s added", customerName);
        }
        System.out.printf("Customer %s already has an account", customerName);
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions.add(transactionAmount);
            System.out.printf("Transaction for customer %s completed. Amount: %f", name, transactionAmount);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
