package org.example.exercise25;

public class FlourPacker {

    private static final int BIG_FLOUR_BAGS_WEIGHT = 5;

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;

        int totalBigWeight = bigCount * BIG_FLOUR_BAGS_WEIGHT;

        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_FLOUR_BAGS_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;

    }
}
