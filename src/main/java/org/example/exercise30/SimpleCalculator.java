package org.example.exercise30;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }

    public void setSecondNumber(double value) {
        this.secondNumber = value;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calc1 = new SimpleCalculator();
        calc1.setFirstNumber(10);
        calc1.setSecondNumber(5);
        System.out.println(calc1.getAdditionResult());
        System.out.println(calc1.getSubtractionResult());
        System.out.println(calc1.getDivisionResult());
        System.out.println(calc1.getMultiplicationResult());
    }
}
