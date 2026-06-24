import java.util.Scanner;

public class MergeArrays {
    public static void InputArray(int[] arr,int num){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.print("ELEMENT"+(i+1)+"=");
            arr[i]=input.nextInt();

            
        }

    }

    public static void PrintArray(int[] arr, int num){
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBERS OF TERMS FOR ARRAY1: ");
        int num1 = input.nextInt();
        int[] arr = new int[num1];
        System.out.println("ENTER THE ELEMENTS OF ARRAY1");
        InputArray(arr,num1);
         System.out.print("ENTER THE NUMBERS OF TERMS FOR ARRAY2: ");
        int num2 = input.nextInt();
        int[] brr = new int[num2];
        System.out.println("ENTER THE ELEMENTS OF ARRAY2");
        InputArray(brr,num2);
        
        System.out.println("GIVEN ARRAY1");
        PrintArray(arr,num1);

         System.out.println("\nGIVEN ARRAY2");
        PrintArray(brr,num2);

        System.out.println("\n MERGED ARRAY: ");
        int[] crr = new int[num1+num2];

        for(int i =0; i<num1;i++){
            crr[i]=arr[i];
        }

        for(int i =num1; i<(num2+num1);i++){
            crr[i]=brr[i-num1];
            
        }

        PrintArray(crr,(num1+num2));

        
    }
    
}