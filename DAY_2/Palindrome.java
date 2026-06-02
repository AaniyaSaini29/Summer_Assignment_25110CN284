import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int num = input.nextInt();
        int c = num;
         int sum=0;
        int a = 0;
         int i= 1; 
         
        while(i<=num){
        a=num%10;
        sum =sum*10 + a;
        num = num/10;
        }
        if(c == sum){
            System.out.print("GIVEN NUMBER IS PALINDROME" );
        }
        else{
             System.out.print("GIVEN NUMBER IS NOT PALINDROME");
        }
    }
    
}
