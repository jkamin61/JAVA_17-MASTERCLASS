package org.example.oop_master_challenge_exercise;

public class SideItem {
    private String type;
    private Size size;
    private double price;

    public SideItem(String type, Size size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
