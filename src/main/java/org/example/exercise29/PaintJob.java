package org.example.exercise29;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        double canCover = wallArea / areaPerBucket;
        double result = canCover - (double) extraBuckets;
        return (int) (Math.ceil(result));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        double canCover = wallArea / areaPerBucket;
        return (int) (Math.ceil(canCover));
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double result = area / areaPerBucket;
        return (int) Math.ceil(result);
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(6.26, 2.2)); // --> should return 3
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // --> should return 5
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // --> should return 3
    }
}
