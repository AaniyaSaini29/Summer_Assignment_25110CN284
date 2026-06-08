import java.util.Scanner;
public class DecToBinary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To conver decimal to binary System");

        System.out.print("Enter the decimal number : ");
        int dec = input.nextInt();

        int[] binary = new int[32];
        int index = 0;

        while(dec>0){
            binary[index] = dec%2;
            index++;
            dec = dec/2;
        }

        System.out.print("number in bianry is  ");
        for(int i = index-1 ; i>=0; i--){
            System.out.print(binary[i]);
        }


    }
}
