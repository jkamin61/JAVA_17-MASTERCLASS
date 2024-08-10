package org.example.exercise20;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int value1, int value2, int value3) {
        boolean areNumbersInRange = value1 >= 10 && value1 <= 1000 && value2 >= 10 && value2 <= 1000 && value3 >= 10 && value3 <= 1000;

        if (!areNumbersInRange) {
            return false;
        }

        int firstValueLastDigit = value1 % 10;
        int secondValueLastDigit = value2 % 10;
        int thirdValueLastDigit = value3 % 10;

        if (firstValueLastDigit == secondValueLastDigit || firstValueLastDigit == thirdValueLastDigit || secondValueLastDigit == thirdValueLastDigit || firstValueLastDigit == secondValueLastDigit && secondValueLastDigit == thirdValueLastDigit) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int param) {
        if (param >= 10 && param <= 1000) {
            return true;
        } else return false;
    }


}
