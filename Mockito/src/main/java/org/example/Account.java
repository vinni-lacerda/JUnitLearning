package org.example;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void payBill(int amountToPay) {
        validateBalance(amountToPay);
        debit(amountToPay);
        sendCreditToIssuer(amountToPay);
    }

    public void validateBalance(int amountToPay) {
        if (amountToPay > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
    }

    public void debit(int amountToPay) {
        this.balance = this.balance - amountToPay;
    }

    public void sendCreditToIssuer(int amountToPay) {
        // sends the amount to the bill issuer
    }
}