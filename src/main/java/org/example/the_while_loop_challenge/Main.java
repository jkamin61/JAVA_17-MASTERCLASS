package org.example.the_while_loop_challenge;

public class Main {
    public static void main(String[] args) {
        int i = 4;
        int evenCount = 0;
        int oddCount = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                evenCount++;
                oddCount++;
                System.out.println(i + " is even number");
            }
            i++;
            if (evenCount == 5) {
                System.out.println("Found 5 even numbers and "+oddCount+" odd numbers");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
