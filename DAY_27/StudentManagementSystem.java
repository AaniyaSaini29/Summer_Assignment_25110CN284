import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "ID: " + id + " \n| NAME: " + name + " \n| GPA: " + gpa;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- STUDENT RECORD MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD STUDENT");
            System.out.println("2. VIEW ALL STUDENTS");
            System.out.println("3. SEARCH STUDENT BY ID");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE(1-4): ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER STUDENT ID: ");
                        String id = input.nextLine().trim();
                        System.out.print("ENTER STUDENT NAME: ");
                        String name = input.nextLine().trim();
                        System.out.print("ENTER STUDENT GPA: ");
                        
                        if (input.hasNextDouble()) {
                            double gpa = input.nextDouble();
                            input.nextLine();
                            
                            if (gpa >= 0.0 && gpa <= 10.0) {
                                students.add(new Student(id, name, gpa));
                                System.out.println("STUDENT RECORD ADDED SUCCESSFULLY!");
                            } else {
                                System.out.println("INVALID GPA. PLEASE ENTER A VALUE BETWEEN 0.0 AND 10.0.");
                            }
                        } else {
                            System.out.println("INVALID INPUT. GPA MUST BE A DECIMAL NUMBER.");
                            input.nextLine();
                        }
                        break;

                    case 2:
                        if (students.isEmpty()) {
                            System.out.println("NO RECORDS FOUND.");
                        } else {
                            System.out.println("\n--- CURRENT STUDENT RECORDS ---");
                            for (Student student : students) {
                                System.out.println(student);
                            }
                        }
                        break;

                    case 3:
                        if (students.isEmpty()) {
                            System.out.println("NO RECORDS AVAILABLE TO SEARCH.");
                            break;
                        }
                        System.out.print("ENTER STUDENT ID TO SEARCH: ");
                        String searchId = input.nextLine().trim();
                        boolean found = false;
                        
                        for (Student student : students) {
                            if (student.getId().equalsIgnoreCase(searchId)) {
                                System.out.println("RECORD FOUND: " + student);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("STUDENT WITH ID " + searchId + " NOT FOUND.");
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