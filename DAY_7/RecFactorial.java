import java.util.Scanner;
public class RecFactorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To find the factorial of given number");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.print("The factorial of given number is : "+ factorial(num));
    }
    public  static int factorial( int num){
        if(num<=1){
            return 1;
        }//base case
        
        return num *factorial(num -1);
    }
}