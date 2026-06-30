import java.util.Scanner;

public class StudentManagementSystem {

    static int[] roll = new int[20];
    static String[] name = new String[20];
    static String[] course = new String[20];
    static double[] marks = new double[20];

    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n STUDENT MANAGEMENT SYSTEM ");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Topper");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    displayTopper();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 7);
    }

    static void addStudent() {

        if(count == 20) {
            System.out.println("Record Full!");
            return;
        }

        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Course: ");
        course[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;

        System.out.println("Student Added Successfully.");
    }

    static void displayStudents() {

        if(count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nRoll\tName\tCourse\tMarks");

        for(int i=0;i<count;i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + course[i] + "\t" + marks[i]);
        }
    }

    static void searchStudent() {

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for(int i=0;i<count;i++) {

            if(roll[i] == r) {

                System.out.println("Student Found");
                System.out.println("Roll : " + roll[i]);
                System.out.println("Name : " + name[i]);
                System.out.println("Course : " + course[i]);
                System.out.println("Marks : " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    static void updateStudent() {

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<count;i++) {

            if(roll[i] == r) {

                System.out.print("Enter New Name: ");
                name[i] = sc.nextLine();

                System.out.print("Enter New Course: ");
                course[i] = sc.nextLine();

                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextDouble();

                System.out.println("Record Updated.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    static void deleteStudent() {

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for(int i=0;i<count;i++) {

            if(roll[i] == r) {

                for(int j=i;j<count-1;j++) {

                    roll[j] = roll[j+1];
                    name[j] = name[j+1];
                    course[j] = course[j+1];
                    marks[j] = marks[j+1];
                }

                count--;

                System.out.println("Record Deleted.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    static void displayTopper() {

        if(count == 0) {
            System.out.println("No Records Available.");
            return;
        }

        int index = 0;

        for(int i=1;i<count;i++) {

            if(marks[i] > marks[index]) {
                index = i;
            }
        }

        System.out.println("\nTopper Details");
        System.out.println("Roll Number : " + roll[index]);
        System.out.println("Name        : " + name[index]);
        System.out.println("Course      : " + course[index]);
        System.out.println("Marks       : " + marks[index]);
    }
}