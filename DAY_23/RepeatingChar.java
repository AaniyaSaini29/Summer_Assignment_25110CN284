import java.util.Scanner;

public class RepeatingChar {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    char[] ch = str.toCharArray();
    System.out.print("FIRST  REPEATING CHARACTER: ");
    
    
    
    for (int i =0 ; i <= str.length()-1; i++) {
            boolean duplicate = false;
            
                boolean checked = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    checked = true;
                    break;
                }
            }
            
            if (!checked) {
                for (int j = i + 1; j < str.length()-1; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        duplicate = true;
                        break;
                    }
                }
            }
            
            if (duplicate) {
                System.out.print(str.charAt(i) );
                break;
            }
        }
        

}
}
