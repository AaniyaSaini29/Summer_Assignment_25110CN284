import java.util.Scanner;

public class PalindromeString {
     public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    String rev = "" ;

     for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(rev.equals(str)){
         System.out.println("PALINDROME STRING");
        }
        else{
            System.out.println("NOT A PALINDROME STRING");
        }

       
    } 
    
}
