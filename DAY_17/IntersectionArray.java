import java.util.Scanner;

public class IntersectionArray {
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

        System.out.println("\n INTERSECTION OF BOTH ARRAYS: ");
        int num3=0;
        int[] crr= new int[num1+num2];

        for(int i = 0; i<num1; i++){
            boolean exist=false;

            for(int j=0;j<num2;j++){
                if(arr[i]==brr[j]){
                    exist=true;
                    break;
                }
            }
            if(exist){
                crr[num3]=arr[i];
                num3++;
            }
        }
        
         int num=0;
        for(int i = 1; i<num3; i++){
            boolean exist=false;
        for(int j =0;j<=num;j++){
           if(crr[i]==crr[j]){
            exist=true;
            break;
           }   
        }
        if(!exist){
            num++;
            crr[num]=crr[i];
        }

    }

        PrintArray(crr,(num+1));

    }


    
}