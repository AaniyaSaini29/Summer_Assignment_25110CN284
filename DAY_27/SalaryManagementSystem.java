import java.util.ArrayList;
import java.util.Scanner;

class SalaryRecord {
    private String id;
    private String name;
    private double baseSalary;
    private double allowances;
    private double deductions;

    public SalaryRecord(String id, String name, double baseSalary, double allowances, double deductions) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public String getId() {
        return id;
    }

    public double getNetSalary() {
        return baseSalary + allowances - deductions;
    }

    @Override
    public String toString() {
        return "ID: " + id.toUpperCase() + 
               " \n| NAME: " + name.toUpperCase() + 
               " \n| BASE SALARY: $" + baseSalary + 
               " \n| ALLOWANCES: $" + allowances + 
               " \n| DEDUCTIONS: $" + deductions + 
               " \n| NET SALARY: $" + getNetSalary();
    }
}

public class SalaryManagementSystem {
    public static void main(String[] args) {
        ArrayList<SalaryRecord> records = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- SALARY MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD SALARY RECORD");
            System.out.println("2. VIEW ALL SALARY SLIPS");
            System.out.println("3. SEARCH SALARY BY EMPLOYEE ID");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER EMPLOYEE ID: ");
                        String id = scanner.nextLine().trim();
                        System.out.print("ENTER EMPLOYEE NAME: ");
                        String name = scanner.nextLine().trim();
                        
                        double baseSalary = 0;
                        double allowances = 0;
                        double deductions = 0;
                        boolean validSalary = false;

                        while (!validSalary) {
                            System.out.print("ENTER BASE SALARY: ");
                            if (scanner.hasNextDouble()) {
                                baseSalary = scanner.nextDouble();
                                validSalary = true;
                            } else {
                                System.out.println("INVALID INPUT. ENTER A VALID NUMBER.");
                                scanner.next();
                            }
                        }

                        boolean validAllowances = false;
                        while (!validAllowances) {
                            System.out.print("ENTER ALLOWANCES: ");
                            if (scanner.hasNextDouble()) {
                                allowances = scanner.nextDouble();
                                validAllowances = true;
                            } else {
                                System.out.println("INVALID INPUT. ENTER A VALID NUMBER.");
                                scanner.next();
                            }
                        }

                        boolean validDeductions = false;
                        while (!validDeductions) {
                            System.out.print("ENTER DEDUCTIONS: ");
                            if (scanner.hasNextDouble()) {
                                deductions = scanner.nextDouble();
                                validDeductions = true;
                            } else {
                                System.out.println("INVALID INPUT. ENTER A VALID NUMBER.");
                                scanner.next();
                            }
                        }
                        scanner.nextLine();

                        records.add(new SalaryRecord(id, name, baseSalary, allowances, deductions));
                        System.out.println("SALARY RECORD ADDED SUCCESSFULLY!");
                        break;

                    case 2:
                        if (records.isEmpty()) {
                            System.out.println("NO RECORDS FOUND.");
                        } else {
                            System.out.println("\n--- CURRENT SALARY RECORDS ---");
                            for (SalaryRecord record : records) {
                                System.out.println(record);
                            }
                        }
                        break;

                    case 3:
                        if (records.isEmpty()) {
                            System.out.println("NO RECORDS AVAILABLE TO SEARCH.");
                            break;
                        }
                        System.out.print("ENTER EMPLOYEE ID TO SEARCH: ");
                        String searchId = scanner.nextLine().trim();
                        boolean found = false;

                        for (SalaryRecord record : records) {
                            if (record.getId().equalsIgnoreCase(searchId)) {
                                System.out.println("RECORD FOUND: " + record);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("EMPLOYEE WITH ID " + searchId.toUpperCase() + " NOT FOUND.");
                        }
                        break;

                    case 4:
                        System.out.println("EXITING SYSTEM. GOODBYE!");
                        running = false;
                        break;

                    default:
                        System.out.println("INVALID CHOICE. PLEASE ENTER A NUMBER BETWEEN 1 AND 4.");
                }
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A VALID MENU NUMBER.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}