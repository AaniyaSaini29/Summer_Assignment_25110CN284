import java.util.Scanner;
public class RecFibonacci {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To find the nth fibonacci term");
        System.out.print("Enter the the value of n : ");
        int n = input.nextInt();

        System.out.print("The nth fibonacci term is " + Fibo(n));
    }
    public static int Fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2 || n==3){
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}

