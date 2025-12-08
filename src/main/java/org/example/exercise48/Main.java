package org.example.exercise48;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player owen = new Player("Owen", 100,25);
        System.out.println(owen);
        owen.read(Arrays.asList("Owen","99", "25", "Spike"));
        owen.write();
        owen.read(null);
        owen.write();
    }
}
