import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To convert binary to decimal");
        System.out.print("Enter the binary number : ");
        int num = input.nextInt();
    
        int sum = 0;
        int e = 0;
        while(num>0){
            int digit = num%10;
            sum += digit * Math.pow(2,e);
            num = num/10;
            e++;
        }
        System.out.print("The number in decimal system is : "+sum);

    }
    
}