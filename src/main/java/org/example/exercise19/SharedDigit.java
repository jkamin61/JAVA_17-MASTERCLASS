package org.example.exercise19;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,21));
    }

    public static boolean hasSharedDigit(int param1, int param2) {
        boolean firstValid = param1 > 9 && param1 < 100;
        boolean secondValid = param2 > 9 && param2 < 100;

        if (!firstValid || !secondValid) return false;

        int firstLeftDigit = param1 / 10;
        int firstRightDigit = param1 % 10;

        int secondLeftDigit = param2 / 10;
        int secondRightDigit = param2 % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }
}
