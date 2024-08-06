package org.example.exercise17;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(243)); //5
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int last = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        return last + number;
    }
}
