package org.example;

public class TransferBetweenAccounts {
    public void transfer(Account originAccount, Account destinyAccount, int value){
        if(value <= 0){
            throw new IllegalArgumentException("Value should be more than 0");
        }
    }
}
