public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accNo) {
        this.accountHolderName = name;
        this.accountNumber = accNo;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: ₹" + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}
