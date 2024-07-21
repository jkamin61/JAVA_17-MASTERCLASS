package org.example.exercise14;

public class Main {
    public static void main(String[] args) {
        NumberOfDaysInMonth.isLeapYear(1400);
        NumberOfDaysInMonth.isLeapYear(2000);
        NumberOfDaysInMonth.isLeapYear(1400);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(12, 2000));
    }
}
