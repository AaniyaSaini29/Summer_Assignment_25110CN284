import java.util.Scanner;
public class RepeatedNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" REPEATED NUMBER ");
        System.out.print("Enter the no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the no. of columns: ");
        int column = input.nextInt();
        

        for(int i = 1;i<=row;i++){
            for(int j =1;j<=i ;j++){
                System.out.print(i);
            }
        
            System.out.println();
        }
    }
}

