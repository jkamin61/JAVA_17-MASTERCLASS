package org.example.exercise26;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
        public static int getLargestPrime(int number) {
            if (number < 2) return -1;

            int factor = -1;

            for (int i = 2; i * i <= number; i++) {
                if (number % i != 0) {
                    continue;
                }
                factor = i;
                while (number % i == 0) {
                    number /= i;
                }
            }

            return number == 1 ? factor : number;
        }
    }

    //My version, wrong because of additional method
//
//    public static int getLargestPrime(int number) {
//        if (number < 0 || number == 0 || number == 1) return -1;
//
//        int prime = -1;
//
//        for (int i = 1; i <= number; i++) {
//           if (number % i == 0 && isPrime(i)) {
//               prime = i;
//           }
//        }
//
//        return prime;
//    }
//
//    public static boolean isPrime(int number) {
//        if (number <= 1) return false;
//
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

