package org.example.abstract_class_challenge;

public abstract class Product {
    protected String type;
    public double price;
    public String description;

    public Product(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    abstract void showDetails(String type, String description, double price);
}
