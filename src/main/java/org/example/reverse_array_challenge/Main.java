package org.example.reverse_array_challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        reverseArray(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void reverseArray(int[] array) {
        int index = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (index == i) break;
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            index--;
        }
    }
}
