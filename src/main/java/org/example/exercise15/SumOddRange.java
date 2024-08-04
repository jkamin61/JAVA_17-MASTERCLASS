package org.example.exercise15;

public class SumOddRange {
    public static boolean isOdd(int param) {
        if (param < 0) return false;
        if (param % 2 != 0) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println(i+"is odd, adding to count");
                count += i;
                System.out.println("Count:"+count);
            }
        }
        return count;
    }
}
