import java.util.Scanner;

public class CharacterFequency {
      public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    System.out.print("ENTER THE CAHRACTER: ");
    char ch= input.next().charAt(0);

    int count = 0;

    for(int i =0;i<=str.length()-1;i++){
        
            if(ch==str.charAt(i)){
                count++;
            }
        }
        
        System.out.println("FREQUENCY OF "+ ch+ " = "+ count);
        
    }

    }

    
