package com.company;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, Double transaction) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(transaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
        System.out.println("Transaction complete.");
    }

}
