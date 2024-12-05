package org.example.autoboxing_challenge;

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob Stein", 500.0);
        System.out.println(bob);
        Bank dbBank = new Bank("Deutschebank");
        dbBank.addCustomer(bob.getName(), 500.0);
        dbBank.addTransaction(bob.getName(), 200.0);
    }
}
