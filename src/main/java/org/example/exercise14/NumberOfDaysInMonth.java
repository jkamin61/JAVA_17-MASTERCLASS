package org.example.exercise14;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Number out of range. Please provide number in range 1 - 9999");
            return false;
        }
        if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is not a leap year");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        if (isLeapYear(year)) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> throw new IllegalStateException("Unexpected value: " + month);
            };
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> throw new IllegalStateException("Unexpected value: " + month);
            };
        }
    }
}
