package org.example.exercise42;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int intFromUser = scanner.nextInt();
        return intFromUser;
    }

    private static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] arrayOfElements = new int[numberOfElements];

        while (count < numberOfElements) {
            int element = scanner.nextInt();
            arrayOfElements[count] = element;
            count++;
        }

        return arrayOfElements;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
