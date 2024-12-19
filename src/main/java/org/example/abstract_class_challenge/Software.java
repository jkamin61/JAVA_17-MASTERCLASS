package org.example.abstract_class_challenge;

public class Software extends ProductForSale{
    public Software(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(String type, String description, double price) {
        System.out.println("Software product:");
        super.showDetails(type, description, price);
    }
}
