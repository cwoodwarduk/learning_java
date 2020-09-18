package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("6783242", 2000, "Calum", "email@example.com", "07459101943");

        System.out.println("Account no: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBankBalance());
        System.out.println("Name: " + myAccount.getCustomerName());
        System.out.println("Email: " + myAccount.getEmail());
        System.out.println("Phone no: " + myAccount.getPhoneNumber());

        System.out.println(myAccount.depositFunds(150));
        System.out.println(myAccount.withdrawFunds(2150));

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());
    }
}
