package model;
import java.util.ArrayList;
import java.util.List;
import model.Transaction;
import exception.InsufficientFundsException;
import java.util.Collections;

public class BankAccount {
    private final String accountId;
    private final String ownerName;
    private double balance;
    private final List<Transaction> transactions;   //List is an interface. ArrayList is one specific implementation of that interface. By declaring the type as List you keep your options open:
    private static int  totalAccounts = 0;

    public BankAccount(String accountId, String ownerName, double initialBalance) {
         if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        totalAccounts++;
        
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount, balance));
    }


    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount, balance);
        } 
        balance -= amount;
        transactions.add(new Transaction("WITHDRAWAL", amount, balance));
        
    }
        

    public String getAccountId() {
            return accountId;
        }

    public String getOwnerName() {
            return ownerName;
        }

    public double getBalance() {
            return balance;
        }

    public static int getTotalAccounts() {
            return totalAccounts;
        }

    public List<Transaction> getTransactionHistory() {
            return Collections.unmodifiableList(transactions);
        }
   
    public void printStatement() {
            System.out.println("== Statement: " + ownerName + "===");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
            System.out.printf("Current balance: $%.2f%n", balance);
    }

        @Override
        public String toString() {
             return String.format("Account[%s | %s | $%.2f]", accountId, ownerName, balance);
    }
}

