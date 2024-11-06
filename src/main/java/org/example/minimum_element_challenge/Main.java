package org.example.minimum_element_challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMin(readIntegers()));
    }

    public static ArrayList<Integer> readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers. To exit the program enter negative number.");

        boolean run = true;
        ArrayList<Integer> intArr = new ArrayList<>();
        while (run) {
            int temp = scanner.nextInt();
            if (temp < 0) {
                System.out.println("Exiting..");
                run = false;
            } else intArr.add(temp);
        }
        return intArr;
    }

    public static int findMin(ArrayList<Integer> arrayList) {
        return arrayList.stream().min(Integer::compare).get();
    }
}
