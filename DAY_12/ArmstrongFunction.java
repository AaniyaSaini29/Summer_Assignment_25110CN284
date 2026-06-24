import java.util.Scanner;

public class ArmstrongFunction {
    public static boolean armstrong(int num){
        int num1=num;
        int num2=num;
        int count=0;
        int sum=0;
        while(num>0){
            count++;
            num=num/10;
        }
        while(num1>0){
            sum += (int)Math.pow((num1%10),count);
            num1 /= 10;
        }
        return num2==sum;
    }

     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
       System.out.print("ENTER ANY NUMBER: ");
       int num= input.nextInt();
       if(armstrong(num))
       System.out.print("IT IS AN ARMSTRONG NUMBER ");
       else
        System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
    }
    
}