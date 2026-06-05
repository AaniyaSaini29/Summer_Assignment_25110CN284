import java.util.Scanner;
public class NthFibonacci{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int f1 = 0;
    int f2 = 1;
    
    System.out.print("Enter the term number  ");
    int term = input.nextInt();
    if(term == 1){
        System.out.println(f1);
    }
    else if(term == 2)
    {
        System.out.println(f2);
    }
    else{ 
        int next = 0;
        for(int i=3;i<=term;i++){
        next = f1 + f2;
        f1 = f2;
        f2 = next;
        }
        System.out.println(next);
    }
    }
}