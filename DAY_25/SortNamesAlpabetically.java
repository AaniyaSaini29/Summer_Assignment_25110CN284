import java.util.Scanner;

public class SortNamesAlpabetically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOR NAME: ");
        String str = input.nextLine();

        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - i - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }

        System.out.println("Word in alphabetical order: " + new String(ch));

        
    }
    
}
