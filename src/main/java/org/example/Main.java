package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    Deposit: Adds to balance (with error check)
//    Withdraw: Subtracts from balance (with error check)
//    Display Information:Prints account info
//    Get Account Number: Returns account number (used for searching)

    private static void createAccount(ArrayList<BankAccount> accounts, int accountNumber, String accountName) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bank Menu ===");
        System.out.println("1. Create Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Check Balance");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");

        int choice;
        System.out.print("Enter choice: ");
        choice = scanner.nextInt();
        ArrayList<BankAccount> accounts = new ArrayList<>();

        do {
            switch (choice) {
                case 1 -> {
                    // create account
                }
                case 2 -> {
                    // view all accounts
                }
                case 3 -> {
                    // check balance
                }
                case 4 -> {
                    // deposit
                }
                case 5 -> {
                    // withdraw
                }
                default -> {
                    // exit
                    System.out.println("---Thank you!---");
                    return;
                }
            }
        } while (choice != 6);

    }

}