import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER");
        int num = input.nextInt();
        int i=1;
        int a=0;
        int sum=0;
        while(i<=num){
            a=num%10;
            sum += a;
            num = num/10;
            i++;
        }
        System.out.print("SUM OF DIGITS = " + sum );
    }
}
