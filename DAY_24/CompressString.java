import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
         System.out.print("ENTER THE STRING: ");
         String str = input.nextLine();

         System.out.println("COMPRESSED STRING:");

         for (int i = 0; i < str.length(); i++) {
            int count=1;
            
            while (i < str.length()-1  && str.charAt(i)==str.charAt(i+1)) {
                
                    count++;
                    i++;
                
                
            }
            System.out.print(count + ""+str.charAt(i)+" ");
             
         }
  
    }
    
}