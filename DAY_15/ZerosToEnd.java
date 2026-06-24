import java.util.Scanner;

public class ZerosToEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        
        int[] arr = new int[num]; 
        for(int i = 0; i < num; i++){  
            System.out.print("ELEMENT " + (i+1) + " = ");
            arr[i] = input.nextInt();
        }
        System.out.println("GIVEN ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
            
        }
        int j=0;
        for(int i=0; i<(num-1);i++){
            if(arr[i]!=0){
              arr[j]=arr[i];
              j++;
              }
            }
            System.out.println("");
             System.out.println("AFTER PUTING ALL ZEROS TO END , ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}