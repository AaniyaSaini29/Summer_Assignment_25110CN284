import java.util.Scanner;

public class SumFunction {
   public static int sum(int a, int b){
    return a+b;
   } 

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("ENTER THE FIRST NUMBER: ");
       int a= input.nextInt();
       System.out.print("ENTER THE SECOND NUMBER: ");
       int b= input.nextInt();
       System.out.print("SUM OF THE NUMBERS = "+ sum(a,b));
   }
}