import java.util.Scanner;

public class PairWithGivenSum {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        int[] arr= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("ELEMENT"+(i+1)+" = ");
            arr[i]=input.nextInt();  
        }
        System.out.println("\n GIVEN ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] +" ");
            
        }

        System.out.print("\n ENTER THE SUM ");
        int sum = input.nextInt();
        boolean SumNum= false;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(arr[i]+arr[j]==sum){
                    System.out.println("GIVEN NUMBER IS SUM OF :ELEMENT"+i+" & ELEMENT"+j);
                    System.out.println(arr[i]+"+"+arr[j]+" = "+sum);
                    SumNum=true;
                }
                
            }
            
        }
        if(!SumNum){
            System.out.print("\n GIVEN NUMBER IS NOT THE SUM OF ANY PAIR OF ARRAY");
        }
    }
}
