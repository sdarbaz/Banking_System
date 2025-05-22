// BankAccount.java
package banking;

public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdraw amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
