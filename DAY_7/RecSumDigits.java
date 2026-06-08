import java.util.Scanner;
public class RecSumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To find the sum of digits");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        
        System.out.print("The sum of digits of number is "+Sum(num));
    }
    public static int Sum(int num){
        if(num==0){
            return 0;
        }
        int digit = num%10;
        num = num/10;
        
        return digit + Sum( num);
    }
}
