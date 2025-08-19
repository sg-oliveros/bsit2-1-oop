public class BankAccount {

    public static final String bankName = "Liceo Bank";
    public static int totalAccounts = 0;
    private static final double interestRate = 0.03;

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    private static String generateAccountNumber() {
        totalAccounts++;
        return "ACC00" + totalAccounts;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(accountHolderName + "'s interest: $" + interest);
    }

    public void displayAccountInfo(){
        System.out.println("Account Created: " + this.accountNumber + " for " + this.accountHolderName + " with initial balance: $" + this.balance);
    }
}