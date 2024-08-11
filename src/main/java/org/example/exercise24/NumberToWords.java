package org.example.exercise24;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(-222);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int leadingZeroes = getDigitCount(number) - getDigitCount(reversedNumber);

        while (reversedNumber != 0) {

            int lastNumberInInt = reversedNumber % 10;
            String lastNumberInString = "";
            switch (lastNumberInInt) {
                case 1 -> lastNumberInString = "One";
                case 2 -> lastNumberInString = "Two";
                case 3 -> lastNumberInString = "Three";
                case 4 -> lastNumberInString = "Four";
                case 5 -> lastNumberInString = "Five";
                case 6 -> lastNumberInString = "Six";
                case 7 -> lastNumberInString = "Seven";
                case 8 -> lastNumberInString = "Eight";
                case 9 -> lastNumberInString = "Nine";
                case 0 -> lastNumberInString = "Zero";
                default -> System.out.println("Invalid Number");
            }
            System.out.println(lastNumberInString);
            reversedNumber /= 10;
        }
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int original = number;
        int reversed = 0;
        while (original != 0) {
            reversed += original % 10;
            original /= 10;
            reversed *= 10;
        }
        return reversed / 10;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        if (number == 0) return 1;

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
