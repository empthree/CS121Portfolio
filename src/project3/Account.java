package project3;

import java.util.Scanner;

public class Account {
    protected double balance;
    protected int accountNumber;
    protected static int numberOfAccounts = 1000;
    Scanner scan = new Scanner(System.in);

    public Account(double initialDeposit){
        this.balance = initialDeposit;
        this.accountNumber = ++numberOfAccounts;
    }

    public void deposit(double deposit) {

        balance += deposit;
        System.out.printf("\nAmount deposited: %.2f\n", deposit, "\nUpdated balance: %.2f\n", balance);
    }

    public void withdraw(double withdraw){

        if (withdraw > balance){
            System.err.println("INSUFFICIENT FUNDS");
            withdraw = 0;
        } else balance -= withdraw;
        System.out.printf("\nAmount withdrawn: %.2f\n", withdraw, "\nUpdated balance: %.2f\n", balance);

    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString() {
        return String.format("\nAccount Number: %d \nBalance: $%.2f\n", accountNumber, balance);
    }
}
