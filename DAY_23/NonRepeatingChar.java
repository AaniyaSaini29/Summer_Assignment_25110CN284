import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean repeating = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeating = true;
                    break;
                }
            }

            if (!repeating) {
                System.out.println("FIRST NON-REPEATING CHARACTER = " + str.charAt(i));
                return;
            }
        }

        System.out.println("NO NON-REPEATING CHARACTER FOUND.");
    }
}