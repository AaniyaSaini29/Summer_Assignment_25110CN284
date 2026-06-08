import java.util.Scanner;
public class CountSetBits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To count set bits ");
        System.out.print("Enter the binary number : ");
        int num = input.nextInt();

        int count =0;
        while(num>0){
            int digit = num%10;
            if(digit==1){
                count++;
            }
            else{
                count = count;
            }
            num /=10;
        }

        System.out.print("Total no of set bits are :" +count);
    }
}