import java.util.Scanner;   
public class BankingSystem {
    private double balance;

    public BankingSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Your balance is $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Your new balance is $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystem account = new BankingSystem(1000.0); // Initial balance

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
