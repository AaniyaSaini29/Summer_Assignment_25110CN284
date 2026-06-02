import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int num = input.nextInt();
        int prd = 1;
        int a;
        for(int i = 1; i<=num;i++){
            a= num%10;
            prd = prd * a;
            num = num/10;
        }
        System.out.print("PRODUCT OF DIGITS OF GIVEN NUMBER = " + prd);
    }
}
