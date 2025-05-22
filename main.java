package banking;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an account
        BankAccount account = new BankAccount(1000);

        try {
            // Deposit test
            System.out.print("Enter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            System.out.println("Deposit successful. Balance: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Deposit check completed.\n");
        }

        try {
            // Withdraw test
            account.withdraw(5000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Insufficient funds check completed.\n");
        }

        System.out.println("Thank you for using the Banking System!");
        sc.close();
    }
}
