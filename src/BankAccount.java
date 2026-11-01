/**
 * Encapsulation practice: a simple bank account.
 * The balance is private and can only change through deposit() and withdraw(),
 * which validate their input.
 */
public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.owner = owner;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false; // not allowed: invalid amount or not enough money
        }
        balance -= amount;
        return true;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Shahzaib", 1000);
        account.deposit(500);
        System.out.println("After deposit: " + account.getBalance());

        boolean ok = account.withdraw(2000);
        System.out.println("Withdraw 2000 allowed? " + ok);

        account.withdraw(300);
        System.out.println(account.getOwner() + "'s balance: " + account.getBalance());
    }
}
