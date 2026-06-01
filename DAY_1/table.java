import java.util.Scanner;
public class table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        
        int num = input.nextInt();
        int i=1;
        System.out.println("MULTIPLICATION TABLE OF " + num + " is ");
        while(i<=10){
            int mul = i*num;
            System.out.println(num +" x " + i + " = " + mul);
            i++;
        }
    }
    
}
