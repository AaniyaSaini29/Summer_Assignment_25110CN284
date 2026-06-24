import java.util.Scanner;

public class MaxFunction {
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
             return b;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("ENTER THE FIRST NUMBER: ");
       int a= input.nextInt();
       System.out.print("ENTER THE SECOND NUMBER: ");
       int b= input.nextInt();
       System.out.print("MAXIMUM OF THE BOTH NUMBERS = "+ max(a,b));
   }
}
    
