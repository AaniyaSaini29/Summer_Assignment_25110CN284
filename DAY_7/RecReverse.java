import java.util.Scanner;
public class RecReverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To reverse the entered number");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.print("The reverse of number is "+Reverse(num,0));
    }
    public static int Reverse(int num,int r){
        if(num==0){
            return r;
        }
        r = r*10 + num%10;
        return Reverse(num/10,r);
    }
}