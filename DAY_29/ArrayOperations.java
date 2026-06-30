import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        int size = 0;
        int choice;

        do {
            System.out.println("\nMENU DRIVEN ARRAY OPERATIONS ");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Update Element");
            System.out.println("5. Delete Element");
            System.out.println("6. Find Largest Element");
            System.out.println("7. Find Smallest Element");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many elements do you want to insert? ");
                    size = sc.nextInt();

                    if (size > arr.length) {
                        System.out.println("Array capacity exceeded!");
                        size = 0;
                        break;
                    }

                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Elements inserted successfully.");
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array Elements: ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == search) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < size) {
                        System.out.print("Enter new value: ");
                        arr[index] = sc.nextInt();
                        System.out.println("Element updated successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex >= 0 && deleteIndex < size) {
                        for (int i = deleteIndex; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        size--;
                        System.out.println("Element deleted successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int max = arr[0];
                        for (int i = 1; i < size; i++) {
                            if (arr[i] > max)
                                max = arr[i];
                        }
                        System.out.println("Largest Element = " + max);
                    }
                    break;

                case 7:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int min = arr[0];
                        for (int i = 1; i < size; i++) {
                            if (arr[i] < min)
                                min = arr[i];
                        }
                        System.out.println("Smallest Element = " + min);
                    }
                    break;

                case 8:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}