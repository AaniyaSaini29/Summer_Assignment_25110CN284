import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id.toUpperCase() + " \n| NAME: " + name.toUpperCase() + " \n| DEPARTMENT: " + department.toUpperCase() + " \n| SALARY: " + salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- EMPLOYEE MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. VIEW ALL EMPLOYEES");
            System.out.println("3. SEARCH EMPLOYEE BY ID");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER EMPLOYEE ID: ");
                        String id = input.nextLine().trim();
                        System.out.print("ENTER EMPLOYEE NAME: ");
                        String name = input.nextLine().trim();
                        System.out.print("ENTER EMPLOYEE DEPARTMENT: ");
                        String department = input.nextLine().trim();
                        System.out.print("ENTER EMPLOYEE SALARY: ");
                        
                        if (input.hasNextDouble()) {
                            double salary = input.nextDouble();
                            input.nextLine();
                            employees.add(new Employee(id, name, department, salary));
                            System.out.println("EMPLOYEE RECORD ADDED SUCCESSFULLY!");
                        } else {
                            System.out.println("INVALID INPUT. SALARY MUST BE A NUMBER.");
                            input.nextLine();
                        }
                        break;

                    case 2:
                        if (employees.isEmpty()) {
                            System.out.println("NO RECORDS FOUND.");
                        } else {
                            System.out.println("\n--- CURRENT EMPLOYEE RECORDS ---");
                            for (Employee employee : employees) {
                                System.out.println(employee);
                            }
                        }
                        break;

                    case 3:
                        if (employees.isEmpty()) {
                            System.out.println("NO RECORDS AVAILABLE TO SEARCH.");
                            break;
                        }
                        System.out.print("ENTER EMPLOYEE ID TO SEARCH: ");
                        String searchId = input.nextLine().trim();
                        boolean found = false;
                        
                        for (Employee employee : employees) {
                            if (employee.getId().equalsIgnoreCase(searchId)) {
                                System.out.println("RECORD FOUND: " + employee);
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
                input.nextLine();
            }
        }
    }
}