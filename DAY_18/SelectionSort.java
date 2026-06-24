import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr,int n ) { 

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("ELEMENT " + (i + 1) + " = ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nBEFORE SORTING:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        selectionSort(arr,num);

        System.out.println("\nAFTER SELECTION SORT:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
     
    }
}
    
