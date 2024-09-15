package org.example.classes_challenge;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;

    public int getAccountNumber() {
        System.out.println("Account number: " + accountNumber);
        return accountNumber;
    }

    public double getBalance() {
        System.out.println("Current balance = " + balance);
        return balance;
    }

    public String getName() {
        System.out.println("Name of account holder: " + name);
        return name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositFunds(double amount) {
        System.out.println("Depositing " + amount);
        this.balance += amount;
        getBalance();
    }

    public void withdrawFunds(double amount) {
        if (this.balance < 0) {
            System.out.println("No funds on an account");
            return;
        }
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds. Current balance = " + this.balance);
            return;
        }
        System.out.println("Withdrawing " + amount);
        this.balance -= amount;
        getBalance();
    }
}
