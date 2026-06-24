import java.util.Scanner;

public class SumAvgArray {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER THE NUMBERS OF ELEMENT FOR ARRAY:");
    int num = input.nextInt();
    int[] arr= new int[num];
    int sum= 0;
    int avg=0;
    System.out.println("ENTER THE ELEMENTS OF ARRAY");

    for(int i = 0; i<num ; i++){
        System.out.print(" ELEMENT"+ (i+1) + " = " ) ;
        arr[i] = input.nextInt();
        sum+= arr[i];
    }

    avg = sum/num;
    System.out.println("SUM OF ALL ELEMENTS OF ARRAY = "+sum);
    System.out.println("AVERAGE OF ALL ELEMENTS OF ARRAY = "+avg);
}
}