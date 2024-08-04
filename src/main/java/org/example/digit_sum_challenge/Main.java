package org.example.digit_sum_challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(100));
        System.out.println(sumDigits(25));
        System.out.println(sumDigits(1252));
    }

    public static int sumDigits(int digit) {
        if (digit < 0) return -1;
        String digitAsString = String.valueOf(digit);
        int summedDigits = 0;
        for (char c : digitAsString.toCharArray()) {
                summedDigits += (c - '0');
        }
        return summedDigits;
    }
}
