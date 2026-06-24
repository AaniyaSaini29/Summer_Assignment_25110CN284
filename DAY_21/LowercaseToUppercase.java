import java.util.Scanner;

public class LowercaseToUppercase {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str= input.nextLine();

    char[] ch = str.toCharArray();
    String result="";

    for(char c: ch){
        if(c>='a'&&c<='z'){
            c=(char)(c-32);
        }
        result+= c;
    }

    System.out.println("STRING IN UPPERCASE: "+ result);

        
    }
  
    
}