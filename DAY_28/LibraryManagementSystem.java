import java.util.Scanner;

public class LibraryManagementSystem {
    private static final Library library = new Library();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        library.loadFromDisk();
        System.out.println("Library Management System");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": addBook(); break;
                case "2": removeBook(); break;
                case "3": listBooks(); break;
                case "4": searchBooks(); break;
                case "5": addMember(); break;
                case "6": removeMember(); break;
                case "7": listMembers(); break;
                case "8": borrowBook(); break;
                case "9": returnBook(); break;
                case "10": listTransactions(); break;
                case "11": listOverdue(); break;
                case "0":
                    library.saveToDisk();
                    System.out.println("Data saved");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nMenu");
        System.out.println(" 1. Add Book");
        System.out.println(" 2. Remove Book");
        System.out.println(" 3. List Books");
        System.out.println(" 4. Search Books");
        System.out.println(" 5. Add Member");
        System.out.println(" 6. Remove Member");
        System.out.println(" 7. List Members");
        System.out.println(" 8. Borrow Book");
        System.out.println(" 9. Return Book");
        System.out.println("10. List All Transactions");
        System.out.println("11. List Overdue Loans");
        System.out.println(" 0. Save & Exit");
        System.out.print("Choose an option: ");
    }

    private static String prompt(String label) {
        System.out.print(label);
        return scanner.nextLine().trim();
    }

    private static int promptInt(String label) {
        while (true) {
            try {
                return Integer.parseInt(prompt(label));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    //Book actions

    private static void addBook() {
        String isbn = prompt("ISBN: ");
        String title = prompt("Title: ");
        String author = prompt("Author: ");
        int copies = promptInt("Number of copies: ");
        boolean isNew = library.addBook(isbn, title, author, copies);
        System.out.println(isNew
                ? "Book added successfully."
                : "ISBN already existed; copies merged into existing record.");
    }

    private static void removeBook() {
        String isbn = prompt("ISBN to remove: ");
        boolean ok = library.removeBook(isbn);
        System.out.println(ok ? "Book removed." : "Cannot remove (not found or copies still on loan).");
    }

    private static void listBooks() {
        System.out.println("\nISBN         | Title                          | Author               | Avail/Total");
        System.out.println("-".repeat(85));
        for (Book b : library.getAllBooks()) {
            System.out.println(b);
        }
    }

    private static void searchBooks() {
        String kw = prompt("Search keyword (title/author/ISBN): ");
        List<Book> results = library.searchBooks(kw);
        if (results.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            results.forEach(System.out::println);
        }
    }

    // Member actions

    private static void addMember() {
        String id = prompt("Member ID: ");
        String name = prompt("Name: ");
        String email = prompt("Email: ");
        boolean ok = library.addMember(id, name, email);
        System.out.println(ok ? "Member added." : "Member ID already exists.");
    }

    private static void removeMember() {
        String id = prompt("Member ID to remove: ");
        boolean ok = library.removeMember(id);
        System.out.println(ok ? "Member removed." : "Cannot remove (not found or has borrowed books).");
    }

    private static void listMembers() {
        System.out.println("\nID         | Name                 | Email                     | Borrowed");
        System.out.println("-".repeat(75));
        for (Member m : library.getAllMembers()) {
            System.out.println(m);
        }
    }

    // Borrow or Return 

    private static void borrowBook() {
        String isbn = prompt("ISBN to borrow: ");
        String memberId = prompt("Member ID: ");
        System.out.println(library.borrowBook(isbn, memberId));
    }

    private static void returnBook() {
        String isbn = prompt("ISBN to return: ");
        String memberId = prompt("Member ID: ");
        System.out.println(library.returnBook(isbn, memberId));
    }

    private static void listTransactions() {
        if (library.getAllTransactions().isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        library.getAllTransactions().forEach(System.out::println);
    }

    private static void listOverdue() {
        List<Transaction> overdue = library.getOverdueTransactions();
        if (overdue.isEmpty()) {
            System.out.println("No overdue loans.");
        } else {
            overdue.forEach(System.out::println);
        }
    }
}

