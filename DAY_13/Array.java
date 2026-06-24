import java.util.Scanner;

public class Array {
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

    System.out.println("ARRAY:");

    for (int i = 0; i < num; i++) {
        System.out.print(arr[i] +" ");
    }
    
}
}