import java.util.Scanner;

public class BinarySearch {
     public static int binary(int[] arr,int num, int target) {
        int left = 0;
        int right = num-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
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

        System.out.println("\nENTER THE TARGET ELEMENT TO SEARCH: ");
        int target = input.nextInt();
        

        System.out.print("\nTHE TARGET ELEMENT IS AT ELEMENT NO.");
        int result = binary(arr,num,target);
        if (result != -1) {
            System.out.println(result+1);
        } else {
            System.out.println("ELEMENT NOT FOUND");
        }

    }
    
}