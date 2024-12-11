package weekNine;

import java.util.Random;

public class BankAccount {
    // instance variables
    private String firstName;
    private String lastName;
    private int age;
    private String accountType;
    private double initialDeposit;
    private String customerID;
    private String accountConfirmationNumber;

    // regular constructor
    public BankAccount(String firstName, String lastName, int age, String accountType, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.accountType = accountType;
        this.initialDeposit = initialDeposit;
        this.accountConfirmationNumber = generateAccountConfirmationNumber();
    }

    // premium constructor
    public BankAccount(String customerID, String accountType) {
        this.customerID = customerID;
        this.accountType = accountType;
        this.accountConfirmationNumber = generateAccountConfirmationNumber();
    }

    // account ID
    private String generateAccountConfirmationNumber() {
        Random rand = new Random();
        int number = rand.nextInt(100000);
        return "ACCOUNT " + number;
    }

    // regular display
    public void displayAccountInfo() {
        if (customerID != null) {
            System.out.println("Customer ID: " + customerID);
            System.out.println("Account Type: " + accountType);
            System.out.println("Account Confirmation Number: " + accountConfirmationNumber);
        } else {
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Account Type: " + accountType);
            System.out.println("Initial Deposit: $" + initialDeposit);
            System.out.println("Account Confirmation Number: " + accountConfirmationNumber);
        }
    }
}