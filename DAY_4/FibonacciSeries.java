import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int f1 = 0;
    int f2 = 1;
    int next = f1+f2 ;
    
    System.out.print("Enter the total terms of series");
    int term = input.nextInt();
    if(term >= 1){
        System.out.println(f1);
    }
     if(term >= 2)
    {
        System.out.println(f2);
    }
    if(term >= 3){
        for(int i=3;i<=term;i++){
        next = f1 + f2;
        System.out.println(next);
        f1 = f2;
        f2 = next;
        }
    
    }
    }
}
