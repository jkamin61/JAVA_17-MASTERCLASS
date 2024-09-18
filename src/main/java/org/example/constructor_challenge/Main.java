package org.example.constructor_challenge;

public class Main {
    public static void main(String[] args) {
        Customer example = new Customer();
        System.out.println(example);
        Customer eric = new Customer("Eric", 21000, "eric@test.com");
        System.out.println(eric);
        Customer patrick = new Customer("Patrick","patrick@test.com");
        System.out.println(patrick);
    }
}
