package org.example.exercise18;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int original = number;
        int sumOfEvens = 0;
        while (original != 0) {
            if ((original % 10) % 2 == 0 ) {
                sumOfEvens = sumOfEvens + (original % 10);
            }
            original /= 10;
        }
        return sumOfEvens;
    }
}
