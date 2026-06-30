import java.util.*;

public class BankAccountSystem {
    private static final Bank bank = new Bank();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bank.loadFromDisk();
        System.out.println("=== Bank Account Management System ===");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": openAccount(); break;
                case "2": closeAccount(); break;
                case "3": deposit(); break;
                case "4": withdraw(); break;
                case "5": transfer(); break;
                case "6": checkBalance(); break;
                case "7": viewHistory(); break;
                case "8": listAllAccounts(); break;
                case "0":
                    bank.saveToDisk();
                    System.out.println("Data saved. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Open New Account");
        System.out.println("2. Close Account");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Transfer Funds");
        System.out.println("6. Check Balance");
        System.out.println("7. View Transaction History");
        System.out.println("8. List All Accounts");
        System.out.println("0. Save & Exit");
        System.out.print("Choose an option: ");
    }

    private static String prompt(String label) {
        System.out.print(label);
        return scanner.nextLine().trim();
    }

    private static double promptDouble(String label) {
        while (true) {
            try {
                double val = Double.parseDouble(prompt(label));
                if (val < 0) {
                    System.out.println("Amount cannot be negative.");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // ---------- Authentication helper ----------

    private static Account authenticate() {
        String accNum = prompt("Account number: ");
        Account acc = bank.getAccount(accNum);
        if (acc == null) {
            System.out.println("Account not found.");
            return null;
        }
        String pin = prompt("PIN: ");
        if (!acc.checkPin(pin)) {
            System.out.println("Incorrect PIN.");
            return null;
        }
        return acc;
    }

    // ---------- Actions ----------

    private static void openAccount() {
        String name = prompt("Account holder name: ");
        String pin = prompt("Set a 4-digit PIN: ");
        System.out.println("Account type: 1) Savings  2) Current");
        String typeChoice = prompt("Choose type: ");
        Account.AccountType type = typeChoice.equals("2")
                ? Account.AccountType.CURRENT
                : Account.AccountType.SAVINGS;
        double opening = promptDouble("Opening deposit amount: $");

        Account acc = bank.openAccount(name, pin, type, opening);
        System.out.println("Account created successfully! Your account number is: " + acc.getAccountNumber());
    }

    private static void closeAccount() {
        Account acc = authenticate();
        if (acc == null) return;
        if (acc.getBalance() != 0) {
            System.out.printf("Cannot close account: balance must be $0.00 (current: $%.2f). Withdraw remaining funds first.%n",
                    acc.getBalance());
            return;
        }
        bank.closeAccount(acc.getAccountNumber());
        System.out.println("Account closed successfully.");
    }

    private static void deposit() {
        Account acc = authenticate();
        if (acc == null) return;
        double amount = promptDouble("Deposit amount: $");
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        acc.deposit(amount);
        System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, acc.getBalance());
    }

    private static void withdraw() {
        Account acc = authenticate();
        if (acc == null) return;
        double amount = promptDouble("Withdraw amount: $");
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if (acc.withdraw(amount)) {
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, acc.getBalance());
        } else {
            System.out.println("Insufficient funds (or overdraft limit exceeded).");
        }
    }

    private static void transfer() {
        Account from = authenticate();
        if (from == null) return;
        String toAccNum = prompt("Destination account number: ");
        double amount = promptDouble("Transfer amount: $");
        String result = bank.transfer(from.getAccountNumber(), toAccNum, amount);
        System.out.println(result);
    }

    private static void checkBalance() {
        Account acc = authenticate();
        if (acc == null) return;
        System.out.printf("Account: %s | Holder: %s | Balance: $%.2f%n",
                acc.getAccountNumber(), acc.getHolderName(), acc.getBalance());
    }

    private static void viewHistory() {
        Account acc = authenticate();
        if (acc == null) return;
        if (acc.getHistory().isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("\nTransaction history for " + acc.getAccountNumber() + ":");
        acc.getHistory().forEach(System.out::println);
    }

    private static void listAllAccounts() {
        if (bank.getAllAccounts().isEmpty()) {
            System.out.println("No accounts yet.");
            return;
        }
        System.out.println("\nAcc#         | Holder               | Type     | Balance");
        System.out.println("-".repeat(65));
        for (Account acc : bank.getAllAccounts()) {
            System.out.println(acc);
        }
    }
}
