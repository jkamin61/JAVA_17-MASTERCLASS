package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {21, 41, 121, 56, 129, 43};
        System.out.println(Arrays.toString(bubbleSort(arr1)));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return arr;
    }


}
