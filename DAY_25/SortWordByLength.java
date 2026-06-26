import java.util.Scanner;

public class SortWordByLength {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("ENTER THE STRING: ");
         String str = input.nextLine();

         str=str.toLowerCase();
          String[] words = str.split("\\s+"); 

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.print(word + " " );
        }
        
    }
    
}