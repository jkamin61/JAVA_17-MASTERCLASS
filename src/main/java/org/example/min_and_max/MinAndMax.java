package org.example.min_and_max;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        keepTrackOfMaxAndMinVal();
    }

    public static void keepTrackOfMaxAndMinVal() {
        Scanner scan = new Scanner(System.in);
        int exit = 0;
        int max = 0;
        int min = 0;
        int loopCount = 0;
        while (exit != 1) {
            System.out.println("Enter a number to look for a min or mix value. Press any key to exit.");
            String input = scan.nextLine();
            try {
                int val = Integer.parseInt(input);
                if (loopCount == 0 || val < min) {
                    min = val;
                }
                if (loopCount == 0 || val > max) {
                    max = val;
                }
                System.out.println("Track of numbers: ");
                System.out.println("Max value: "+max);
                System.out.println("Min value: "+min);
                loopCount++;
            } catch (NumberFormatException e) {
                System.out.println("Process exit");
                exit = 1;
            }
        }
    }
}
