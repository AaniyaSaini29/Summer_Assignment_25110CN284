import java.util.Scanner;

public class MiniLibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bookName = new String[20];
        String[] author = new String[20];
        boolean[] issued = new boolean[20];

        int count = 0;
        int choice;

        do {
            System.out.println("\nMINI LIBRARY SYSTEM");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 20) {
                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        author[count] = sc.nextLine();

                        issued[count] = false;
                        count++;

                        System.out.println("Book Added Successfully.");
                    } else {
                        System.out.println("Library is Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nBook Name\t\tAuthor\t\tStatus");
                        System.out.println("------------------------------------------------");

                        for (int i = 0; i < count; i++) {
                            System.out.println(bookName[i] + "\t\t" + author[i] +
                                    "\t\t" + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found!");
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author    : " + author[i]);
                            System.out.println("Status    : " +
                                    (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Book Name to Issue: ");
                    String issue = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(issue)) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book is Already Issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Book Name to Return: ");
                    String ret = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(ret)) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully.");
                            } else {
                                System.out.println("Book was not Issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 6:
                    System.out.println("Thank you for using the Mini Library System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}