package org.example.arraylist_challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:
                """;
        System.out.println(menu);
        int exit = 0;
        ArrayList<String> list = new ArrayList<>();
        while (exit != 1) {
            int option = scanner.nextInt();
            if (option == 0) {
                System.out.println("Exiting program..");
                exit = 1;
            }
            if (option == 1) {
                System.out.println("Enter element to be added to list:");
                String element = scanner.next();
                if (list.contains(element)) {
                    System.out.println("No duplicates allowed");
                } else {
                    list.add(element);
                    System.out.printf("Added %s to the list:\n", element);
                    list.sort(Comparator.naturalOrder());
                    System.out.println(list);
                    System.out.println(menu);
                }
            }
            if (option == 2) {
                System.out.println(list);
                System.out.println("Enter element to be deleted:");
                String elementToBeDeleted = scanner.next();
                if (list.remove(elementToBeDeleted)) {
                    System.out.printf("Deleted %s from the list:\n", elementToBeDeleted);
                    list.sort(Comparator.naturalOrder());
                    System.out.println(list);
                    System.out.println(menu);
                } else {
                    System.out.printf("%s is not in the list", elementToBeDeleted);
                    System.out.println(menu);
                }
            }

        }
    }
}
