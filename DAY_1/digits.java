import java.util.Scanner;
public class digits {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER ANY NUMBER ");
    int num = input.nextInt();
    int count= 0;
    int a = 0;
    int i = 1;
    while(i<=num){
     a = num%10;
     if (a!=0) {
         count += 1;
     }
     num= num / 10;
     i++;
    }
        System.out.print("NO. OF DIGITS = " + count);
    
}
}
