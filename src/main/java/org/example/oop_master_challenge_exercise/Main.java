package org.example.oop_master_challenge_exercise;

public class Main {
    public static void main(String[] args) {
        Burger hamburger = new Burger("Hamburger", Size.EXTRA, 5.99);
        Drink sprite = new Drink("Sprite", Size.EXTRA, 2.99);
        SideItem fries = new SideItem("Fries", Size.EXTRA, 2.25);
        //EXTRA HAMBURGER ORDER
        MealOrder hamburgerOrderExtra = new MealOrder(hamburger, fries, sprite);
        hamburgerOrderExtra.printOrderList();
        hamburgerOrderExtra.getTotal();
        hamburgerOrderExtra.addTopping("Bacon");
        hamburgerOrderExtra.addTopping("Garlic sauce");
        System.out.println("Toppings: " + hamburgerOrderExtra.getToppings());
        //REGULAR ORDER
        MealOrder casualOrder = new MealOrder();
        casualOrder.printOrderList();
        casualOrder.getTotal();
        casualOrder.addTopping("Roasted Onion");
        System.out.println("Toppings: " + casualOrder.getToppings());
        //BURGER DELUXE
        BurgerDeluxe wagyu = new BurgerDeluxe();
        SideItem friedShark = new SideItem("Fried shark slices", Size.EXTRA, 8.50);
        Drink shake = new Drink("Shake carmel popcorn", Size.EXTRA, 5.50);
        MealOrder burgerDeluxe = new MealOrder(wagyu, friedShark, shake);
        burgerDeluxe.printOrderList();
        burgerDeluxe.getTotal();
        burgerDeluxe.addTopping("Jalapeno");
        System.out.println("Toppings: "+burgerDeluxe.getToppings());
    }
}
