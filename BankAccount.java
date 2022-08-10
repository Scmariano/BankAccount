import java.util.Random;

public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private int accountNumber;
    public static int numAccounts = 0;
    public static double totalMoney = 0;



    public BankAccount() {
        BankAccount.numAccounts += 1;
        this.accountNumber = BankAccount.generateId();
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingBalance() {
        return this.savingsBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        }
        else {
            this.savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdrawMoney(double amount, String account) {
        if (account == "checking") {
            if (amount > this.checkingBalance) {
                System.out.println("Insuficient Funds! You only have $" + this.checkingBalance + " in your account ");
                return;
            }
            this.checkingBalance -= amount;
        }
        else {
            if (amount > this.savingsBalance) {
                System.out.println("Insuficient Funds! You only have $" + this.checkingBalance + " in your account ");
                return;
            }
            this.savingsBalance -= amount;
        }
            
    }

    public void displayBalance() {
        System.out.println(String.format("Checking: $%.2f \nSavings: $%.2f", this.checkingBalance, this.savingsBalance));
    }

    public static int generateId() {
        Random generate = new Random();
        int randomId = generate.nextInt(1000000000);
        return randomId;
    }
}