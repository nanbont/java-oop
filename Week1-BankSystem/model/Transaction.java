package model;

import java.time.LocalDateTime;


public class Transaction {

    private final String type;
    private final double amount;
    private final double balanceAfter;
    private final LocalDateTime timeStamp;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.timeStamp = LocalDateTime.now();
    }

    
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    //[2024-01-15] DEPOSIT: $500.00 | Balance: $1500.00


    @Override
    public String toString() {
        return String.format("[%s] %s: $%.2f | Balance: $%.2f", 
                timeStamp.toLocalDate(), type, amount, balanceAfter);
    }

}