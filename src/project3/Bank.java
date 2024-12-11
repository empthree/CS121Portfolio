package project3;

import java.util.ArrayList;

public class Bank {
    protected ArrayList<Customer> customers;

    public Bank(){
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }
    public Customer getCustByPin(String pin){
        for (Customer customer : customers){
            if (customer.getPin().equals(pin)){
                return customer;
            }
        }
        return null;
    }
    public String allCustInfo() {
        String custInfo = "";
        for (Customer customer : customers) {
            custInfo += customer.toString();
        }
        return custInfo;
    }
}
