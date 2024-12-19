package org.example.abstract_class_challenge;

public class Hardware extends ProductForSale{
    public Hardware(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(String type, String description, double price) {
        System.out.println("Hardware product:");
        super.showDetails(type, description, price);
    }
}
