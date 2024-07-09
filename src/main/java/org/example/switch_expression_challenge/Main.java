package org.example.switch_expression_challenge;

public class Main {
    public static void main(String[] args) {
        printDayOfWeek(2);
        printWeekDay(2);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Outside of week numbers scope, please provide number between 1-7");
        }
    }

    public static void printWeekDay(int day) {
        if (day == 1) {
            System.out.println("It's Monday");
        } else if (day == 2) {
            System.out.println("It's Tuesday");
        } else if (day == 3) {
            System.out.println("It's Wednesday");
        } else if (day == 4) {
            System.out.println("It's Thursday");
        } else if (day == 5) {
            System.out.println("It's Friday");
        } else if (day == 6) {
            System.out.println("It's Saturday");
        } else if (day == 7) {
            System.out.println("It's Sunday");
        } else {
            System.out.println("Outside of weekdays scope. Please provide number in range 1-7");
        }
    }
}
