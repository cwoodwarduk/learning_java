package com.company;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, Double initialFunds ) {

        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialFunds));
            return true;
        }

        return false;

//        System.out.println("Customer " + customerName + " has been added to the " +
//                branchName + " branch with initial funds of " + initialFunds + "." );
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer == null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return true;
    }

    private Customer findCustomer(String customerName) {
        for(int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(this.customers.get(i).getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;

    }


}
