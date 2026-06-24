import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("ENTER THE STRING: ");
        String str = input.nextLine(); 
        str=str.toLowerCase();

        char[] ch = str.toCharArray();
        int count=0;
        int count1=0;
        for(char c : ch){
            if(c>='a' && c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
           
            else{
                count1++;
            }
             
            }
        }
            

            System.out.println("NUMBER OF VOWELS = "+ count);
            System.out.println("NUMBER OF CONSONANTS = "+ count1);

        }
    }
    
