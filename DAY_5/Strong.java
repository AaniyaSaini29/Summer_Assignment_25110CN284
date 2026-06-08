import java.util.Scanner;
public class Strong {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int num = input.nextInt();
        int num1 = num;
        int a = 0;
        int sum =0;
        int fact = 1;
        int c;
        while(num>0){
            c= num%10;
            for (int i = 1; i <=c; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num/10;
            fact = 1;
        }
        if(num1 == sum){
        System.out.println( "IT IS A STRONG NUMBER ");
        }
        else
            System.out.println("IT IS NOT A STRONG NUMBER ");
}
}