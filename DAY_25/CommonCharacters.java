import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER FIRST STRING: ");
        String str1 = input.nextLine();

        System.out.print("ENTER SECOND STRING: ");
        String str2 = input.nextLine();

        System.out.print("COMMON CHARACTERS: ");

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (str1.charAt(k) == c) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                for (int j = 0; j < str2.length(); j++) {
                    if (c == str2.charAt(j)) {
                        System.out.print(c + " ");
                        break;
                    }
                }
            }
        }
    }
}
