package org.example.exercise6;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        double value1 = (long) (firstValue * 1000);
        double value2 = (long) (secondValue * 1000);
        return value1 == value2;

    }
}
