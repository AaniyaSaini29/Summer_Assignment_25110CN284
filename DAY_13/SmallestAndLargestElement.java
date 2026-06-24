import java.util.Scanner;

public class SmallestAndLargestElement {
      public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER THE NUMBERS OF ELEMENT FOR ARRAY:");
    int num = input.nextInt();
    int[] arr= new int[num];
   
    System.out.println("ENTER THE ELEMENTS OF ARRAY");

    for(int i = 0; i<num ; i++){
        System.out.print(" ELEMENT"+ (i+1) + " = " ) ;
        arr[i] = input.nextInt();
       
    }
     int largest= arr[0];
    int smallest=arr[0];
    for(int i=0 ;i<(num-1);i++){
         if(arr[i]<arr[i+1]){
            largest=arr[i+1];
         }
            else{
            smallest=arr[i+1];
            }
        }
    
    System.out.println("SMALLEST ELEMENT= "+ smallest);
    System.out.println("LARGEST ELEMENT= "+ largest);
}
}