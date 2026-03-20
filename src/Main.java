import model.BankAccount;
import model.SavingsAccount;
import exception.InsufficientFundsException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("12345", "Nanbon Tadele",1000.00);
        BankAccount account2 = new  BankAccount("890", "Unkura Tadele",2000.00);

       
        account1.deposit(500.00);
        try {
            account1.withdraw(200.00);
            account1.withdraw(1500.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        account1.printStatement();
        account2.printStatement();

        SavingsAccount savings = new SavingsAccount("54321", "Saba Tadele", 3000.00);
        try {
            savings.withdraw(500.00);
            savings.withdraw(500.00);
            savings.withdraw(500.00);
            savings.withdraw(500.00); // This should throw an exception
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }


        System.out.println("Withdrawals remaining: " + savings.getWithdrawalsRemaining());
        savings.printStatement();


        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(account1);
      
        accounts.add(savings);
        accounts.forEach(System.out::println);
       

       System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}

