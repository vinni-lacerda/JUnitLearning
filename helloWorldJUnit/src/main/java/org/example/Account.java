package org.example;

public class Account {
    private String accountNumber;
    private double value;

    public Account(String accountNumber, double value) {
        this.accountNumber = accountNumber;
        this.value = value;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
