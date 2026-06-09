import java.util.Scanner;
public class RepeatedChar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" REPEATED CHARACTER ");
        System.out.print("Enter the no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the no. of columns: ");
        int column = input.nextInt();
        
        char c = 'A';
        for(int i = 1;i<=row;i++){
            for(int j =1;j<=i ;j++){
                System.out.print(c);
            }
            
        
            System.out.println();
            c++;
        }
    }
}

