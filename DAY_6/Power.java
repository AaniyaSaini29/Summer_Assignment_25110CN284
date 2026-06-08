import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base : ");
        int b = input.nextInt();

        System.out.print("Enter the exponent : ");//only for positive exponent;
        int e = input.nextInt();

        int result = 1;

        for(int i = 1; i<= e ;i++){
            result = result*b;
        }

        System.out.print("The "+e+ " power of " +b+ " is "+result);


    }
}