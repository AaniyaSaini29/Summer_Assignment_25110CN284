import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter words separated by spaces (first array): ");
        String str1 = input.nextLine();
        String[] arr1 = str1.split("\\s+");

        System.out.print("Enter words separated by spaces (second array): ");
        String str2 = input.nextLine();
        String[] arr2 = str2.split("\\s+");

        System.out.println("FIRST ARRAY:");
        for (String word : arr1) {
            System.out.print(word+" ");
        }

        System.out.println("\nSECOND ARRAY:");
        for (String word : arr2) {
            System.out.print(word+" ");
        }

        String[] merge = new String[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].compareTo(arr2[j]) <= 0) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merge[k++] = arr2[j++];
        }

        System.out.println("\nMERGED ARRAY:");
        for (String word : merge) {
            System.out.print(word+" ");
        }
    }
}