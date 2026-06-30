import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        String str, str1, str2;

        do {
            System.out.println("\n MENU DRIVEN STRING OPERATIONS");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Compare Two Strings");
            System.out.println("6. Concatenate Two Strings");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a String: ");
                    str = sc.nextLine();
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.print("Enter a String: ");
                    str = sc.nextLine();
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 3:
                    System.out.print("Enter a String: ");
                    str = sc.nextLine();
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 4:
                    System.out.print("Enter a String: ");
                    str = sc.nextLine();

                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    System.out.println("Reversed String: " + reverse);
                    break;

                case 5:
                    System.out.print("Enter First String: ");
                    str1 = sc.nextLine();

                    System.out.print("Enter Second String: ");
                    str2 = sc.nextLine();

                    if (str1.equals(str2)) {
                        System.out.println("Strings are Equal.");
                    } else {
                        System.out.println("Strings are Not Equal.");
                    }
                    break;

                case 6:
                    System.out.print("Enter First String: ");
                    str1 = sc.nextLine();

                    System.out.print("Enter Second String: ");
                    str2 = sc.nextLine();

                    System.out.println("Concatenated String: " + str1.concat(str2));
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}