package org.example.exercise13;

public class NumberInWord {
    public static void printNumberInWord(int number) {
        String message;
        switch (number) {
            case 0 -> message = "ZERO";
            case 1 -> message = "ONE";
            case 2 -> message = "TWO";
            case 3 -> message = "THREE";
            case 4 -> message = "FOUR";
            case 5 -> message = "FIVE";
            case 6 -> message = "SIX";
            case 7 -> message = "SEVEN";
            case 8 -> message = "EIGHT";
            case 9 -> message = "NINE";
            default -> message = "OTHER";
        }
        System.out.println(message);
    }
}
