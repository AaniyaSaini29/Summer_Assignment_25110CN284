import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    String reversed = "" ;

     for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("REVERSED STRING: "+reversed);
    }    
    
}