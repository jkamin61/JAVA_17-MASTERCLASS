package org.example.reading_user_input_challenge;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadingUserInput {
    public static void main(String[] args) {
        readAndSumNumbers();
    }

    public static void readAndSumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        while (count <= 5) {
            System.out.println("Please enter #" + count);
            String nextNumber = scanner.nextLine();
            try {
                int number = parseInt(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers");
            }
        }
        System.out.println("Sum equals: " + sum);
    }
}
