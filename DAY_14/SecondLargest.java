import java.util.Scanner;

public class SecondLargest {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        
        int[] arr = new int[num]; 
        for(int i = 0; i < num; i++){  
            System.out.print("ELEMENT " + (i+1) + " = ");
            arr[i] = input.nextInt();
        }
        int largest=0;
        int Slargest = 0;
        for(int i=0;i<num;i++){
             if(arr[i]>largest){
                Slargest=largest;  
                largest=arr[i];
            }
           
             else if (arr[i] > Slargest && arr[i] != largest) {
                Slargest = arr[i];
        }  
    }
    System.out.print("SECOND LARGEST TERM = "+Slargest);
  }
}