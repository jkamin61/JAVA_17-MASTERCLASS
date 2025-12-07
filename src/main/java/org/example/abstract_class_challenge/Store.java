package org.example.abstract_class_challenge;

import java.util.ArrayList;

record OrderItem(ProductForSale product, int quantity) {
}

public class Store {
    static ArrayList<ProductForSale> products = new ArrayList<>();
    static ArrayList<OrderItem> order = new ArrayList<>();

    public static void addItemToStore(ProductForSale product) {
        products.add(product);
        System.out.println("Product: " + product.getType() + " added to store's products for sale");
    }

    public static void addItemToOrder(ProductForSale product, int quantity) {
        order.add(new OrderItem(product, quantity));
        System.out.println("Product: " + product.getType() + " added to your order");
    }

    public static void printStoreInventory() {
        System.out.println("Products in store inventory:");
        System.out.print("[ \n");
        for (ProductForSale product : products) {
            System.out.print("{Product: " + product.getType() + ", description: " + product.description + ", price: " + product.price + "}\n");
        }
        System.out.print(" ]\n");
    }

    public static void printOrderItems() {
        for (OrderItem orderItem : order) {
            System.out.println("Item in order: " + orderItem.product().getType() + " quantity: " + orderItem.quantity());
        }
    }

    public static void main(String[] args) {
        Software microsoftOffice = new Software("Microsoft Office package", 400.99, "Package with all the tools provided by Microsoft");
        addItemToStore(microsoftOffice);
        printStoreInventory();
        addItemToOrder(microsoftOffice, 3);
        printOrderItems();
    }
}
