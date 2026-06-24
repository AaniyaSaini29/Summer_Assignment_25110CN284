import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("ENTER THE STRING: ");
         String str = input.nextLine();

         str=str.toLowerCase();
          String[] words = str.split("\\s+"); 

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word = " + longest);
        
    }
    
}
