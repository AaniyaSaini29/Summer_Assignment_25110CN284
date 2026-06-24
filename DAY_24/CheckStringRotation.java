import java.util.Scanner;

public class CheckStringRotation {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("ENTER THE STRING: ");
         String str1 = input.nextLine();

         System.out.print("ENTER THE STRING: ");
         String str2 = input.nextLine();

         if(str1.length()!=str2.length()){
            System.out.println(" ROTATION NOT HAPPENED");
         }
         else{
            if((str1+str1).contains(str2)){
                System.out.println("ROTATION HAPPENED");
            }
            else{
                System.out.println("ROTATION NOT HAPPENED");
            }
         }


    }
    
}