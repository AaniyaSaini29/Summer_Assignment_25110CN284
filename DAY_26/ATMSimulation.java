 import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        boolean isRunning = true;

        System.out.println("Welcome to the ATM!");

        while (isRunning) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("Your current balance is: $%.2f\n", balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: $");
                        if (scanner.hasNextDouble()) {
                            double depositAmount = scanner.nextDouble();
                            if (depositAmount > 0) {
                                balance += depositAmount;
                                System.out.printf("Successfully deposited $%.2f\n", depositAmount);
                            } else {
                                System.out.println("Invalid amount. Deposit must be greater than zero.");
                            }
                        } else {
                            System.out.println("Invalid input.");
                            scanner.next();
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: $");
                        if (scanner.hasNextDouble()) {
                            double withdrawAmount = scanner.nextDouble();
                            if (withdrawAmount > 0 && withdrawAmount <= balance) {
                                balance -= withdrawAmount;
                                System.out.printf("Successfully withdrew $%.2f\n", withdrawAmount);
                            } else if (withdrawAmount > balance) {
                                System.out.println("Insufficient funds.");
                            } else {
                                System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                            }
                        } else {
                            System.out.println("Invalid input.");
                            scanner.next();
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); 
            }
        }
    }
}
