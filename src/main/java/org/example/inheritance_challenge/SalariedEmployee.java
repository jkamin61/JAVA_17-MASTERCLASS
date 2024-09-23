package org.example.inheritance_challenge;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private final double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        LocalDate localDate = LocalDate.now();
        terminate(localDate.toString());
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
}
