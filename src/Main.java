public class Main{
    public static void main(String[]args){
                System.out.println("Bank Name: " + BankAccount.bankName);
                System.out.println("Interest Rate: 3.0%\n");

                BankAccount account1 = new BankAccount("John Doe", 1000.0);
                BankAccount account2 = new BankAccount("Jane Smith", 2500.0);
                BankAccount account3 = new BankAccount("Bob Johnson", 500.0);

                account1.displayAccountInfo();
                account2.displayAccountInfo();
                account3.displayAccountInfo();

                System.out.println("\n=== Account Operations ===");
                account1.deposit(500.0);
                account2.withdraw(300.0);

                System.out.println("\n=== Interest Calculation ===");
                account1.calculateInterest();
                account2.calculateInterest();
                account3.calculateInterest();

                System.out.println("\nTotal Accounts Created: " +BankAccount.totalAccounts);
            }
        }
