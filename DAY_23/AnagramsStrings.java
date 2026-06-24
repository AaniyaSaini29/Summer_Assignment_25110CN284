import java.util.Scanner;

public class AnagramsStrings {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING1: ");
    String str1 = input.nextLine();
    
    System.out.print("ENTER THE STRING2: ");
    String str2 = input.nextLine();
    int count= 0 ;

    if(str1.length()!=str2.length()){
        System.out.println("THESE ARE NOT ANAGRAMS STRING");
    }
    else{
        for (int i = 0; i <= str1.length()-1; i++) {
            for (int j = 0; j <= str2.length()-1; j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                    break;
                }
                
            }
            
        }
    }
    if(count==str1.length()){
        System.out.println("THESE ARE ANAGRAMS STRING" );
    }
    else{
        System.out.println("THESE ARE NOT ANAGRAMS STRING ");
    }

    }


    
    
    
}
