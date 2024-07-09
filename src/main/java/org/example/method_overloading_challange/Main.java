package org.example.method_overloading_challange;

public class Main {
    public static void main(String[] args) {
        convertToCentimeters(6);
        convertToCentimeters(6, 11);
    }

    public static double convertToCentimeters(int feet) {
        System.out.println(feet + " feet equals: " + ((feet * 12) * 2.54) + " centimeters");
        return (feet * 12) * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        double parsedFeetToCentimeters = (feet * 12) * 2.54;
        double parsedInchesToCentimeters = inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches equals: " + ((parsedFeetToCentimeters + parsedInchesToCentimeters)) + " centimeters");
        return parsedFeetToCentimeters + parsedInchesToCentimeters;
    }
}

