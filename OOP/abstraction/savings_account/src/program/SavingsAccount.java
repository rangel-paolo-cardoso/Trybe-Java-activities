package program;

public class SavingsAccount {
    private double balance;
    private String holder;

    public SavingsAccount(String holder, double initialDeposit) {
        this.holder = holder;
        this.balance = initialDeposit;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public double showBalance() {
        return balance;
    }

    public String showAccountHolder() {
        return holder;
    }
}
