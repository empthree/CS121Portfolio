package project3;

import java.util.Scanner;

public class Menu {
    private Scanner scan = new Scanner(System.in);
    private Bank bank = new Bank();

    public void run() {
        while (true) {
            System.out.println("\n*** MAIN MENU ***");
            System.out.println("\nPlease make a selection:");
            System.out.println("1. Access Account");
            System.out.println("2. Open a New Account");
            System.out.println("3. Close All Accounts");
            System.out.println("4. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    accessAccount();
                    break;
                case 2:
                    openAccount();
                    break;
                case 3:
                    closeAllAccounts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.err.println("Invalid entry!");
            }
        }
    }

    private void accessAccount() {
        System.out.println("Please enter your PIN:");
        String pin = scan.nextLine();
        Customer customer = bank.getCustByPin(pin);

        if (customer == null) {
            System.err.println("PIN is not valid.");
            return;
        }

        System.out.println(customer.getAllInfo());
        System.out.println("Enter your account number:");
        int accNum = scan.nextInt();
        scan.nextLine();
        Account account = customer.accByNum(accNum);
        if (account == null) {
            System.err.println("Account number invalid.");
            return;
        }

        while (true) {
            System.out.println("\n\nACCOUNT MENU");
            System.out.println("\nPlease make your selection:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. See account balance");
            System.out.println("4. Close account");
            System.out.println("5. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 5) {
                return;
            }


            if (choice == 1) {
                System.out.println("Enter amount:");
                double amount = scan.nextDouble();
                scan.nextLine();
                account.deposit(amount);
                System.out.println("New balance: " + account.getBalance());
            } else if (choice == 2) {
                System.out.println("Enter amount:");
                double amount = scan.nextDouble();
                scan.nextLine();
                account.withdraw(amount);
                System.out.println("New balance: " + account.getBalance());
            } else if (choice == 3) {
                System.out.println("Account balance: " + account.getBalance());
            } else if (choice == 4){
                System.out.println("Please enter the account number of the account you wish to close: ");
                String accNumber = scan.nextLine();
                customer.closeAccount(accNumber);
                System.out.printf("Account %s removed!", accNumber);
            } else System.err.println("Invalid entry.");
        }
    }

    private Customer newCustomer() {
        System.out.println("Enter your first name:");
        String first = scan.nextLine();
        System.out.println("Enter your last name:");
        String last = scan.nextLine();
        System.out.println("Enter your PIN:");
        String pin = scan.nextLine();

        Customer customer = new Customer(first, last, pin);
        bank.addCustomer(customer);
        return customer;
    }

    private void openAccount() {
        System.out.println("Are you a new customer?");
        String YN = scan.nextLine();
        Customer customer;

        if (YN.equalsIgnoreCase("yes")) {
            customer = newCustomer();
        } else if (YN.equalsIgnoreCase("no")){
            System.out.println("Enter your pin:");
            String pin = scan.nextLine();
            customer = bank.getCustByPin(pin);

            if (customer == null) {
                System.err.println("Pin is not valid.");
                return;
            }
            }else{
                System.err.println("Invalid entry. Type 'yes' or 'no'.");
                return;
            }

            System.out.println("Enter initial deposit amount:");
            double depo = scan.nextDouble();
            scan.nextLine();

            Account newAccount = new Account(depo);
            customer.addAccount(newAccount);
            System.out.println("\nNewest account opened: " + newAccount.getAccountNumber());
        }
        private void closeAllAccounts(){
            System.out.println("Enter your PIN:");
            String pin = scan.nextLine();
            Customer customer = bank.getCustByPin(pin);

            if (customer == null) {
                System.err.println("PIN is not valid.");
                return;
            }
            bank.removeCustomer(customer);
            System.err.println("Customer removed from bank registry!");
        }
    }
