package com.company;

public class BankAccount {
    private String accountNumber;
    private double bankBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Fields can be initialised in variables without setters
    // within a constructor method (as in the accountNumber below).
    // However using setters within a constructor method allows
    // for validation and sanitisation of data.

    // Which method is better is a point of contention in Java,
    // however generally speaking direct initialisation (like in the
    // account number example) is considered better practice.
    public BankAccount(String accountNumber, double bankBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        setBankBalance(bankBalance);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    // Constructor classes can be overloaded
    // and constructor classes can call other constructor classes
    // in order to initialise fields with default values
    // where variables are not given by parameters.
    public BankAccount() {
        this("123456", 0.00, "J Doe", "email@example.com", "0123456789");
    }

    // IntelliJ shortcut for creating constructors:
    // Code > Generate > Constructor > choose params > OK
    // Will use direct field value assignment.

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBankBalance() {
        return this.bankBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankBalance (double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String depositFunds (double depositAmount) {
        this.bankBalance += depositAmount;
        return "Successfully deposited $" + depositAmount + ". Your new balance is $" + this.bankBalance + ".";
    }

    public String withdrawFunds (double withdrawalAmount) {
        if (withdrawalAmount > this.bankBalance) {
            return "Sorry, you have insufficient funds.";
        }

        this.bankBalance -= withdrawalAmount;
        return "Your new balance is $" + this.bankBalance + ".";
    }

}
