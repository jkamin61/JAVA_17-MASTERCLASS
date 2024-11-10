package org.example.linked_list_challenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place sydney = new Place("Sydney", 0);
        placesToVisit.add(sydney);

        Place adelaide = new Place("Adelaide", 1374);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place brisbane = new Place("Brisbane", 917);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        Place perth = new Place("Perth", 3923);

        addPlaces(placesToVisit, adelaide);
        addPlaces(placesToVisit, aliceSprings);
        addPlaces(placesToVisit, brisbane);
        addPlaces(placesToVisit, darwin);
        addPlaces(placesToVisit, melbourne);
        addPlaces(placesToVisit, perth);

        boolean exit = false;
        String options = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
        while (!exit) {
            System.out.println(options);
            var iterator = placesToVisit.listIterator();
            char menu = scanner.next().charAt(0);
            if (menu == 'Q' || menu == 'q') {
                System.out.println("Exiting..");
                exit = true;
            }
            if (menu == 'F' || menu == 'f') {
                System.out.println(iterator.next());
            }
            if (menu == 'B' || menu == 'b') {
                if (iterator.hasPrevious()) {
                    System.out.println(iterator.previous());
                } else System.out.println("No previous elements");
            }
            if (menu == 'L' || menu == 'l') {
                System.out.println(placesToVisit);

            }
            if (menu == 'M' || menu == 'm') {
                System.out.println(options);
            }

        }
    }

    private static void addPlaces(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("No duplicates allowed");
            return;
        }

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().distance() > place.distance()) {
                iterator.previous();
                iterator.add(place);
                return;
            }
        }

        list.add(place);
    }


}
