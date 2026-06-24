import java.util.Scanner;
public class EvenOddElements {
      public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER THE NUMBERS OF ELEMENT FOR ARRAY:");
    int num = input.nextInt();
    int[] arr= new int[num];
    int countOdd=0;
    int countEven=0;
   
    System.out.println("ENTER THE ELEMENTS OF ARRAY");

    for(int i = 0; i<num ; i++){
        System.out.print(" ELEMENT"+ (i+1) + " = " ) ;
        arr[i] = input.nextInt();
         if(arr[i]%2==0){
            countEven++;
         }
            else{
            countOdd++;
            }
        }
    
    System.out.println("NUMBER OF EVEN ELEMENTS= "+ countEven);
    System.out.println("NUMBER OF ODD ELEMENTS= "+ countOdd);
}
}