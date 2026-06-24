import java.util.Scanner;

public class PalindromeFunction {
    public static boolean palindrome(int num){
       if (num < 0) {
            return false;
        }

        int Num = num;
        int sum = 0;

        while (num > 0) {
            int p = num % 10;
            sum = (sum * 10) + p;
            num = num / 10;
        }

        return Num == sum;
    
    }

          public static void main(String[] args){
          Scanner input = new Scanner(System.in);
       System.out.print("ENTER ANY NUMBER: ");
       int num= input.nextInt();
       if(palindrome(num))
       System.out.print("IT IS A PALINDROME NUMBER ");
       else
        System.out.println("IT IS NOT A PALNDROME NUMBER");
    }
    
    

}
