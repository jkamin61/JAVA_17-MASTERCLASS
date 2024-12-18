package org.example.abstract_class_challenge;

public class ProductForSale extends Product {

    public ProductForSale(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(String type, String description, double price) {
        System.out.printf("Type: %s, price: %f, description: %s", type, price, description);
    }

    public String getType() {
        return this.type;
    }

    public double getSalesPrice(double price, int quantity) {
        return price * quantity;
    }

    public void printPricedItem(ProductForSale product, int quantity) {
        System.out.printf("Product: " + product.getType() + ", quantity: " + quantity + ", price per item: " + product.price + ", total cost: " + product.getSalesPrice(product.price, quantity));
    }
}
