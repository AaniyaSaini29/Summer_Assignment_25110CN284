import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        int[] arr= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("ELEMENT"+i+" = ");
            arr[i]=input.nextInt();  
        }
        System.out.println("\n GIVEN ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] +" ");
            
        }
        int num1=0;
        for(int i = 1; i<num; i++){
            boolean exist=false;
        for(int j =0;j<=num1;j++){
           if(arr[i]==arr[j]){
            exist=true;
            break;
           }   
        }
        if(!exist){
            num1++;
            arr[num1]=arr[i];
        }

        }
         System.out.println("\n  ARRAY:");
        for (int i = 0; i < (num1+1); i++) {
            System.out.print(arr[i] +" ");
        }   
    }
    
}