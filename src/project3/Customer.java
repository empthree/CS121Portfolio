package project3;

import java.util.ArrayList;

public class Customer {
    protected String firstName;
    protected String lastName;
    protected String pin;
    protected ArrayList<Account> accounts;

    public Customer(String firstName, String lastName, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account accNumber){
        accounts.add(accNumber);
        System.out.printf("\nAccount " + accNumber +" added! \nTotal accounts: %d", accounts.size());

    }
    public void closeAccount(String accNumber) {
        accounts.remove(accNumber);
    }

        public Account accByNum(int accNumber) {
        for (Account account : accounts){
            if(account.getAccountNumber() == accNumber){
                return account;
            }
        }
        return null;
    }

    public String getAllInfo() {
        String info = "";
        for (Account account : accounts){
            info += account.toString();
        }
        return info;
    }

    public String getPin(){
        return pin;
    }
    @Override
    public String toString() {
        return String.format("\nCustomer name: %s %s \nCustomer pin: %s", firstName,lastName,pin);
    }
}
