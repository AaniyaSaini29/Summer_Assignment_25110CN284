import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("ENTER THE STRING: ");
         String str = input.nextLine();

         str=str.toLowerCase();

         String result ="";


         int num1=0;
        for(int i = 1; i<str.length(); i++){
            boolean exist=false;
            char c = str.charAt(i);
        for(int j =0;j<=num1;j++){
           if(str.charAt(i)==str.charAt(j)){
            exist=true;
            break;
           }   
        }
        if(!exist){
            num1++;
            result+=c;
        }

        }
        System.out.println("STRING AFTER REMOVING DUPLICATE CHARACTERS:");
       
            System.out.print(result);
            
        
    }
    
}