package src;

    

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;
    private boolean active;

    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.active = false;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    // Business Methods
    public void openAccount() {
        this.active = true;
        this.balance = 0;
    }

    public boolean closeAccount() {
        if (balance != 0) {
            return false;
        }
        this.active = false;
        return true;
    }

    public boolean deposit(double amount) {
        if (!active || amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (!active || amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account Holder: " + accountHolder +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nActive: " + active;
    }
}