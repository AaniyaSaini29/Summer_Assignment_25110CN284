import java.util.Scanner;

public class MissingNumber {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        int sum=0;
        
        int[] arr = new int[num]; 
        for(int i = 0; i < num; i++){  
            System.out.print("ELEMENT " + (i+1) + " = ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        System.out.println("GIVEN ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
            
        }
         int sum2= (num*(num+1))/2;
         System.out.print("\n MISSING NUMBER = " + (sum-sum2));

     }
    
}