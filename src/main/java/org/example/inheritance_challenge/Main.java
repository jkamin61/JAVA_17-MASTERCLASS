package org.example.inheritance_challenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1995","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+tim.getAge());
        System.out.println("Pay = "+tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","03/03/2020",50211);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $ "+joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $ "+ joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970","03/03/2012",20);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $ "+mary.collectPay());
        System.out.println("Mary's holiday paycheck = $ "+mary.getDoublePay());
    }
}
