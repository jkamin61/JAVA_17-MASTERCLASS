package org.example.the_for_statement_challenge;

public class Main {
    public static void main(String[] args) {
        int primeNumbersCount = 0;
        for (int i = 30; i <= 100; i++) {
            printIsPrime(i);
            if (isPrime(i)) {
                primeNumbersCount++;
                System.out.println(primeNumbersCount + " prime numbers were found");
            }
            if (primeNumbersCount == 3) {
                System.out.println("Already found three prime numbers. Exiting program");
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printIsPrime(int wholeNumber) {
        System.out.println(wholeNumber + " is " + (isPrime(wholeNumber) ? "" : "NOT ") + "a prime number");
    }
}
