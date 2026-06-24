import java.util.Scanner;

public class RightRotatedArray {
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
         int temp = arr[num-1];
            
            for(int i = (num-1); i > 0 ; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            
            
        System.out.println("");
         System.out.println("LEFT ROTATED ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
    
}
