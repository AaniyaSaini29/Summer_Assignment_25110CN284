import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str= input.nextLine();
    char[] ch = str.toCharArray();
    int count = 0;

    for(char c: ch){
        count++;
    }

    System.out.println("LENGTH OF STRING= "+count);




    }

}
