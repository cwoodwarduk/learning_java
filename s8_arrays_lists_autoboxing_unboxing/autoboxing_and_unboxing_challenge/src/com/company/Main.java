package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("HSBC");

        bank.addNewBranch("Seoul");

        bank.addCustomerToBranch("Seoul", "Calum", 1435.00);
        bank.addCustomerToBranch("Seoul", "Yeebee", 2706.00);

        bank.addNewBranch("Reading");
        bank.addCustomerToBranch("Reading", "Wooster", 498.54);

        bank.addCustomerTransaction("Seoul", "Calum", 34.55);
        bank.addCustomerTransaction("Seoul", "Yeebee", 84.55);
        bank.addCustomerTransaction("Reading", "Wooster", 15.55);

        bank.listCustomers("Seoul", true);

        bank.listCustomers("Reading", true);

        if(!bank.addCustomerToBranch("Grand Cayman", "Liam", 4565.67)){
            System.out.println("Error: Grand Cayman branch does not exist.");
        }

        if(!bank.addNewBranch("Reading")) {
            System.out.println("Reading branch already exists.");
        }
    }
}
