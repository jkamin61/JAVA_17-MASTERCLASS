package org.example.sum_3_and_5_challenge;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is dividable both by 3 and 5");
                sum += i;
                count++;
            }
            if (count == 5) {
                System.out.println("Ending program. 5 numbers have been already found meeting the requirements.");
                break;
            }
        }
        System.out.println("Sum of numbers that meet the requirements: " + sum);
    }
}
