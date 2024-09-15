package org.example.classes_challenge;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(121);
        account1.setName("Jack Dandee");
        account1.setBalance(20400);
        account1.getBalance();
        account1.withdrawFunds(1000);
        account1.depositFunds(20000);
    }
}
