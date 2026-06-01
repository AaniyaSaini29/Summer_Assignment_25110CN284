import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        System.out.print("ENTER ANY NUMBER ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i=1;
         int fact = 1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.print("FACTORIAL OF " + num + " is " + fact);
    }
}