package org.example.seconds_and_minutes_challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(5, 945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Wrong parameter value for seconds(" + seconds + "), must be a positive integer value.";
        }
        int minutes = seconds / 60;
        return getDurationString(minutes / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Wrong parameter value for minutes(" + minutes + "), must be a positive integer value.";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "Wrong parameter value for seconds( " + seconds + "), must be in range between 0 and 59";
        }
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }
}
