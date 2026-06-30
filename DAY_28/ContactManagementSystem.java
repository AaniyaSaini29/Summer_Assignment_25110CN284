import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("----------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
    }
}

public class ContactManagementSystem {

    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Management System ");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact(name, phone, email));
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts Available.");
                    } else {
                        for (Contact c : contacts) {
                            c.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(search)) {
                            c.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String delete = sc.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).name.equalsIgnoreCase(delete)) {
                            contacts.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Contact Deleted Successfully.");
                    } else {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
