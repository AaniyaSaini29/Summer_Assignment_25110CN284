import java.util.Scanner;
public class LCM {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("ENTER First NUMBER ");
        int num1 = input.nextInt();
        System.out.print("ENTER Second NUMBER ");
        int num2 = input.nextInt();
        int prd= num1*num2;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int result= prd/num1;
      System.out.print("LCM OF GIVEN NUMBER IS "+ result );
    
}
}
