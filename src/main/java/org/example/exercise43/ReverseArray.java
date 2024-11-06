package org.example.exercise43;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = "+Arrays.toString(array));
        int index = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (index == i) break;
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            index--;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
}
