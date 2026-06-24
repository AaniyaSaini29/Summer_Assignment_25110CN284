import java.util.Scanner;

public class RemoveSpaces {
      public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    char[] ch = str.toCharArray();
    String result = "";
    
    
    for (int i =0 ; i <= str.length()-1; i++) {
        if(str.charAt(i)!=' '){
        result = result + str.charAt(i);
        }
    }
    System.out.print(result);

    }
}