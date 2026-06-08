import java.util.Scanner;
public class LargestPrimeFactor{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER:");
        int num = input.nextInt();
        int i=2;
        int factor;
        while(i*i<=num){
            if(num%i==0){
                factor= i ;
                num = num/i;
            }
            else 
                i++;
        }
        
        System.out.print("THE LARGEST PRIME FACTOR OF GIVEN NUMBER IS : " + num);
    }
}