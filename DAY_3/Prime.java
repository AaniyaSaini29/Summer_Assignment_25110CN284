import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int num = input.nextInt();
        int count=0;
        int c;
        int i=1;
        while (i<=num){
            c= num%i;
            if(c==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.print("IT IS A PRIME NUMBER");
        }
        else{
            System.out.print("IT IS NOT A PRIME NUMBER");
        }
    }
}