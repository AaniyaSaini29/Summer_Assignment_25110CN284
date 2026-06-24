import java.util.Scanner;

public class FactorialFunction {
    public static int fact(int n){
        if(n==0|| n==1){
            return 1;
        }
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
       System.out.print("ENTER THE FIRST NUMBER: ");
       int num= input.nextInt();
       System.out.print("FACTORIAL OF THE NUMBER = "+ fact(num));
    }
    
}