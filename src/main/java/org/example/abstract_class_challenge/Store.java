package org.example.abstract_class_challenge;

import java.util.ArrayList;

record OrderItem(ProductForSale product, int quantity) {
}

public class Store {
    ArrayList<ProductForSale> products = new ArrayList<>();
    ArrayList<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void addItemToStore(ProductForSale product) {
        products.add(product);
        System.out.println("Product: " + product.getType() + " added to store's products for sale");
    }

    public void addItemToOrder(ProductForSale product, int quantity) {
        order.add(new OrderItem(product, quantity));
        System.out.println("Product: " + product.getType() + " added to your order");
    }

    public void printOrderItems() {
        for (OrderItem orderItem : order) {
            System.out.println("Item in order: "+orderItem.product().getType()+" quantity: "+orderItem.quantity());
        }
    }
}
