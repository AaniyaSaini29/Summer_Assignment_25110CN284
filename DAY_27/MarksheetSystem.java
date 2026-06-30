import java.util.ArrayList;
import java.util.Scanner;

class Marksheet {
    private String rollNumber;
    private String name;
    private int math;
    private int science;
    private int english;

    public Marksheet(String rollNumber, String name, int math, int science, int english) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void display() {
        int total = math + science + english;
        double percentage = (total / 300.0) * 100;
        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("             OFFICIAL MARKSHEET            ");
        System.out.println("-------------------------------------------");
        System.out.println("ROLL NUMBER: " + rollNumber.toUpperCase());
        System.out.println("STUDENT NAME: " + name.toUpperCase());
        System.out.println("-------------------------------------------");
        System.out.println("SUBJECT          MAX MARKS   OBTAINED MARKS");
        System.out.println("-------------------------------------------");
        System.out.println("MATH             100         " + math);
        System.out.println("SCIENCE          100         " + science);
        System.out.println("ENGLISH          100         " + english);
        System.out.println("-------------------------------------------");
        System.out.println("TOTAL MARKS: 300             OBTAINED: " + total);
        System.out.printf("PERCENTAGE: %.2f%%\n", percentage);
        System.out.println("FINAL GRADE: " + grade);
        System.out.println("-------------------------------------------");
    }
}

public class MarksheetSystem {
    public static void main(String[] args) {
        ArrayList<Marksheet> sheets = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MARKSHEET GENERATION SYSTEM ---");
            System.out.println("1. GENERATE NEW MARKSHEET");
            System.out.println("2. VIEW ALL GENERATED MARKSHEETS");
            System.out.println("3. SEARCH MARKSHEET BY ROLL NUMBER");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER ROLL NUMBER: ");
                        String roll = input.nextLine().trim();
                        System.out.print("ENTER STUDENT NAME: ");
                        String name = input.nextLine().trim();
                        
                        int math = -1;
                        int science = -1;
                        int english = -1;
                        
                        while (math < 0 || math > 100) {
                            System.out.print("ENTER MARKS FOR MATH (0-100): ");
                            if (input.hasNextInt()) {
                                math = input.nextInt();
                                if (math < 0 || math > 100) {
                                    System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 100.");
                                }
                            } else {
                                System.out.println("INVALID INPUT. ENTER A NUMBER.");
                                input.next();
                            }
                        }
                        
                        while (science < 0 || science > 100) {
                            System.out.print("ENTER MARKS FOR SCIENCE (0-100): ");
                            if (input.hasNextInt()) {
                                science = input.nextInt();
                                if (science < 0 || science > 100) {
                                    System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 100.");
                                }
                            } else {
                                System.out.println("INVALID INPUT. ENTER A NUMBER.");
                                input.next();
                            }
                        }
                        
                        while (english < 0 || english > 100) {
                            System.out.print("ENTER MARKS FOR ENGLISH (0-100): ");
                            if (input.hasNextInt()) {
                                english = input.nextInt();
                                if (english < 0 || english > 100) {
                                    System.out.println("INVALID MARKS. MUST BE BETWEEN 0 AND 100.");
                                }
                            } else {
                                System.out.println("INVALID INPUT. ENTER A NUMBER.");
                                input.next();
                            }
                        }
                        input.nextLine();

                        sheets.add(new Marksheet(roll, name, math, science, english));
                        System.out.println("MARKSHEET GENERATED SUCCESSFULLY!");
                        break;

                    case 2:
                        if (sheets.isEmpty()) {
                            System.out.println("NO MARKSHEETS GENERATED YET.");
                        } else {
                            for (Marksheet sheet : sheets) {
                                sheet.display();
                            }
                        }
                        break;

                    case 3:
                        if (sheets.isEmpty()) {
                            System.out.println("NO RECORDS TO SEARCH.");
                            break;
                        }
                        System.out.print("ENTER ROLL NUMBER TO SEARCH: ");
                        String searchRoll = input.nextLine().trim();
                        boolean found = false;
                        
                        for (Marksheet sheet : sheets) {
                            if (sheet.getRollNumber().equalsIgnoreCase(searchRoll)) {
                                sheet.display();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("MARKSHEET WITH ROLL NUMBER " + searchRoll.toUpperCase() + " NOT FOUND.");
                        }
                        break;

                    case 4:
                        System.out.println("EXITING SYSTEM. GOODBYE!");
                        running = false;
                        break;

                    default:
                        System.out.println("INVALID CHOICE. ENTER A NUMBER BETWEEN 1 AND 4.");
                }
            } else {
                System.out.println("INVALID INPUT. ENTER A VALID MENU NUMBER.");
                input.nextLine();
            }
        }
    }
}