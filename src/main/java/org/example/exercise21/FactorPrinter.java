package org.example.exercise21;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(10);
    }
    public static void printFactors(int param) {
        if (param < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= param; i++) {
            if (param % i == 0) {
                System.out.println(i);
            }
        }
    }
}
