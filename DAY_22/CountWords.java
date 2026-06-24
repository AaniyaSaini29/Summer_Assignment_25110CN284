import java.util.Scanner;

public class CountWords {
      public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    char[] ch= str.toCharArray();
    int count=0;

    for(char c : ch){
        if(c==' '){
            count++;
        }
    }

    System.out.println("NUMBER OF WORDS IN SENTENCE= "+ (count+1));


    }
    
}
