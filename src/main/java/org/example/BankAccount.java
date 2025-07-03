package org.example;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double accountBalance = 0;

    public BankAccount (int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public BankAccount (int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void displayInfo() {
        System.out.println();
        System.out.printf("Account Number: %d\n", accountNumber);
        System.out.printf("Account Name: %s\n", accountName);
        System.out.printf("Account Balance: %.2f\n", accountBalance);
        System.out.println("--- End of Account List ---");

    }
}
