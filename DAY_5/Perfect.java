import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int num = input.nextInt();
        int a = 0;
        int sum =0;
        for(int i =1; i<num; i++){
            a =num%i;
            if(a==0){
                sum = sum +i;
            }
        }
        if(num == sum){
            System.out.println("IT IS A PERFECT NUMBER");
        }
        else
            System.out.println("IT IS NOT A PERFECT NUMBER" );
    }
}
