package org.example.oop_master_challenge_exercise;

public class Burger {
    public String type;
    public Size size;
    public double price;

    public Burger() {
        this.type = "Cheeseburger";
        this.size = Size.REGULAR;
        this.price = 4.99;
    }

    public Burger(String type, Size size, double price) {
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
        return "Burger{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", basePrice=" + price +
                '}';
    }
}
