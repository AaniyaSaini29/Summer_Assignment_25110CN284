import java.util.Scanner;
import java.lang.Math;
public class RangeArm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("To print Armstrong number in a Range");

        System.out.print("Enter the lower limit ");
        int l = input.nextInt();
        System.out.print("Enter the upper limit ");
        int u = input.nextInt();
        
        System.out.println("These are the following Armstrong numbers between given range : ");

        
        for(int i=l;i<=u;i++){
            int num = i;
            int terms = 0;
            int sum = 0;
            int original = i;
            
            while(num>0){
                int digit = num%10;
                num = num/10;
                terms++;
                
            } 
            //System.out.print(terms   );

            while(original>0){
                int digit = original%10;
                sum += (int)Math.pow(digit,terms);
                original = original/10;
            }
           // System.out.print(sum  );

            if(i==sum){
                System.out.println(i);
            }
        }


    }
}
