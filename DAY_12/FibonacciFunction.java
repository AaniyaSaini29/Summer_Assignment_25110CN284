import java.util.Scanner;

public class FibonacciFunction {

    public static void fibonacci(int terms) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(num1 + " ");

            int a = num1 + num2;
            num1 = num2;
            num2 = a;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF TERMS: ");
        int terms = input.nextInt();
        System.out.println("FIBONACCI SERIES: ");

        fibonacci(terms);
    }
}