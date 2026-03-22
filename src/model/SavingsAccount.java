package model;
import model.BankAccount; 
import exception.InsufficientFundsException;

public class SavingsAccount extends BankAccount {
    private final int monthlyWithdrawalLimit;
    private int withdrawalsThisMonth;


    public SavingsAccount(String accountId, String ownerName, double initialBalance) {
        super(accountId, ownerName, initialBalance);
        this.monthlyWithdrawalLimit = 3;
        this.withdrawalsThisMonth = 0;

    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (withdrawalsThisMonth >= monthlyWithdrawalLimit) {
            throw new IllegalStateException("Monthly withdrawal limit reached.");
        }

        super.withdraw(amount);
        withdrawalsThisMonth++;

    
    }

    public void resetMonthlyWithdrawals() {
        withdrawalsThisMonth = 0;
    }

    public int getWithdrawalsRemaining() {
        return monthlyWithdrawalLimit - withdrawalsThisMonth;
    }


}