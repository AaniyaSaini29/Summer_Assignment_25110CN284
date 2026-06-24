import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr,int n ) {
        
       
        for (int i = 0; i < n - 1; i++) {
           
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                   
                }
            }
            
            
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

        bubbleSort(arr,num);

        System.out.println("\nAFTER BUBBLE SORT:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
       

    }
}

