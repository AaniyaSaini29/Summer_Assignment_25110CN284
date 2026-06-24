import java.util.Scanner;

public class maxOccuringChar {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    char c ='\0' ;
    int max=1;

    for(int i =0;i<=str.length()-1;i++){
        int count = 0;
        for(int j =0;j<=str.length()-1;j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        if(count>max){
            max=count;
            c = str.charAt(i);
        }
    }

     if(c=='\0'){
        System.out.print("THERE IS NONE CHARACTER WITH MOST FREQUECY AMONG ALL");
        }
        else{
            System.out.print(" CHARACTER WITH MOST FREQUENCY = "+ c);
        }

    }
    
}