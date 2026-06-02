import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int num = input.nextInt();
        int sum=0;
        int a = 0;
        int i= 1; 
         
        while(i<=num){
        a=num%10;
        sum = a+ sum*10;
        num = num/10;
        }
   System.out.print("REVERSE OF THIS NUMBER IS = " + sum);
}
}