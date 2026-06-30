import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[20];
        String[] name = new String[20];
        String[] course = new String[20];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 20) {
                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Course: ");
                        course[count] = sc.nextLine();

                        count++;
                        System.out.println("Student Record Added Successfully.");
                    } else {
                        System.out.println("Record is Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Student Records Found.");
                    } else {
                        System.out.println("\nRoll No\tName\t\tCourse");
                        System.out.println("--------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + course[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == search) {
                            System.out.println("\nStudent Found:");
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Course  : " + course[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int update = sc.nextInt();
                    sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == update) {
                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Course: ");
                            course[i] = sc.nextLine();

                            System.out.println("Record Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int delete = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == delete) {
                            for (int j = i; j < count - 1; j++) {
                                rollNo[j] = rollNo[j + 1];
                                name[j] = name[j + 1];
                                course[j] = course[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Record Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}