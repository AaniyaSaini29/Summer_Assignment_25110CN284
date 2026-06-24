

import java.util.Scanner;

public class MaximumFrequency {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        
        int[] arr = new int[num]; 
        int[] vrr= new int[num];
        for(int i = 0; i < num; i++){  
            System.out.print("ELEMENT " + (i+1) + " = ");
            arr[i] = input.nextInt();
        }
        System.out.println("GIVEN ARRAY:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
            
        }
        int term= 0;
        int max=1;
        for(int i = 0 ; i<num ; i++){
            int count = 0;
            for(int j= 0; j<num;j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
                if(max<count){
                    max=count;
                    term=arr[i];
                }
            }
        }


        if(term==0){
        System.out.print("\nTHERE IS NONE ELEMENT WITH MOST FREQUECY AMONG ALL");
        }
        else{
            System.out.print("\nELEMENT WITH MOST FREQUENCY = "+ term);
        }
     
    }
}
}
