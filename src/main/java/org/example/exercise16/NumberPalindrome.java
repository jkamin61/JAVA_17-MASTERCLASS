package org.example.exercise16;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(777));
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (original != 0) {
            reverse = reverse * 10;
            reverse = reverse + (original % 10);
            original /= 10;
        }

        return reverse == number;
    }
}
