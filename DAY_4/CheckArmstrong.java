import java.util.Scanner;
import java.lang.Math;
public class CheckArmstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int digit;
        int sum = 0;
        int i =0;
        
        
        System.out.println("To check whether the no. is Armstrong");
        System.out.println("Enter your number");
        int num = input.nextInt();
        int original = num;
        int temp = num;
        
        while(temp>0){
            digit = temp%10;
            temp = temp/10;
            i++;//no of digits
        }
        
        while(original>0){
            digit = original%10;
            sum +=(int) Math.pow(digit,i);
            original = original/10;
            
        }
       
        if(sum == num){
            
            System.out.print("Given number is Armstrong");
        }
        else{
            System.out.print("Given number is not Armstrong");
        }
    }
}
