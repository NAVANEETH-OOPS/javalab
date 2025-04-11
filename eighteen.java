import java.util.Scanner;

class eighteen {
    private double balance;
    private String accountType;
    private double interestRate;
    private double minBalance;
    private double serviceCharge;

    // Constructor for Savings Account
    public eighteen(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
        if (accountType.equals("Saving")) {
            this.interestRate = 0.05; // 5% interest for saving accounts
        } else if (accountType.equals("Current")) {
            this.minBalance = 1000.0; // Minimum balance requirement for Current Account
            this.serviceCharge = 50.0; // Service charge if balance falls below minBalance
        }
    }

    // Accept deposit from a customer and update the balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    // Display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Compute and deposit interest for Savings Account
    public void computeInterest() {
        if (accountType.equals("Saving")) {
            double interest = balance * interestRate;
            balance += interest;
            System.out.println("Interest of " + interest + " has been added to your balance.");
            displayBalance();
        } else {
            System.out.println("Interest cannot be applied to Current Account.");
        }
    }

    // Permit withdrawal and update the balance
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
    }

    // Check for minimum balance, impose penalty if necessary, and update balance for Current Account
    public void checkMinBalance() {
        if (accountType.equals("Current")) {
            if (balance < minBalance) {
                double penalty = serviceCharge;
                balance -= penalty;
                System.out.println("Your balance is below the minimum required. A penalty of " + penalty + " has been imposed.");
                displayBalance();
            }
        } else {
            System.out.println("Minimum balance check is not applicable for Saving Account.");
        }
    }
}

public class eighty{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select account type
        System.out.print("Enter account type (Saving/Current): ");
        String accountType = scanner.nextLine();
        BankAccount account = new BankAccount(accountType);

        int choice;
        do {
            // Display menu options
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Display Balance");
            System.out.println("3. Compute Interest (Savings only)");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Minimum Balance (Current only)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2: // Display Balance
                    account.displayBalance();
                    break;

                case 3: // Compute Interest
                    account.computeInterest();
                    break;

                case 4: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 5: // Check Minimum Balance
                    account.checkMinBalance();
                    break;

                case 6: // Exit
                    System.out.println("Exiting... Thank you for using the bank services.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        // Close the scanner object
        scanner.close();
    }
}


