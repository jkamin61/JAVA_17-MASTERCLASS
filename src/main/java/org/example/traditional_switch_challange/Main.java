package org.example.traditional_switch_challange;

public class Main {
    public static void main(String[] args) {
        System.out.println(natoAlphabetTransmission('s'));
        System.out.println(natoAlphabetTransmission('f'));
        System.out.println(natoAlphabetTransmission('g'));
    }

    public static String natoAlphabetTransmission(char character) {
        return switch (character) {
            case 'A', 'a' -> "Able";
            case 'B', 'b' -> "Baker";
            case 'C', 'c' -> "Charlie";
            case 'D', 'd' -> "Dog";
            case 'E', 'e' -> "Easy";
            case 'F', 'f' -> "Fox";
            case 'G', 'g' -> "George";
            case 'H', 'h' -> "How";
            case 'I', 'i' -> "Item";
            case 'J', 'j' -> "Jig";
            case 'K', 'k' -> "King";
            case 'L', 'l' -> "Love";
            case 'M', 'm' -> "Mike";
            case 'N', 'n' -> "Nan";
            case 'O', 'o' -> "Oboe";
            case 'P', 'p' -> "Peter";
            case 'Q', 'q' -> "Queen";
            case 'R', 'r' -> "Roger";
            case 'S', 's' -> "Sugar";
            case 'T', 't' -> "Sugar";
            case 'U', 'u' -> "Tare";
            case 'V', 'v' -> "Victor";
            case 'W', 'w' -> "Uncle";
            case 'X', 'x' -> "X-ray";
            case 'Y', 'y' -> "Yoke";
            case 'Z', 'z' -> "Zebra";
            default -> "Character " + character + "does not exist in NATO alphabet";
        };
    }
}
